package com.company;

import java.io.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        FileLoader fl = new FileLoader();

        HashMap<String, Mot> mots4 = new HashMap<String, Mot>();


        // Lecture des fichiers
        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(fl.getFile("resources/mots04lettres.txt"))));
        try {
            String line;
            while ((line = br.readLine()) != null) {
                mots4.put(line, new Mot(line));
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
    }
}
