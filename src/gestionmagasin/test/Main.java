package gestionmagasin.test;

import gestionmagasin.entities.*;

public class Main {
    public static void main(String[] args) {
        Magasin mg1 = new Magasin(14, "ariana");
        Magasin mg2=new Magasin(12,"tunis");
        Produit p1 = new Produit(1000, "yourt", "delice", 0);
        Produit p2 = new Produit(1001, "omega3", "oeuf", 350);
        Produit p3 = new Produit(1002, "kouka", "socKouka", 1700);
        Produit p4 = new Produit(1003, "fanta", "focfanta", 1750);
        Produit p5 = new Produit(1004, "browniz", "socChoc", 500);
        mg1.AjouterProduit(p1);
        mg1.AjouterProduit(p2);
        mg1.AjouterProduit(p3);
        mg2.AjouterProduit(p4);
        System.out.println(mg1.toString());
        System.out.println("Tous les produits de tous les magazins " + Magasin.nombreTousProduit);
        System.out.println("**************************************************************");
        System.out.println("Comparer :" + p1.Comparer(p2));
        System.out.println("Comparer par Deux produits  " + p1.ComparerDeuxProduits(p2, p2));

      System.out.println("produit dans magazin " + mg1.ChercherProduit(p1));
//mg1.AjouterProduit(p1);
        mg1.SupprimerProduit(p1);
        System.out.println("**************************************************************");

       System.out.println("magasin apres suppression "+ mg1.toString());
       System.out.println("Le magazin le plus grand "+Magasin.PlusGrandMagasin(mg1,mg2));
        System.out.println("**************************************************************");
        Vendeur v1=new Vendeur(011,"Ali","tunis",10,100);
        Vendeur v2=new Vendeur(012,"amine","tunis",10,110);
        Vendeur v3=new Vendeur(013,"majid","tunis",10,120 );
        Responsable r1=new Responsable(17,"azer","ariana",15,280);
        Responsable r2=new Responsable(17,"louay","aouina",6,200);
        mg1.AjouterVendeur(v1);
        mg1.AjouterResponsable(r1);

        mg2.AjouterVendeur(v1);
        mg2.AjouterVendeur(v2);
        mg2.AjouterVendeur(v3);
        mg2.AjouterResponsable(r2);


        System.out.println("**************************************************************");
        System.out.println("mg apres l''ajout des employees"+mg1.toString());

        System.out.println("mg apres l''ajout des employees"+mg2.toString());
       // Employee e=new Employee(1,"mohamed","nabeul",5);
         ProduitFruit pf=new ProduitFruit(122,"fraise","fraiseMarque",5005.0f,14.5,"janvier");
         ProduitLegume pl=new ProduitLegume(122,"pommedeTerrse","prommeDeTerrseOkraine",5005.0f,14.5,"fevrier");
         mg1.AjouterProduit(pf);
         mg1.AjouterProduit(pl);
        System.out.println(mg1.toString());
      //  mg1.determinerTypeProduit();
        System.out.println("calcul stock fruit "+mg1.calculStock());
        System.out.println(pl.estFrais("fevrier"));


    }
}


