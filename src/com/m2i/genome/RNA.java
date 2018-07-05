package com.m2i.genome;


import java.util.ArrayList;
import java.util.List;

public class RNA extends Nucleotide {

    private List<Nucleobase> strand = new ArrayList<>();

    public RNA() {
    }

    @Override
    public List<Nucleobase> getStrand() {
        return strand;
    }

    public void addNucleobase(Nucleobase nucleobase) {
        getStrand().add(nucleobase);
    }

    @Override
    public String toString() {
        return getStrand().toString();
    }
}
