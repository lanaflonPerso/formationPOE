package com.m2i.genome;

import java.util.ArrayList;
import java.util.List;

public abstract class Nucleotide {
    private List<Nucleobase> strand = new ArrayList<>();

    public Nucleotide(){};

    public List<Nucleobase> getStrand(){
        return strand;
    }

    abstract public String toString();
}
