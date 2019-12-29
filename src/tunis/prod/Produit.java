/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunis.prod;
 
public class Produit {
    private int identifiant;
    private String libelle;
    private String marque;
    private float prix;
  
    
    Produit(int identifiant,String libelle,String marque)
    {
    this.identifiant=identifiant;
    this.libelle=libelle;
    this.marque=marque;
    }
    Produit(int identifiant,String libelle,String marque,float prix)
    {
    this.identifiant=identifiant;
    this.libelle=libelle;
    this.marque=marque;
    this.prix=prix;
    }
    void afficher()
    {
        System.out.println("identifiant = "+identifiant+ " libelle = "+libelle+" marque = "+marque+" prix="+prix);
    }    

    @Override
    public String toString() {
        return "Produit{" + "identifiant=" + identifiant + ", libelle=" + libelle + ", marque=" + marque + ", prix=" + prix + '}';
    }

   

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
    
    
    
    
    
    
    
    
}
