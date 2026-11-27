package techstore;

public class Main {
    public static void main(String[] args) {
        SystemeExploitation s1 = SystemeExploitation.Windows;
        SystemeExploitation s2 = SystemeExploitation.Ubuntu;
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("Valeurs autorisées :");
        for (SystemeExploitation s : SystemeExploitation.values()) {
            System.out.println(s);
        }

        Mobile m1 = new Mobile(1, "Samsung Galaxy S24", "SGS24", 3299, 6.2, "Exynos 2400", 8,
                SystemeExploitation.Android, 50, 12, 2, 4000);
        Mobile m2 = new Mobile(2, "Redmi 13C", "R13C", 449, 6.7, "Helio G85", 4,
                SystemeExploitation.Android, 50, 8, 2, 5000);
        OrdinateurDeBureau ob = new OrdinateurDeBureau(3, "HP Pro Tower", "HPT290", 1599, 23.8,
                "Intel Core i5", 8, SystemeExploitation.Windows, 512, "Intel UHD", "260 W");
        OrdinateurPortable op = new OrdinateurPortable(4, "Lenovo IdeaPad 3", "LIP3", 1899, 15.6,
                "AMD Ryzen 5", 16, SystemeExploitation.Ubuntu, 512, "AMD Radeon", 4500);
        ComposantStockage c1 = new ComposantStockage(5, "SSD Kingston", "SSDK480", 129, 480);
        ComposantStockage c2 = new ComposantStockage(6, "Disque dur Seagate", "SGT1T", 189, 1000);
        Peripheriques p1 = new Peripheriques(7, "Souris Logitech M185", "LM185", 45, "Wi-Fi", "USB-A");

        System.out.println("\n--- Articles ---");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(ob);
        System.out.println(op);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(p1);

        System.out.println("\n--- Garanties ---");
        System.out.println(m1.getNom() + " : " + m1.garantirAppareil() + " an(s)");
        System.out.println(m2.getNom() + " : " + m2.garantirAppareil() + " an(s)");
        System.out.println(ob.getNom() + " : " + ob.garantirAppareil() + " an(s)");
        System.out.println(op.getNom() + " : " + op.garantirAppareil() + " an(s)");
        System.out.println(c1.getNom() + " : " + c1.garantirAppareil() + " an(s)");
        System.out.println(c2.getNom() + " : " + c2.garantirAppareil() + " an(s)");
    }
}
