public class lukuLaatikko {

    public static void main(String[] args){
        int a = 1; 
        int b = 1;
        int c = 5;
        
        while (a <=5){
            while (b<=c){
                System.out.print(b + "\t");
                b++;
            }
            a++;
            System.out.println("\n");
            c = c + 5;
        }
    }   
}
