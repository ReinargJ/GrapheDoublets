package com.company;

import java.util.ArrayList;
import java.util.List;

public class Mot {
    String mot;
    List<Mot> successeurs;

    public Mot(String mot) {
        this.mot = mot;
        this.successeurs = new ArrayList();
    }

    public void AddSuccesseur(Mot mot){
        this.successeurs.add(mot);
    }


}
