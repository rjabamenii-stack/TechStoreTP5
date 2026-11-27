package techstore;

public class Peripheriques extends Article {
    private String technologieDeConnexion;
    private String interfaceAvecOrdinateur;

    public Peripheriques(int id, String nom, String reference, double prix,
            String technologieDeConnexion, String interfaceAvecOrdinateur) {
        super(id, nom, reference, prix);
        this.technologieDeConnexion = technologieDeConnexion;
        this.interfaceAvecOrdinateur = interfaceAvecOrdinateur;
    }

    public String getTechnologieDeConnexion() {
        return technologieDeConnexion;
    }

    public void setTechnologieDeConnexion(String technologieDeConnexion) {
        this.technologieDeConnexion = technologieDeConnexion;
    }

    public String getInterfaceAvecOrdinateur() {
        return interfaceAvecOrdinateur;
    }

    public void setInterfaceAvecOrdinateur(String interfaceAvecOrdinateur) {
        this.interfaceAvecOrdinateur = interfaceAvecOrdinateur;
    }

    @Override
    public String toString() {
        return "Peripheriques [" + super.toString() + ", technologieDeConnexion=" + technologieDeConnexion
                + ", interfaceAvecOrdinateur=" + interfaceAvecOrdinateur + "]";
    }
}
