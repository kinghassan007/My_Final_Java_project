/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunis.prod;

/**
 *
 * @author Jaber
 */
public class Caissier extends Employes  {
    private int numeroDeCaisse;

    public Caissier(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public Caissier() {
    }

    public Caissier(int identifiant, String nom, String adress, double nbr_heures) {
        super(identifiant, nom, adress, nbr_heures);
    }

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public String toString() {
        return "Caissier{"+ super.toString() + numeroDeCaisse + '}';
    }
    
}
