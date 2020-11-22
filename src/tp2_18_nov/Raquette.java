/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_18_nov;

public class Raquette extends Produit{
    private String sport;
    private String materiau;

    public Raquette(String designation, String reference,String sport, String materiau) {
        super(designation, reference);
        this.sport=sport;
        this.materiau=materiau;
    }

    public String getSport() {
        return sport;
    }

    @Override
    public String toString() {
        return super.toString()+ " sport=" + sport + ", materiau=" + materiau ;
    }
}
