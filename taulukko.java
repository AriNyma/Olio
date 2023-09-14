import java.util.Scanner;

public class taulukko {
    public static void main(String[] args) {
        int i = 0;
        String[] nimet = new String[3];
        
        Scanner nimi = new Scanner(System.in);
        System.out.println("Syötä etunimesi");
        
        nimet[0] = nimi.nextLine();

        System.out.println("Syötä sukunimesi");
        
        nimet[1] = nimi.nextLine();

        System.out.println("Syötä luku");

        nimet[2] = nimi.nextLine();
       
        while (i < Integer.parseInt(nimet[2]))
        {
            System.out.println("Koko nimesi on: " + nimet[0] + " " + nimet[1] );
            i++;
        }
        nimi.close();     
    }    
}