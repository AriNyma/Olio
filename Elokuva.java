//import java.util.ArrayList;
import java.util.Scanner;

public class Elokuva {
    private String nimi;
    private int ikaraja;

    public Elokuva (String elokuvanNimi, int elokuvanIkaraja) {
        this.nimi = elokuvanNimi;
        this.ikaraja = elokuvanIkaraja;
    }

    public String nimi(){
        return nimi;
    }

    public int ikaraja(){
        return ikaraja;
    }
    
    public static void main(String[] args){
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna elokuvan nimi:");
        String nimi = lukija.nextLine();

        System.out.println("Anna elokuvan ikäraja: ");
        int ikaraja;
        try {
            ikaraja = Integer.parseInt(lukija.nextLine());
        } catch (NumberFormatException e) {
            ikaraja = 18;
        }

        Elokuva elokuva1 = new Elokuva(nimi, ikaraja);

        System.out.println("Minkä ikäinen olet?");
        int ika = lukija.nextInt();

        elokuva1.nimi();
        elokuva1.ikaraja();

        if(ika < elokuva1.ikaraja){
                System.out.println("Et saa katsoa elokuvaa " + elokuva1.nimi);
        } else {
                System.out.println("Saat katsoa elokuvaa " + elokuva1.nimi);
        }

        lukija.close();
    }
}
