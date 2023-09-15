import java.util.Scanner;

public class Mysteeripeli {

    public static void main (String args[]){
        Scanner muuttuja = new Scanner(System.in);
        System.out.println("Anna nimesi");

        String nimesi = muuttuja.nextLine();

        Scanner muuttujaNro = new Scanner(System.in);
        System.out.println("Anna numero 1-" + (nimesi.length() + 5)+ ":");

        int numero = muuttujaNro.nextInt();

        if (numero == nimesi.length()){
            System.out.println("Oikein");
        }
        else {
            System.out.println("Väärin!");
        }

        muuttuja.close();
        muuttujaNro.close();
    }
    
}
