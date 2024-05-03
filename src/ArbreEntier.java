public class ArbreEntier {
    private int valeur;
    private ArbreEntier gauche;
    private ArbreEntier droite;
    public ArbreEntier(int valeur, ArbreEntier gauche, ArbreEntier droite){
        this.valeur = valeur;
        this.gauche = gauche;
        this.droite = droite;
    }

    public int getValeur() {
        return valeur;
    }
    public ArbreEntier getDroite() {
        return droite;
    }
    public ArbreEntier getGauche() {
        return gauche;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
    public void setDroite(ArbreEntier droite) {
        this.droite = droite;
    }
    public void setGauche(ArbreEntier gauche) {
        this.gauche = gauche;
    }
}
