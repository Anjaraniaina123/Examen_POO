import java.util.Scanner;

public class Combattants {
    private String nom;
    private String prenom;
    private String nomCombattants;
    private String poids;
    private String listeDeTitre;

    public Combattants(String nom, String prenom, String nomCombattants, String poids, String listeDeTitre) {
        this.nom = nom;
        this.prenom = prenom;
        this.nomCombattants = nomCombattants;
        this.poids = poids;
        this.listeDeTitre = listeDeTitre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomCombattants() {
        return nomCombattants;
    }

    public void setNomCombattants(String nomCombattants) {
        this.nomCombattants = nomCombattants;
    }

    public String getPoids() {
        return poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    public String getListeDeTitre() {
        return listeDeTitre;
    }

    public void setListeDeTitre(String listeDeTitre) {
        this.listeDeTitre = listeDeTitre;
    }


    @Override
    public String toString() {
        return "Combattants{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomCombattants='" + nomCombattants + '\'' +
                ", poids='" + poids + '\'' +
                ", listeDeTitre='" + listeDeTitre + '\'' +
                '}';
    }
}
