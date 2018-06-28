package com.m2i.genome;

import java.util.ArrayList;

public class RNA {
    private ArrayList<Nucleobase> strand = new ArrayList<>();


    public RNA(ArrayList<Nucleobase> dnaStrand) {
        for (Nucleobase nucleobase : dnaStrand) {
            strand.add(new Nucleobase(nucleobase.getSymbol(), true));
        }
    }

//    public String getRNA(){
//
//    }

    public ArrayList<String> getCodon() {
        String string = new String();
        ArrayList<String> codon = new ArrayList<>();
        for (Nucleobase nucleobase : strand) {
            nucleobase.matchNucleobase();
            string += nucleobase.getSymbol();
        }
        for (int i = 0; i < string.length()-2; i += 3) {
            codon.add(string.substring(i, i + 3));
        }
        return codon;
    }

    public ArrayList<AminoAcid> translate(){
        ArrayList<String> tempCodon = getCodon();
        ArrayList<AminoAcid> aminoAcids = new ArrayList<>();
        for (String codon: tempCodon) {
            aminoAcids.add(new AminoAcid(codon));
        }
        return aminoAcids;
    }

    public String toString() {
        return strand.toString();
    }
}
