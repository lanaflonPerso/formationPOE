package com.m2i.genome;

public class AminoAcid {
    private char symbol;
    private String trigram;
    private String name;

    public AminoAcid(){

    }

    public AminoAcid(char symbol, String trigram, String name){
        this.setSymbol(symbol);
        this.setTrigram(trigram);
        this.setName(name);

// UAA UAG

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

    public String toString(){
        return getTrigram().toString();
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
}
//
//switch(codon)
//        {
//        case "GCU":
//        case "GCC":
//        case "GCA":
//        case "GCG":
//        symbol = 'A';
//        trigram = "Ala";
//        name = "Alanine";
//        break;
//        case "CGU":
//        case "CGC":
//        case "CGA":
//        case "CGG":
//        case "AGA":
//        case "AGG":
//        symbol = 'R';
//        trigram = "Arg";
//        name = "Arginine";
//        break;
//        case "AAU":
//        case "AAC":
//        symbol = 'N';
//        trigram = "Asn";
//        name = "Asparagine";
//        break;
//        case "GAU":
//        case "GAC":
//        symbol = 'D';
//        trigram = "Asp";
//        name = "Aspartic acid";
//        break;
//        case "UGU":
//        case "UGC":
//        symbol = 'C';
//        trigram = "Cys";
//        name = "Cysteine";
//        break;
//        case "GAA":
//        case "GAG":
//        symbol = 'E';
//        trigram = "Glu";
//        name = "Glutamic acid\t";
//        break;
//        case "CAA":
//        case "CAG":
//        symbol = 'Q';
//        trigram = "Gln";
//        name = "Glutamine";
//        break;
//        case "GGU":
//        case "GGC":
//        case "GGA":
//        case "GGG":
//        symbol = 'G';
//        trigram = "Gly";
//        name = "Glycine";
//        break;
//        case "CAU":
//        case "CAC":
//        symbol = 'H';
//        trigram = "His";
//        name = "Histidine";
//        break;
//        case "AUU":
//        case "AUC":
//        case "AUA" :
//        symbol = 'I';
//        trigram = "Ile";
//        name = "Isoleucine";
//        break;
//        case "UUA":
//        case "UUG":
//        case "CUU":
//        case "CUC":
//        case "CUA":
//        case "CUG":
//        symbol = 'L';
//        trigram = "Leu";
//        name = "Leucine";
//        break;
//        case "AAA":
//        case "AAG":
//        symbol = 'K';
//        trigram = "Lys";
//        name = "Lysine";
//        break;
//        case "AUG":
//        symbol = 'M';
//        trigram = "Met";
//        name = "Methionine";
//        break;
//        case "UUU" :
//        case "UUC" :
//        symbol = 'F';
//        trigram = "Phe";
//        name = "Phenylalanine";
//        break;
//        case "CCU":
//        case "CCC":
//        case "CCA":
//        case "CCG":
//        symbol = 'P';
//        trigram = "Pro";
//        name = "Proline";
//        break;
//        case "UCU":
//        case "UCC":
//        case "UCA":
//        case "UCG":
//        case "AGU":
//        case "AGC":
//        symbol = 'S';
//        trigram = "Ser";
//        name = "Serine";
//        break;
//        case "ACU":
//        case "ACC":
//        case "ACA":
//        case "ACG":
//        symbol = 'T';
//        trigram = "Thr";
//        name = "Threonine";
//        break;
//        case "UGA":
//        case "UGG":
//        symbol = 'W';
//        trigram = "Trp";
//        name = "Tryptophan";
//        break;
//        case "UAU":
//        case "UAC":
//        symbol = 'Y';
//        trigram = "Tyr";
//        name = "Tyrosine";
//        break;
//        case "GUU":
//        case "GUC":
//        case "GUA":
//        case "GUG":
//        symbol = 'V';
//        trigram = "Val";
//        name = "Valine";
//        break;