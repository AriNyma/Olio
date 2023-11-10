package Moniprojekti;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> sanat = new ArrayList<>();
        sanat.add("Huutoniemi");
        sanat.add("Palosaari");
        sanat.add("Sundom");
        sanat.add("Vetokannas");        
    
    Tulostin tulostinOlio = new Tulostin();
    System.out.println("Tulostetaan objekti 2 kertaa");
    tulostinOlio.tulostaMonesti1(sanat, 2);
    System.out.println("\n");
    System.out.println("Tulostetaan lista");
    tulostinOlio.tulostaMonesti2(sanat);
    }
}
