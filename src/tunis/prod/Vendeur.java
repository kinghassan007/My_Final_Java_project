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
public class Vendeur extends Employes  {
   private int  tauxDeVente;

    public Vendeur(int tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    public Vendeur() {
    }
    

    public Vendeur(int identifiant, String nom, String adress, double nbr_heures) {
        super(identifiant, nom, adress, nbr_heures);
    }

    public int getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(int tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return "Vendeur{" + super.toString() + tauxDeVente + '}';
    }
   
}
