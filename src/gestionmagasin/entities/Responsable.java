package gestionmagasin.entities;

public class Responsable extends  Employee{
    int prime;
// final , seald , non-seald => puisque la class mere a seald
    public Responsable(int identifiant, String nom, String adresse, int numNbr, int prime) {
        super(identifiant, nom, adresse, numNbr);
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Responsable{" +
                "prime=" + prime +
                ", identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", numNbr=" + numNbr +
                '}';
    }
    @Override
  public float CalculSalaire(){
      return   this.getNumNbr()*5+(this.getNumNbr()%180)*(5*0.15f);

  }
}
