package techstore;

public class Mobile extends AppareilInformatique {
    private double appareilPhotoArriere;
    private double appareilPhotoFrontal;
    private int nbSim;
    private long capaciteBatterie;

    public Mobile(int id, String nom, String reference, double prix,
            double resolutionEcran, String processeur, long ram,
            SystemeExploitation systemeExploitaion, double appareilPhotoArriere,
            double appareilPhotoFrontal, int nbSim, long capaciteBatterie) {
        super(id, nom, reference, prix, resolutionEcran, processeur, ram, systemeExploitaion);
        this.appareilPhotoArriere = appareilPhotoArriere;
        this.appareilPhotoFrontal = appareilPhotoFrontal;
        this.nbSim = nbSim;
        this.capaciteBatterie = capaciteBatterie;
    }

    @Override
    public int garantirAppareil() {
        if (getPrix() > 1000) {
            return 2;
        } else {
            return 1;
        }
    }

    public double getAppareilPhotoArriere() {
        return appareilPhotoArriere;
    }

    public void setAppareilPhotoArriere(double appareilPhotoArriere) {
        this.appareilPhotoArriere = appareilPhotoArriere;
    }

    public double getAppareilPhotoFrontal() {
        return appareilPhotoFrontal;
    }

    public void setAppareilPhotoFrontal(double appareilPhotoFrontal) {
        this.appareilPhotoFrontal = appareilPhotoFrontal;
    }

    public int getNbSim() {
        return nbSim;
    }

    public void setNbSim(int nbSim) {
        this.nbSim = nbSim;
    }

    public long getCapaciteBatterie() {
        return capaciteBatterie;
    }

    public void setCapaciteBatterie(long capaciteBatterie) {
        this.capaciteBatterie = capaciteBatterie;
    }

    @Override
    public String toString() {
        return "Mobile [" + super.toString() + ", appareilPhotoArriere=" + appareilPhotoArriere
                + ", appareilPhotoFrontal=" + appareilPhotoFrontal + ", nbSim=" + nbSim
                + ", capaciteBatterie=" + capaciteBatterie + "]";
    }
}
