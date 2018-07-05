package com.m2i.genome;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DNARepository {
    private String dnaStrand;


    public DNARepository(String uri) throws IOException {
            loadString(uri);
    }

    private void loadString(String uri) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(uri));
        String line = reader.readLine();
        while (line != null) {
            StringTokenizer st = new StringTokenizer(line, ";");
            dnaStrand = st.nextToken();
            line = reader.readLine();
        }
        reader.close();
    }

    public DNA getDNA() {
        return new DNA(dnaStrand);
    }
}
