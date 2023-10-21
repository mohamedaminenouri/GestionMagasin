package gestionmagasin.entities;

public class Cassier extends  Employee{

  private int numeroDeCaisse;

    public Cassier(int identifiant, String nom, String adresse, int numNbr, int numeroDeCaisse) {
        super(identifiant, nom, adresse, numNbr);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    @Override
    public String toString() {
        return super.toString()+" numero cassier :"+getNumeroDeCaisse();
    }
    @Override
    public float CalculSalaire(){
        return  this.numNbr*50+  getNumeroDeCaisse();
    }
}
