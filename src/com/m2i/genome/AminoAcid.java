package com.m2i.genome;

public class AminoAcid {
    private char symbol;
    private String trigram;
    private String name;

    public AminoAcid() {

    }

    public AminoAcid(char symbol, String trigram, String name) {
        this.setSymbol(symbol);
        this.setTrigram(trigram);
        this.setName(name);
    }


    public char getSymbol() {
        return symbol;
    }

    public String getTrigram() {
        return trigram;
    }

    public String getName() {
        return name;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setTrigram(String trigram) {
        this.trigram = trigram;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return Character.toString(getSymbol());
    }
}