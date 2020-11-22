/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_18_nov;

public class Usine {

    private Produit[] tab = new Produit[40];
    private int compteur = 0;

    public void ajouterProduit(Produit p) {
        tab[compteur] = p;
        compteur++;
    }

    @Override
    public String toString() {
        String total = "";
        //for pour mettre à jour total;
        for (int i = 0; i < compteur; i++) {
            total += tab[i] + "\n";
        }
        return total;
    }

    public boolean recherche(String designation) {
        for (int i = 0; i < compteur; i++) {
            if (tab[i].getDesignation().equals(designation)) {
                return true;
            }
        }
        return false;
    }

    public boolean recherche(Produit p) {
        for (int i = 0; i < compteur; i++) {
            if (tab[i] == p) {
                return true;
            }
        }
        return false;
    }

    public double getCoutMoyen() {
        double somme = 0;
        for (int i = 0; i < compteur; i++) {
            somme = somme + tab[i].getCoutProduction();
        }
        return somme / compteur;
    }

    public double getCoutMoyenRaquette() {
        double somme = 0;
        int compteurRaquette = 0;
        for (int i = 0; i < compteur; i++) {
            if (tab[i] instanceof Raquette) {
                somme = somme + tab[i].getCoutProduction();
                compteurRaquette++;
            }
        }
        return somme / compteurRaquette;
    }

    public double getCoutMoyenRaquette(String sport) {
        double somme = 0;
        int compteurRaquette = 0;
        for (int i = 0; i < compteur; i++) {
            if (tab[i] instanceof Raquette) {
                Raquette temp = (Raquette) tab[i];
                if (temp.getSport().equals(sport)) {
                    somme = somme + tab[i].getCoutProduction();
                    compteurRaquette++;
                }
            }
        }
        return somme / compteurRaquette;
    }

}
