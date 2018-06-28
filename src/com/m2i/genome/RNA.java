package com.m2i.genome;

import java.util.ArrayList;

public class RNA {
    private ArrayList<Nucleobase> strand = new ArrayList<>();

    public RNA() {
    }


    public void addNucleobase(Nucleobase nucleobase) {
        strand.add(nucleobase);
    }

    public AminoAcid translateCodon(String codon) {
        AminoAcid aminoAcid = new AminoAcid();
        switch (codon) {
            case "GCU":
            case "GCC":
            case "GCA":
            case "GCG":
                aminoAcid.setSymbol('A');
                aminoAcid.setTrigram("Ala");
                aminoAcid.setName("Alanine");
                break;
            case "CGU":
            case "CGC":
            case "CGA":
            case "CGG":
            case "AGA":
            case "AGG":
                aminoAcid.setSymbol('R');
                aminoAcid.setTrigram("Arg");
                aminoAcid.setName("Arginine");
                break;
            case "AAU":
            case "AAC":
                aminoAcid.setSymbol('N');
                aminoAcid.setTrigram("Asn");
                aminoAcid.setName("Asparagine");
                break;
            case "GAU":
            case "GAC":
                aminoAcid.setSymbol('D');
                aminoAcid.setTrigram("Asp");
                aminoAcid.setName("Aspartic acid");
                break;
            case "UGU":
            case "UGC":
                aminoAcid.setSymbol('C');
                aminoAcid.setTrigram("Cys");
                aminoAcid.setName("Cysteine");
                break;
            case "GAA":
            case "GAG":
                aminoAcid.setSymbol('E');
                aminoAcid.setTrigram("Glu");
                aminoAcid.setName("Glutamic acid");
                break;
            case "CAA":
            case "CAG":
                aminoAcid.setSymbol('Q');
                aminoAcid.setTrigram("Gln");
                aminoAcid.setName("Glutamine");
                break;
            case "GGU":
            case "GGC":
            case "GGA":
            case "GGG":
                aminoAcid.setSymbol('G');
                aminoAcid.setTrigram("Gly");
                aminoAcid.setName("Glycine");
                break;
            case "CAU":
            case "CAC":
                aminoAcid.setSymbol('H');
                aminoAcid.setTrigram("His");
                aminoAcid.setName("Histidine");
                break;
            case "AUU":
            case "AUC":
            case "AUA":
                aminoAcid.setSymbol('I');
                aminoAcid.setTrigram("Ile");
                aminoAcid.setName("Isoleucine");
                break;
            case "UUA":
            case "UUG":
            case "CUU":
            case "CUC":
            case "CUA":
            case "CUG":
                aminoAcid.setSymbol('L');
                aminoAcid.setTrigram("Leu");
                aminoAcid.setName("Leucine");
                break;
            case "AAA":
            case "AAG":
                aminoAcid.setSymbol('K');
                aminoAcid.setTrigram("Lys");
                aminoAcid.setName("Lysine");
                break;
            case "AUG":
                aminoAcid.setSymbol('M');
                aminoAcid.setTrigram("Met");
                aminoAcid.setName("Methionine");
                break;
            case "UUU":
            case "UUC":
                aminoAcid.setSymbol('F');
                aminoAcid.setTrigram("Phe");
                aminoAcid.setName("Phenilalanine");
                break;
            case "CCU":
            case "CCC":
            case "CCA":
            case "CCG":
                aminoAcid.setSymbol('P');
                aminoAcid.setTrigram("Pro");
                aminoAcid.setName("Proline");
                break;
            case "UCU":
            case "UCC":
            case "UCA":
            case "UCG":
            case "AGU":
            case "AGC":
                aminoAcid.setSymbol('S');
                aminoAcid.setTrigram("Ser");
                aminoAcid.setName("Serine");
                break;
            case "ACU":
            case "ACC":
            case "ACA":
            case "ACG":
                aminoAcid.setSymbol('T');
                aminoAcid.setTrigram("Thr");
                aminoAcid.setName("Threonine");
                break;
            case "UGA":
            case "UGG":
                aminoAcid.setSymbol('W');
                aminoAcid.setTrigram("Trp");
                aminoAcid.setName("Tryptophan");
                break;
            case "UAU":
            case "UAC":
                aminoAcid.setSymbol('Y');
                aminoAcid.setTrigram("Tyr");
                aminoAcid.setName("Tyrosine");
                break;
            case "GUU":
            case "GUC":
            case "GUA":
            case "GUG":
                aminoAcid.setSymbol('V');
                aminoAcid.setTrigram("Val");
                aminoAcid.setName("Valine");
                break;
            case "UAG":
                aminoAcid.setSymbol('O');
                aminoAcid.setTrigram("Pyl");
                aminoAcid.setName("Pyrrolysine");
        }
        return aminoAcid;
    }

    public ArrayList<AminoAcid> translate() {
        String tempString = new String();
        ArrayList<AminoAcid> aminoAcids = new ArrayList<>();
        for (Nucleobase nucleobase : strand) {
            tempString += nucleobase.getSymbol();
        }
        for (int i = 0; i < tempString.length() - 2; i += 3) {
            aminoAcids.add(translateCodon(tempString.substring(i, i + 3)));
        }
        return aminoAcids;
    }

    public String toString() {
        return strand.toString();
    }
}
