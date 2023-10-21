package gestionmagasin.entities;

public class ProduitLegume extends Produit implements Critere{
    private Double quantite;
    private String saison;
String[] tab=new String[12];
    public ProduitLegume(int id, String marque, String libelle, float prix,Double quantite,String saison){
        super(id,marque,libelle,prix);
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
        return  saison;
    }
    public void setSaison(String saison){
        this.saison=saison;
    }

    public String toString(){
        return super.toString()+" quantitie "+quantite+" saison"+saison;
    }
    @Override
    public boolean estFrais(String saison) {

         String [] months=new String[]{"janvier","fevrier","mars","avril","mai","juin","juillet","aout", "septembre","octobre","novembre","decembre"};
               for (int i=0;i<months.length;i++){
                   if (months[i].equals(saison)){
                        if (months[i+1].equals(saison) || months[i].equals(saison)){
                            return true;
                        }
                   }
               }
               return false;

    }
}
