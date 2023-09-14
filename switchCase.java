
public class switchCase {

    static void viikonPaiva(){
       
        int lukutaulukko[] =  {1,4,3,5,6,3,2};
        int i = 0;
        while (i < lukutaulukko.length){
            int luku = lukutaulukko[i];
            switch (luku) {
                case 1:
                    System.out.println("Maanantai");
                    break;
                case 2:
                    System.out.println("Tiistai");
                    break;
                case 3:
                    System.out.println("Keskiviikko");
                    break;
                case 4:
                    System.out.println("Torstai");
                    break;
                case 5:
                    System.out.println("Perjantai");
                    break;
                case 6:
                    System.out.println("Lauantai");
                    break;
                case 7:
                    System.out.println("Sunnuntai");
                    break;
                default:
                    System.out.println("Epäkelpo valinta");
                    break;
            }
            i++;
        }
    }
    public static void main(String[] args){

        viikonPaiva(); 
    }
}
