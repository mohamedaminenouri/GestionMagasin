package gestionmagasin.entities;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karra
 */
public class Produit  {
    private  int identifiant;
    private String libelle;
    private String marque;
    private float prix;

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
        if (prix>0){
            this.prix = prix;
        }
        else {
            System.out.println("prix doit etre superieur a Zero");
        }

    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    private Date dateExpiration;

    public Produit() {
    }

    public Produit(int identifiant, String libelle, String marque, float prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
       Magasin.nombreTousProduit++;
    }

    /*public Produit(int identifiant, String libelle, String marque, float prix, Date dateExpiration) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.dateExpiration = dateExpiration;
    }*/
    
    
    
    public void afficher(){
        System.out.println("Identifiant:"+identifiant+" ,libelle:"+libelle+" ,marque:"+marque+" ,prix:"+prix);
    }

    @Override
    public String toString() {
        return "Produit{" + "identifiant=" + identifiant + ", libelle=" + libelle + ", marque=" + marque + ", prix=" + prix  + '}';
    }

    public boolean Comparer(Produit p){
            if (p.getIdentifiant()==this.getIdentifiant() && p.getLibelle().equals(this.getLibelle() )&& p.getPrix()==this.getPrix()){
                return true;
            }
        return false;
    }
    public static boolean ComparerDeuxProduits(Produit p, Produit p2){
        if (p.getIdentifiant()==p2.getIdentifiant() && p.getLibelle().equals(p2.getLibelle() )&& p.getPrix()==p2.getPrix()){
            return true;
        }
        return false;
        }
   public   void determinerTypeProduit(){
        if (this instanceof ProduitFruit){
            System.out.println( " produit de type fruit");
        }
        else if (this instanceof ProduitLegume){
            System.out.println("produit de type legume");

        }
   }


}
