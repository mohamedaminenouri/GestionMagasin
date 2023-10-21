package gestionmagasin.entities;

public class Vendeur extends Employee{
    private int tauxDeVente;

    public int getTauxDeVente() {
        return tauxDeVente;
    }

    public Vendeur(int identifiant, String nom, String adresse, int numNbr, int tauxDeVente) {
        super(identifiant, nom, adresse, numNbr);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return super.toString()+" taux de ventre "+getTauxDeVente();
    }
    @Override
    public float CalculSalaire(){
        return  450*this.getTauxDeVente();

    }

}
