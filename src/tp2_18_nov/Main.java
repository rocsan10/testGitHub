/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_18_nov;

/**
 *
 * @author rocsan
 */
public class Main {
    public static void main(String[] args) {
        // création de 4 produits
        Raquette r1 = new Raquette("Federer Replica", "Fed1", "Tennis", "Carbone");
        r1.setCoutProduction(50);
        Raquette r2 = new Raquette("Nadal Replica", "Nad1", "Tennis", "Aluminium");
        r2.setCoutProduction(51);
        Raquette r3 = new Raquette("Lee Replica", "Lee1", "Badminton", "Carbone");
        r3.setCoutProduction(52);
        Club c1 = new Club("Woods Replica", "Woo1", false);
        c1.setCoutProduction(53);
        Club c2 = new Club("Floyd Replica", "Flo1", false);
        c2.setCoutProduction(54);
        
        Usine usine = new Usine();
        usine.ajouterProduit(r1);
        usine.ajouterProduit(r2);
        usine.ajouterProduit(r3);
        usine.ajouterProduit(c1);
        
        System.out.println(usine.recherche("Nadal Replica"));
        System.out.println(usine.recherche("Ferrer Replica"));    
        System.out.println(usine.recherche(c1));
        System.out.println(usine.recherche(c2));  
        
        System.out.println(usine.getCoutMoyen());
        System.out.println(usine.getCoutMoyenRaquette());
        System.out.println(usine.getCoutMoyenRaquette("Tennis"));
        
    /*    Produit[ ]tab = new Produit[4];
        tab[0]=r1;
        tab[1]=r2;
        tab[2]=r3;
        tab[3]=c1;
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i].toString());            
        }*/
    }
    
}
