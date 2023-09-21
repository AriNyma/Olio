public class taulukkoTaulukossa {

    public static void main(String[] args) {
        
        String[] henkilo1 = {"Pertti", "Virtanen"};
        String[] henkilo2 = {"Saila", "Penttilä"};
        String[] henkilo3 = {"Chuck", "Norris"};

        String[][] kaikki = new String[3][2];

        kaikki[0] = henkilo1;
        kaikki[1] = henkilo2;
        kaikki[2] = henkilo3;

        int i = 0;

        while (i < 3){
            System.out.println("Henkilö: " + (i+1));
            System.out.println(kaikki[i][0]);
            System.out.println(kaikki[i][1]);
            i++;
        } 
    }
}
