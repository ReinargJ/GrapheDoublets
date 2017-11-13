package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Outils {
    public File getFile(String fileName) {
        //Get file from resources folder
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());

        return file;

    }

    public static ArrayList<Mot> loadWords(String FileName) throws IOException {
        ArrayList<Mot> mots = new ArrayList<>();

        Outils outils = new Outils();
        // Lecture des fichiers
        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(outils.getFile(FileName))));
        try {
            String line;
            while ((line = br.readLine()) != null) {
                mots.add(new Mot(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
        return mots;
    }

    public void setSuccesseurs(ArrayList<Mot>  mots){
        int size = mots.size();

        for(int i = 0; i<size; i++){
            for (int j=i; j<size; j++){
                if(mots.get(j).isSuccessor(mots.get(i).mot)){
                    mots.get(i).AddSuccesseur(mots.get(j));
                }
            }
        }
    }

    public int getAretes(ArrayList<Mot> mots){
        int sum = 0;

        int size = mots.size();

        for(int i = 0; i<size; i++){
            sum +=mots.get(i).successeurs.size();
        }

        return sum;
    }

    public void ParCoursEnLargeur(Mot mot)
    {
        //System.out.print(node.data + " ");
        List<Mot> successeurs=mot.getSuccesseurs();
        for (int i = 0; i < successeurs.size(); i++) {
            Mot m=successeurs.get(i);
            if(m!=null && !m.visited)
           {
               ParCoursEnLargeur(m);
                m.visited=true;
            }
        }
    }

    public int nbSansVoisins(ArrayList<Mot> mots){
        int sum = 0;

        int size = mots.size();
        HashMap<String, Mot> sansSuccesseurs = new HashMap<>();


        for(int i = 0; i<size; i++){
            Mot mot = mots.get(i);

            if(mot.successeurs.isEmpty()){
                sansSuccesseurs.put(mot.mot, mot);
            }
        }

        HashMap<String, Mot> finalList = new HashMap<>(sansSuccesseurs);
        for(HashMap.Entry<String, Mot> entry : sansSuccesseurs.entrySet()) {
            String key = entry.getKey();
            Mot mot = entry.getValue();
            for(int i = 0; i<size; i++) {
             if(mots.get(i).successeurs.contains(mot)){
                    finalList.remove(mot.mot);
             }
            }
        }
        return finalList.size();
    }
}
