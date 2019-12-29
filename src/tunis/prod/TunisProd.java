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
public class TunisProd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  /* Produit p1 = new Produit();
   p1.identifiant=1021;
   p1.libelle="lait";
   p1.marque="delice"; 
   */
  Produit p1 = new Produit (1021,"lait","delice");
   
   /*Produit p2 = new Produit();
   p2.identifiant=2510;
   p2.libelle="Yaourt";
   p2.marque="Vitalait";
   */
   Produit p2 = new Produit (2510,"yaourt","vitalait");
   /*Produit p3 = new Produit();
   p3.identifiant=3250;
   p3.libelle="tomate";
   p3.marque="Sicamet";
   p3.prix=(int) 1.200;
   */
   Produit p3 = new Produit (3250,"tomate","sicamet", (float) 1.200);
  
   p1.afficher();
   p2.afficher();
   p3.afficher();
   p1.setPrix((float) 0.700);
   p2.setPrix((float) 0.400);
   p1.afficher();
   p2.afficher();
   p3.afficher();
   /*String resultat = p1.toString();
   System.out.println(resultat);
   */
   System.out.println(p1);
   
   
    
   Magasin m1 = new Magasin(3350,"Carrefour","Centre-Ville");
   
       m1.ajouter(p2);
       m1.afficher();
   Magasin m2 = new Magasin(3340,"Monoprix","Menzah 6");
   
       m2.ajouter(p1);
       m2.ajouter(p2);
       m2.ajouter(p3);
       m2.ajouter(p2);
       m2.afficher();
        System.out.println("le total du Magazin et "+Magasin.getTotal());
       Vendeur e = new Vendeur(100,"ahmed","tunis",500);
       Responsable d=new Responsable(152,10,"h","tunitu",161);
       Caissier t=new Caissier(150,"g","f",181);
       m1.ajouterEmployes(e);
       m1.ajouterEmployes(d);
       m1.ajouterEmployes(t);
       m1.afficherslaire();
       m1.afficher();
       
   }
}
