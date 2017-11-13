package com.company;

import java.util.ArrayList;
import java.util.List;

public class Mot {
    String mot;
    List<Mot> successeurs;
    Boolean visited= false;

    public Mot(String mot) {
        this.mot = mot;
        this.successeurs = new ArrayList();
    }

    public void AddSuccesseur(Mot mot){
        this.successeurs.add(mot);
    }
    public boolean isSuccessor(String firstMot){
        int diff = 0;

        for (int i=0; i<this.mot.length(); i++){
            if(this.mot.charAt(i) != firstMot.charAt(i)){
                diff++;
            }
        }

        return (diff==1);
    }

    public List<Mot> getSuccesseurs() {
        return successeurs;
    }
}
