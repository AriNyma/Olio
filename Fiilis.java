import java.util.Scanner;

public class Fiilis {

    public static void main(String[] args){
        int luku = 0;
        
        Scanner scanner = new Scanner(System.in);

        while (luku != 10){
            
            System.out.println("Minkälainen fiilis? Kerro numerolla 1-5 (1 huono - 5 paras, 10 lopettaa ohjelman):");
            
            int arvo = scanner.nextInt();

            switch(arvo) {
                case 1:
                    System.out.println("huonoin");
                    break;
                case 2:
                    System.out.println("huonompi");
                    break;                 
                case 3:
                    System.out.println("ihan ok");
                    break;                   
                case 4:
                    System.out.println("hyvä");
                    break;                                                             
                case 5:
                    System.out.println("erinoimainen");
                    break; 
                case 10:
                    System.out.println("Lopetetaan");
                    break;
                default:
                    System.out.println("MITÄ?!");
                    break; 
            }
            luku = arvo;
        }
        scanner.close();
    }
}
