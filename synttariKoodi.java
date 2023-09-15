import java.util.Scanner;

public class synttariKoodi {

    public static void main(String[] args){
        int i = 0;
        Scanner vuosi = new Scanner(System.in);
        System.out.println("Anna syntymävuotesi");
        
        int alku = vuosi.nextInt();

        while (i < 101){
            if (i %5 == 0){
                System.out.println(alku + " Onnea! Täytit " + i + " vuotta");
            }
            else {
                System.out.println(alku);
            }
            alku++;
            i++;
        }
    }
}