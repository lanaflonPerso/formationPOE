package com.m2i.genome;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ribosome {

    public Ribosome() {
    }

    private AminoAcid translateCodon(String codon) {
        AminoAcid aminoAcid = new AminoAcid();
        HashMap<String, String[]> codonMap = new HashMap<>();
        String[] f = {"F", "Phe", "Phenilalanine"};
        String[] l = {"L", "Leu", "Leucine"};
        String[] i = {"I", "Ile", "Isoleucine"};
        String[] m = {"M", "Met", "Methionine"};
        String[] v = {"V", "Val", "Valine"};
        String[] s = {"S", "Ser", "Serine"};
        String[] p = {"P", "Pro", "Proline"};
        String[] t = {"T", "Thr", "Threonine"};
        String[] a = {"A", "Ala", "Alanine"};
        String[] y = {"Y", "Tyr", "Tyrosine"};
        String[] vide = {" ", " ", " "};
        String[] h = {"H", "Hys", "Histidine"};
        String[] q = {"Q", "Gln", "Glutamine"};
        String[] n = {"N", "Asn", "Aspargine"};
        String[] k = {"K", "Lys", "Lysine"};
        String[] d = {"D", "Asp", "Aspartic acid"};
        String[] e = {"E", "Glu", "Glutamic acid"};
        String[] c = {"C", "Cys", "Cysteine"};
        String[] w = {"W", "Trp", "Tryptophan"};
        String[] r = {"R", "Arg", "Arginine"};
        String[] g = {"G", "Gly", "Glycine"};
        codonMap.put("UUU", f);
        codonMap.put("UUC", f);
        codonMap.put("UUA", l);
        codonMap.put("UUG", l);
        codonMap.put("CUU", l);
        codonMap.put("CUC", l);
        codonMap.put("CUA", l);
        codonMap.put("CUG", l);
        codonMap.put("AUU", i);
        codonMap.put("AUC", i);
        codonMap.put("AUA", i);
        codonMap.put("AUG", m);
        codonMap.put("GUU", v);
        codonMap.put("GUC", v);
        codonMap.put("GUA", v);
        codonMap.put("GUG", v);
        codonMap.put("UCU", s);
        codonMap.put("UCC", s);
        codonMap.put("UCA", s);
        codonMap.put("UCG", s);
        codonMap.put("CCU", p);
        codonMap.put("CCC", p);
        codonMap.put("CCA", p);
        codonMap.put("CCG", p);
        codonMap.put("ACU", t);
        codonMap.put("ACC", t);
        codonMap.put("ACA", t);
        codonMap.put("ACG", t);
        codonMap.put("GCU", a);
        codonMap.put("GCC", a);
        codonMap.put("GCA", a);
        codonMap.put("GCG", a);
        codonMap.put("UAU", y);
        codonMap.put("UAC", y);
        codonMap.put("UAA", vide);
        codonMap.put("UAG", vide);
        codonMap.put("CAU", h);
        codonMap.put("CAC", h);
        codonMap.put("CAA", q);
        codonMap.put("CAG", q);
        codonMap.put("AAU", n);
        codonMap.put("AAC", n);
        codonMap.put("AAA", k);
        codonMap.put("AAG", k);
        codonMap.put("GAU", d);
        codonMap.put("GAC", d);
        codonMap.put("GAA", e);
        codonMap.put("GAG", e);
        codonMap.put("UGU", c);
        codonMap.put("UGC", c);
        codonMap.put("UGA", vide);
        codonMap.put("UGG", w);
        codonMap.put("CGU", r);
        codonMap.put("CGC", r);
        codonMap.put("CGA", r);
        codonMap.put("CGG", r);
        codonMap.put("AGU", s);
        codonMap.put("AGC", s);
        codonMap.put("AGA", r);
        codonMap.put("AGG", r);
        codonMap.put("GGU", g);
        codonMap.put("GGC", g);
        codonMap.put("GGA", g);
        codonMap.put("GGG", g);
        aminoAcid.setSymbol(codonMap.get(codon)[0].charAt(0));
        aminoAcid.setTrigram(codonMap.get(codon)[1]);
        aminoAcid.setName(codonMap.get(codon)[2]);
        return aminoAcid;
    }

    public List<AminoAcid> translate(RNA rna) {
        String tempString = "";
        ArrayList<AminoAcid> aminoAcids = new ArrayList<>();
        for (Nucleobase nucleobase : rna.getStrand()) {
            tempString += nucleobase.getSymbol();
        }
        for (int i = 0; i < tempString.length() - 2; i += 3) {
            aminoAcids.add(translateCodon(tempString.substring(i, i + 3)));
        }
        return aminoAcids;
    }
}

