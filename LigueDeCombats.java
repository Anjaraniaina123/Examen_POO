public class LigueDeCombats {
    private String nom;
    private String ensembleDeCombats;
    private String ensembleDeMatch;

    public LigueDeCombats(String nom, String ensembleDeCombats) {
        this.nom = nom;
        this.ensembleDeCombats = ensembleDeCombats;
        this.ensembleDeMatch = ensembleDeMatch;
    }

    public String getNom(LigueDeCombats combats1) {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEnsembleDeCombats() {
        return ensembleDeCombats;
    }

    public void setEnsembleDeCombats(String ensembleDeCombats) {
        this.ensembleDeCombats = ensembleDeCombats;
    }

    public String getEnsembleDeMatch() {
        return ensembleDeMatch;
    }

    public void setEnsembleDeMatch(String ensembleDeMatch) {
        this.ensembleDeMatch = ensembleDeMatch;
    }
    public Object LigueDeCombats() {
        if (nom == null || ensembleDeCombats == null || ensembleDeMatch == null) {
                return null;
        }else {
            return ensembleDeCombats;
        }
    }
}
