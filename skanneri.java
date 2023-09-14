import java.util.Scanner;

public class skanneri {
    public static void main(String[] args) {
        Scanner nimi = new Scanner(System.in);
        System.out.println("Syötä etunimesi");
        
        String etu = nimi.nextLine();
        
        System.out.println("Syötä sukunimesi");
        
        String suku = nimi.nextLine();
        System.out.println("Koko nimesi on: " + etu + " " + suku );

        nimi.close();
       
    }    
}
