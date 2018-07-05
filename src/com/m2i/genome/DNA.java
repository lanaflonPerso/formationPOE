package com.m2i.genome;

import java.util.ArrayList;
import java.util.List;

public class DNA extends Nucleotide {
    private List<Nucleobase> strand = new ArrayList<>();

    public DNA(){}
    public DNA(String name) {
        strandFill(name.toUpperCase());
    }

    private void strandFill(String name) {
        for (int i = 0; i < name.length(); i++) {
            getStrand().add(new Nucleobase(name.charAt(i)));
        }
    }

    @Override
    public List<Nucleobase>  getStrand() {
        return strand;
    }

    public String getComplementaryStrand() {
        ArrayList<Nucleobase> tempArray = new ArrayList<>();
        String string = "";
        for (Nucleobase nucleobase : strand) {
            tempArray.add(new Nucleobase(nucleobase.getSymbol()));
        }
        for (Nucleobase nucleobase : tempArray) {
            nucleobase.matchNucleobase();
            string += nucleobase.getSymbol();
        }

        return string;
    }

    public RNA transcription() {
        RNA rna = new RNA();
        for (Nucleobase nucleobase : strand) {
            Nucleobase nucleobase1 = new Nucleobase(nucleobase.getSymbol());
            nucleobase1.matchNucleobase();
            rna.addNucleobase(new Nucleobase(nucleobase1.getSymbol(), true));
        }
        return rna;
    }

    public String toString() {
        return getStrand().toString();
    }

}

