package com.company;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        Outils outils = new Outils();

        ArrayList<Mot>  mots4 = Outils.loadWords("resources/mots04lettres.txt");
//        ArrayList<Mot> mots5 = Outils.loadWords("resources/mots05lettres.txt");
//        ArrayList<Mot> mots6 = Outils.loadWords("resources/mots06lettres.txt");
//        ArrayList<Mot> mots7 = Outils.loadWords("resources/mots07lettres.txt");
//        ArrayList<Mot> mots8 = Outils.loadWords("resources/mots08lettres.txt");
//        ArrayList<Mot> mots9 = Outils.loadWords("resources/mots09lettres.txt");
//       ArrayList<Mot> mots10 = Outils.loadWords("resources/mots10lettres.txt");
//        ArrayList<Mot> mots11 = Outils.loadWords("resources/mots11lettres.txt");
//        ArrayList<Mot> mots12 = Outils.loadWords("resources/mots12lettres.txt");
//        ArrayList<Mot> mots13 = Outils.loadWords("resources/mots13lettres.txt");
        //ArrayList<Mot> mots14 = Outils.loadWords("resources/mots14lettres.txt");
//        HashMap<String, Mot> mots15 = Outils.loadWords("resources/mots15lettres.txt");
//        HashMap<String, Mot> mots16 = Outils.loadWords("resources/mots16lettres.txt");
//        HashMap<String, Mot> mots17 = Outils.loadWords("resources/mots17lettres.txt");
//        HashMap<String, Mot> mots18 = Outils.loadWords("resources/mots18lettres.txt");


        outils.setSuccesseurs(mots4);

//        outils.setSuccesseurs(mots5);
//        outils.setSuccesseurs(mots6);
//        outils.setSuccesseurs(mots7);
//        outils.setSuccesseurs(mots8);
//        outils.setSuccesseurs(mots9);
//        outils.setSuccesseurs(mots10);
//        outils.setSuccesseurs(mots11);
//        outils.setSuccesseurs(mots12);
//        outils.setSuccesseurs(mots13);
//        outils.setSuccesseurs(mots14);
//        outils.setSuccesseurs(mots15);
//        outils.setSuccesseurs(mots16);
//        outils.setSuccesseurs(mots17);
//        outils.setSuccesseurs(mots18);


        System.out.println("aretes: "+outils.getAretes(mots4)+", sommets"+ mots4.size());
        System.out.println(outils.nbSansVoisins(mots4));
    }
}
