package com.m2i.genome;

public class Nucleobase {
    private char symbol;
    private String name;
    private String family;

    public Nucleobase(char symbol) {
        this.symbol = symbol;
        switch (this.symbol) {
            case 'A':
                name = "Adenine";
                family = "Purine";
                break;
            case 'G':
                name = "Guanine";
                family = "Purine";
                break;
            case 'T':
                name = "Thymine";
                family = "Pyrimidine";
                break;
            case 'U':
                name = "Uracil";
                family = "Pyrimidine";
                break;
            case 'C':
                name = "Cytosine";
                family = "Pyrimidine";
                break;
            default:
                name = "Invalid";
        }

    }

    public String getName() {
        return name;
    }

    private String setName(char symbol) {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String toString() {
        return symbol + " - " + name;
    }
}
