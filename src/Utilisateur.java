public class Utilisateur {

    private String prenom;
    private String nomDeFamille;
    private String nomUtil;
    private String mdp;
    private String genre;
    private String age;

    public Utilisateur(String prenom, String nomDeFamille, String nomUtil, String mdp, String genre, String age) {
        this.prenom = prenom;
        this.nomDeFamille = nomDeFamille;
        this.nomUtil = nomUtil;
        this.mdp = mdp;
        this.genre = genre;
        this.age = age;
    }

    public Utilisateur(){}



    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDeFamille() {
        return nomDeFamille;
    }

    public void setNomDeFamille(String nomDeFamille) {
        this.nomDeFamille = nomDeFamille;
    }

    public String getNomUtil() {
        return nomUtil;
    }

    public void setNomUtil(String nomUtil) {
        this.nomUtil = nomUtil;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
