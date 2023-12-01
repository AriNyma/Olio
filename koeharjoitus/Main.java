package koeharjoitus;

public class Main {
    public static void main(String[] args) {
        Opettaja opettaja1 = new Opettaja("Marita", 17012001, false);
        Opiskelija opiskelija1 = new Opiskelija("Mikko", 16012001, true);
        
        System.out.println("Opettaja:");
        System.out.println("Nimi: " + opettaja1.getNimi());
        System.out.println("Syntymäaika: " + opettaja1.getSyntAika());
        System.out.println("Opinto-oikeus: " + opettaja1.getTyosopimus());

        // Calling the parkkilupa method for the student
        opettaja1.parkkilupa();
        System.out.println();
        
        System.out.println("Opiskelija:");
        System.out.println("Nimi: " + opiskelija1.getNimi());
        System.out.println("Syntymäaika: " + opiskelija1.getSyntAika());
        System.out.println("Opinto-oikeus: " + opiskelija1.getOpintoOikeus());

        // Calling the parkkilupa method for the student
        opiskelija1.parkkilupa();
        System.out.println();
    }
}
