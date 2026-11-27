package techstore;

public abstract class Ordinateur extends AppareilInformatique {
    private long disqueDur;
    private String carteGraphique;

    public Ordinateur(int id, String nom, String reference, double prix,
            double resolutionEcran, String processeur, long ram,
            SystemeExploitation systemeExploitaion, long disqueDur, String carteGraphique) {
        super(id, nom, reference, prix, resolutionEcran, processeur, ram, systemeExploitaion);
        this.disqueDur = disqueDur;
        this.carteGraphique = carteGraphique;
    }

    @Override
    public abstract int garantirAppareil();

    public long getDisqueDur() {
        return disqueDur;
    }

    public void setDisqueDur(long disqueDur) {
        this.disqueDur = disqueDur;
    }

    public String getCarteGraphique() {
        return carteGraphique;
    }

    public void setCarteGraphique(String carteGraphique) {
        this.carteGraphique = carteGraphique;
    }

    @Override
    public String toString() {
        return super.toString() + ", disqueDur=" + disqueDur + ", carteGraphique=" + carteGraphique;
    }
}
