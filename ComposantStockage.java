package techstore;

public class ComposantStockage extends Article implements Garantissable {
    private int capacite;

    public ComposantStockage(int id, String nom, String reference, double prix, int capacite) {
        super(id, nom, reference, prix);
        this.capacite = capacite;
    }

    @Override
    public int garantirAppareil() {
        if (capacite <= 500) {
            return 1;
        } else {
            return 2;
        }
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    @Override
    public String toString() {
        return "ComposantStockage [" + super.toString() + ", capacite=" + capacite + "]";
    }
}
