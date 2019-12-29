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
public class Magasin {
    int nbrEmployes;
        private static int total;
        private static int salaire;
        int identifiant;
        String nom;
        String adress;
        int capacite;
        Produit[] mesproduit = new Produit[50];
        Employes[] mesemployes = new Employes[100];
    public Magasin(int identifiant, String nom, String adress) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adress = adress;
        this.capacite = 0;
    }

    static public int getTotal() {
        return total;
    }
        
        
        
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

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

 
   public void ajouter(Produit p)
    {
        if (capacite<50)
    {
       mesproduit[capacite]=p; // nseloh 3laha 
       capacite++;
       total++;
    }
        else 
            System.out.println("Magasin plein");
    }
    public void ajouterEmployes(Employes x)
    {
        mesemployes[nbrEmployes]=x;
       nbrEmployes++;
    }
        
    public void afficher()
    {
        System.out.println(identifiant+"  "+adress+"  "+nom +"  "+capacite);
        for (int i=0;i<capacite;i++)
        {
            System.out.println(mesproduit[i].getLibelle());
            System.out.println(mesproduit[i].getPrix());
        }
        for (int e=0;e<nbrEmployes;e++)
        {
            if(mesemployes[e]instanceof Caissier)
            {
            Caissier c = (Caissier)mesemployes[e];    
            /*System.out.println(c.getNumeroDeCaisse()+c.getNom()+c.getIdentifiant()+c.getAdress()+c.getNbr_heures());*/
                System.out.println(c.toString());
            }
            else if(mesemployes[e]instanceof Vendeur)
            {
            Vendeur v = (Vendeur)mesemployes[e];    
           /* System.out.println(v.getTauxDeVente()+v.getNom()+v.getIdentifiant()+v.getAdress()+v.getNbr_heures());*/
                System.out.println(v.toString());
            }
            else if (mesemployes[e]instanceof Responsable)
            {
            Responsable r = (Responsable)mesemployes[e];    
            /*System.out.println(r.getPrime()+r.getNom()+r.getIdentifiant()+r.getAdress()+r.getNbr_heures());*/
            System.out.println(r.toString());
            }
        }
            
    }
    
        public void afficherslaire()
    {
        for (int e=0;e<nbrEmployes;e++)
        {
            if(mesemployes[e]instanceof Caissier)
            {
            Caissier c = (Caissier)mesemployes[e];    
            if( c.getNbr_heures()>=180)
            {
              int s=0;
             salaire=(int) (c.getNbr_heures()*5);
             s=salaire+((salaire*15)/100);
                System.out.println(""+s);    
            }
            else 
            {
             salaire=(int) (c.getNbr_heures()*5); 
                System.out.println(""+salaire);
            }
            }
            else if(mesemployes[e]instanceof Vendeur)
            {
            Vendeur v = (Vendeur)mesemployes[e];    
             if( v.getTauxDeVente()>0)
            {
              int s=0;
             s=(int) (450*v.getTauxDeVente());
                System.out.println(""+s);    
            }
             else 
             {
                 salaire=450;
                 System.out.println(""+salaire);
             }
            
            }
            else if (mesemployes[e]instanceof Responsable)
            {
            Responsable r = (Responsable)mesemployes[e];    
           if( r.getNbr_heures()>=160)
            {
              int s=0;
             salaire=(int) (r.getNbr_heures()*10);
             s=salaire+((salaire*20)/100);
                System.out.println(""+s);    
            }
            else 
            {
             salaire=(int) (r.getNbr_heures()*10); 
                System.out.println(""+salaire);
            }
       
            }
        }
            
    }
}

 
    
    

    
    
    
        
        
        
        

