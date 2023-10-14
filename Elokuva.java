import java.util.ArrayList;
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
        ArrayList<Elokuva> elokuvat = new ArrayList<>();
        
        System.out.println("Minkä ikäinen olet?");
        int ika = lukija.nextInt();

        System.out.println("Voit valita seuraavista vaihtoehdoista: \n1. Lisää elokuva\n2. Poista elokuva\n3. Listaa kaikki elokuvat ");
        int valinta = lukija.nextInt();
        
        switch(valinta){
            case 1: 
                String nimi = ".";
                while(true){
                    System.out.println("Anna elokuvan nimi:");
                    nimi = lukija.nextLine();  
                    
                    if(nimi.equals("")){
                        break;
                    }

                    System.out.println("Anna elokuvan ikäraja: ");
                    int ikaraja;
            
                    try {
                        ikaraja = Integer.parseInt(lukija.nextLine());
                    } catch (NumberFormatException e) {
                        ikaraja = 18;
                    }
                    elokuvat.add(new Elokuva(nimi, ikaraja));
                };
                break;
            case 2:
                System.out.println("Monenneko listalla olevan elokuvan haluat poistaa");
                int luku = lukija.nextInt();
                System.out.println("Poistetaan elokuva " + elokuvat.get(luku-1));
                elokuvat.remove(luku-1);
                break;
            case 3:
                System.out.println("Elokuvat ja niiden ikärajat: ");
                for(Elokuva elokuva1 : elokuvat){
      
                    if(ika < elokuva1.ikaraja){
                            System.out.println("Et saa katsoa elokuvaa " + elokuva1.nimi + " koska ikäraja on " + elokuva1.ikaraja);
                    } else{
                            System.out.println("Saat katsoa elokuvaa " + elokuva1.nimi + " koska ikäraja on " + elokuva1.ikaraja);
                    }
                };
                break;
        }
    lukija.close();
    }
}
