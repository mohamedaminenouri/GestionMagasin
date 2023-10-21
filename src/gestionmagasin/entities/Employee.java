package gestionmagasin.entities;

public abstract class Employee {
   // public sealed abstract class Employee permits Vendeur,Cassier,Responsable
    protected int identifiant;
    protected String nom;
    protected String  Adresse;
    protected int numNbr;

    public Employee(int identifiant, String nom, String adresse, int numNbr) {
        this.identifiant = identifiant;
        this.nom = nom;
        Adresse = adresse;
        this.numNbr = numNbr;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public int getNumNbr() {
        return numNbr;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", numNbr=" + numNbr +
                '}';
    }

    public abstract float CalculSalaire();

}
