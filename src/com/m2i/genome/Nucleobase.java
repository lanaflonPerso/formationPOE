package com.m2i.genome;

public class Nucleobase {
    private char symbol;
    private String name;
    private String family;
    private char match;
    private boolean dna = true;
    private boolean rna = false;


    public Nucleobase(char symbol) {
        this.symbol = symbol;
        nameFamily(symbol);
    }

    public Nucleobase(char symbol, boolean rna) {
        this.dna = false;
        this.rna = true;
        this.symbol = symbol;
        nameFamily(symbol);
    }

    private void nameFamily(char symbol) {
        switch (symbol) {
            case 'A':
                name = "Adenine";
                family = "Purine";
                if (isDna()) {
                    match = 'T';
                }
                if (isRna()) {
                    match = 'U';
                }
                break;
            case 'G':
                name = "Guanine";
                family = "Purine";
                match = 'C';
                break;
            case 'T':
                if (isRna() == true) {
                    this.symbol = 'U';
                    name = "Uracil";
                    family = "Pyrimidine";
                    match = 'A';
                    break;
                }
                name = "Thymine";
                family = "Pyrimidine";
                match = 'A';
                break;
            case 'U':
                name = "Uracil";
                family = "Pyrimidine";
                match = 'A';
                break;
            case 'C':
                name = "Cytosine";
                family = "Pyrimidine";
                match = 'G';
                break;
            default:
                name = "Invalid";
        }
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getFamily() {
        return family;
    }

    public void matchNucleobase() {
        this.symbol = this.match;
        nameFamily(this.getSymbol());
    }

    public void setStrandRNA() {
        rna = true;
        dna = false;
    }

    public void setStrandDNA() {
        dna = true;
        rna = false;
    }

    public String toString() {
        return getSymbol() + " ";
    }

    public boolean isDna() {
        return dna;
    }

    public boolean isRna() {
        return rna;
    }
}
