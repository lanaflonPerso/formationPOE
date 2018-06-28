package com.m2i.genome;

import java.util.ArrayList;

public class DNA {
    private ArrayList<Nucleobase> strand = new ArrayList<>();
//    private ArrayList<Nucleobase> complementaryStrand = new ArrayList<>();

    public DNA(String name){
//        boolean validname = true;
//        for (int i = 0; i < name.length() ; i++ ){
//            char tempChar = name.charAt(i);
//            if (tempChar != 'A' || tempChar != 'T' || tempChar != 'C' || tempChar != 'G'){
//                validname = false;
//                break;
//            }
//        }

        strandFill(name.toUpperCase());
    }

    private void strandFill(String name){
        for (int i = 0 ; i < name.length(); i++){
            getStrand().add(new Nucleobase(name.charAt(i)));
        }
    }

    public ArrayList<Nucleobase> getStrand() {
        return strand;
    }

    public String getComplementaryStrand(){
        ArrayList<Nucleobase> tempArray= new ArrayList<>();
        String string = new String();
        for(Nucleobase nucleobase : strand){
            tempArray.add(new Nucleobase(nucleobase.getSymbol()));
        }
        for(Nucleobase nucleobase : tempArray){
            nucleobase.matchNucleobase();
            string += nucleobase.getSymbol();
        }

        return string;
    }

    public String toString(){
        return "DNA sequence " + '\n' + getStrand() + '\n';
    }

}

