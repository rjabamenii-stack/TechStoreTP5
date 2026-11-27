package techstore;

public class OrdinateurPortable extends Ordinateur {
    private long capaciteBatterie;

    public OrdinateurPortable(int id, String nom, String reference, double prix,
            double resolutionEcran, String processeur, long ram,
            SystemeExploitation systemeExploitaion, long disqueDur, String carteGraphique,
            long capaciteBatterie) {
        super(id, nom, reference, prix, resolutionEcran, processeur, ram, systemeExploitaion,
                disqueDur, carteGraphique);
        this.capaciteBatterie = capaciteBatterie;
    }

    @Override
    public int garantirAppareil() {
        return 2;
    }

    public long getCapaciteBatterie() {
        return capaciteBatterie;
    }

    public void setCapaciteBatterie(long capaciteBatterie) {
        this.capaciteBatterie = capaciteBatterie;
    }

    @Override
    public String toString() {
        return "OrdinateurPortable [" + super.toString() + ", capaciteBatterie=" + capaciteBatterie + "]";
    }
}
