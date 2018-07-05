package com.m2i.genome;

import java.util.ArrayList;
import java.util.List;

public class Protein {
    private List<AminoAcid> aminoAcidList = new ArrayList<>();

    public Protein() {
    }

    public Protein(List<AminoAcid> aminoAcidList) {
        this.aminoAcidList = aminoAcidList;
    }

    private boolean isProtein(List<AminoAcid> aminoAcidList) {
        return aminoAcidList.size() > 50;
    }

    private void addAminoAcid(AminoAcid aminoAcid) {
        aminoAcidList.add(aminoAcid);
    }

    public List<AminoAcid> getAminoAcidList() {
        return aminoAcidList;
    }

    public List<Protein> factory(List<AminoAcid> aminoAcidList) {
        List<Protein> proteinList = new ArrayList<>();
        if (isProtein(aminoAcidList)) {
            Protein p = new Protein();
            for (AminoAcid aminoAcid : aminoAcidList) {
                if (!aminoAcid.getName().equals(" ")) {
                    p.addAminoAcid(aminoAcid);
                } else {
                    proteinList.add(p);
                    p = new Protein();
                }
            }
        }
        return proteinList;
    }


    @Override
    public String toString() {
        return aminoAcidList.toString();
    }
}
