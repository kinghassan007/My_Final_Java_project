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
public class Employes {
   protected int identifiant;
   protected String nom;
   protected String adress;
   protected double nbr_heures ;

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getNbr_heures() {
        return nbr_heures;
    }

    public void setNbr_heures(double nbr_heures) {
        this.nbr_heures = nbr_heures;
    }
    public Employes()
    {
    }
    public Employes(int identifiant, String nom, String adress, double nbr_heures) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adress = adress;
        this.nbr_heures = nbr_heures;
    }

    @Override
    public String toString() {
        return '{' + "identifiant=" + identifiant + ", nom=" + nom + ", adress=" + adress + ", nbr_heures=" + nbr_heures + '}';
    }
    
    
}
