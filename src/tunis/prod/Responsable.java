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
public class Responsable extends Employes {
  private int prime ;

    public Responsable(int prime, int identifiant, String nom, String adress, double nbr_heures) {
        super(identifiant, nom, adress, nbr_heures);
        this.prime = prime;
    }

    public Responsable() {
    }

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Responsable{"+ super.toString()+ "prime=" + prime + '}';
    }
   
}
