package Moniprojekti;

import java.util.ArrayList;

public class Tulostin {
    public void tulostaMonesti1(Object olio, int kertaa){
        int i = 0;
        while(i<kertaa){
            System.out.println(olio);
            i++;
        }
    }

    public void tulostaMonesti2(ArrayList<String> olio){     
        for(String rivi : olio){
            System.out.println(rivi);
        } 
    }
}
