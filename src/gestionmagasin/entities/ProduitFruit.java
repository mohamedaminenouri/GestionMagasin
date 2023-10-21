package gestionmagasin.entities;

import java.util.Date;

public class ProduitFruit extends Produit implements Critere{
    private Double quantite;
    private String saison;

    public ProduitFruit(int id, String libelle, String marque, float prix, Double quantite, String saison){
        super(id,libelle,marque,prix);
        this.quantite=quantite;
        this.saison=saison;

    }

    public Double getQuantite(){
        return quantite;
    }
    public void setQuantite(Double quantite){
        this.quantite=quantite;
    }
   public String getSaison(){
        return saison;
   }

   public void setSaison(String saison){
        this.saison=saison;
   }
   public String toString(){
        return super.toString()+" quantite "+quantite+" saison "+saison;
   }

    @Override
    public boolean estFrais(String saison) {
        if (this.saison.equals(saison)) {
            return true;
        }
        else
            return false;
    }
}
