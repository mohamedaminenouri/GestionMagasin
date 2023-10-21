package gestionmagasin.entities;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karra
 */
public class Magasin {
    public int id;
    public String adresse;
    public final int CAPACITE = 50;
    public Produit[] tabProduits; //Declaration 
    public int nbProduits; // Variable d'instance
    public int nbEmployes; // Variable d'instance
    public Employee [] employees=new Employee[20];
    public static int nombreTousProduit=0;
    public Magasin() {
        tabProduits = new Produit[CAPACITE];

    }

    public Magasin(int id, String adresse) {
        this.id = id;
        this.adresse = adresse;
        tabProduits = new Produit[CAPACITE];
    }

    public String toString() {
        String ch1, ch2 = "";
        String ch3="";
        ch1 = "Id: " + id + ", Adresse: " + adresse + ", nbProduits: " + nbProduits + " nbEmployes "+nbEmployes+ "\n";
        for (int i = 0; i < nbProduits; i++) {
            ch2 = ch2 + tabProduits[i].toString() + "\n";
        }
        for (int i = 0; i < nbEmployes; i++) {
            ch3 = ch3 + employees[i].toString() +" salaire ==>" + employees[i].CalculSalaire() + "\n";
        }
        return ch1 + ch2 + ch3;
    }

    public boolean AjouterProduit(Produit p) {
        if (nbProduits < CAPACITE) {
             if (!ChercherProduit(p)){
                 tabProduits[nbProduits] = p;
                 nbProduits++;
                 System.out.println("produit ajouter");
             }
            System.out.println("produit existe deja");

           }

        return true;

    }

    public boolean ChercherProduit(Produit p) {
        for (int i = 0; i < nbProduits; i++) {
            if (p==tabProduits[i]){
                return true;
            }


        }
        return  false;
    }

    public boolean SupprimerProduit(Produit p){
        for (int i=0;i<nbProduits;i++){
            if (p==tabProduits[i]){
                //tabProduits[i]=null;
               for (int j=i;j<nbProduits-1;j++){
                   tabProduits[j]=tabProduits[j+1];
               }
               nbProduits --;
                nombreTousProduit--;

               return true;
            }
        }
        return false;
    }
    public static String PlusGrandMagasin(Magasin mg1,Magasin mg2){
        if (mg1.nbProduits>mg2.nbProduits){
            return mg1.adresse;

        }
        else return mg2.adresse;

    }

    ///// its about the employees
    public boolean AjouterCassier(Cassier cassier){
        if (cassier == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        employees[nbEmployes]=cassier;
        nbEmployes++;
        return  true;
    }
    public boolean AjouterResponsable(Responsable responsable){
        if (responsable == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        employees[nbEmployes]=responsable;
        nbEmployes++;

        return true;
    }
    public boolean AjouterVendeur(Vendeur vendeur){
        if (vendeur == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        employees[nbEmployes]=vendeur;
        nbEmployes++;

        return true;

    }

/*public void determinerTypeProduit(){
        for(Produit p:tabProduits){
            if (p instanceof ProduitFruit){
                System.out.println(" fruits "+p);
            }
            else if (p instanceof ProduitLegume)

                System.out.println(" legumes "+p);
        }
}*/
public Double calculStock() {
        Double k=0.0;
    for (int i = 0; i < tabProduits.length; i++) {
     if (tabProduits[i] instanceof ProduitFruit){
         k=k+ ((ProduitFruit) tabProduits[i]).getQuantite();
     }
    }
    return k;
}
}
    

