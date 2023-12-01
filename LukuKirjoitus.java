import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LukuKirjoitus {
    public static void main(String[] args) {
        while(true){
            //Luodaan uusi Scanner-olio
            System.out.print("Kirjoita rivi: ");
            Scanner kirjoitus = new Scanner(System.in);
            //Sijoitetaan tekstimuuttujaan tieto näppäimistöltä
            String syote = kirjoitus.nextLine();
            //Ajetaan tiedostoon kirjoitus
            kirjoitaTiedostoon(syote);
            //Tulostetaan tiedosto
            lueTiedosto();
            kirjoitus.close();
        }
    }

    private static void lueTiedosto() {
        try 
        {
            //Uusi tiedosto-olio
            File myObj = new File("U:\\Olio ohjelmointi\\tiedosto.txt");
            //Luodaan Scanner-olio, jolle viedään tiedoston tiedot oliona
            Scanner myReader = new Scanner(myObj);
            System.out.println("***********************************");
            //Tulostetaan niin kauan, kun rivejä löytyy
            while (myReader.hasNextLine())
            {
                //Haetaan uusi rivi
                String data = myReader.nextLine();
                //Tulostetaan rivi
                System.out.println(data);
            }
            System.out.println("***********************************");
            myReader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Tiedostoa ei löydy.");
            e.printStackTrace();
        }
    }

    private static void kirjoitaTiedostoon(String teksti) {
        try {
            //Luodaan uusi FileWriter-olio, jolle viedään parametrina polku tiedostoon
            FileWriter fw = new FileWriter("U:\\Olio ohjelmointi\\tiedosto.txt", true); // true tarkoittaa, että kirjoitetaan tiedoston loppuun
            //Luodaan uusi puskuri->BufferedWriter
            BufferedWriter bw = new BufferedWriter(fw);
            //Kitjoitetaan tiedostoon
            bw.write(teksti);
            //Lisätään uusi rivi
            bw.newLine();
            bw.close();
            System.out.println("Tieto lisätty tiedostoon: " + teksti);
        }
        catch (IOException e)
        {
            System.out.println("Virhe kirjoitettaessa tiedostoon.");
            e.printStackTrace();
        }
    }
}
