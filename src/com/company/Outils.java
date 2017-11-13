package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

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

//    public  void ParCoursEnLargeur(Mot mot)
//    {
//        //System.out.print(node.data + " ");
//        List<Mot> successeurs=node.getNeighbours();
//        for (int i = 0; i < neighbours.size(); i++) {
//            Node n=neighbours.get(i);
//            if(n!=null && !n.visited)
//            {
//                dfs(n);
//                n.visited=true;
//
//            }
//        }
//    }
}
