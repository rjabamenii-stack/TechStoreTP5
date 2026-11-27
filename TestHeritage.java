package techstore;

public class TestHeritage {
    public static void main(String[] args) {
        Adulte a1 = new Adulte("Amine", 35, "98123456", "Ingénieur");
        a1.afficherIdentite();
        Enfant e1 = new Enfant("Sami", 10, "22345678", "École primaire");
        Bebe b1 = new Bebe("Lina", 1, "55678901", true);

        System.out.println(a1);
        System.out.println(e1);
        System.out.println(b1);

        System.out.println("Nom de l'enfant : " + e1.getNom());
        System.out.println("Téléphone de l'adulte : " + a1.getTelephone());

        TypePersonne type = TypePersonne.ADULTE;
        System.out.println(type);
        for (TypePersonne t : TypePersonne.values()) {
            System.out.println(t);
        }
    }
}
