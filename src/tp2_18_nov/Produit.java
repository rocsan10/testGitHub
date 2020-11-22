/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_18_nov;

public class Produit {
    private String designation;
    private String reference;
    private double coutProduction;

    public Produit(String designation, String reference) {
        this.designation = designation;
        this.reference = reference;
    }

    public double getCoutProduction() {
        return coutProduction;
    }

    public void setCoutProduction(double coutProduction) {
        this.coutProduction = coutProduction;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "designation=" + designation + ", reference=" + reference;
    }
    
    
}
