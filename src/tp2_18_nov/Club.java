/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_18_nov;


public class Club extends Produit{
    private boolean estEnFer;

    public Club(String designation, String reference,boolean estEnFer) {
        super(designation, reference);
        this.estEnFer = estEnFer;
    }    

    @Override
    public String toString() {
        if (estEnFer)
            return super.toString()+ " materiau : fer"  ;
        else
            return super.toString()+ " materiau : bois"  ;
    }
}
