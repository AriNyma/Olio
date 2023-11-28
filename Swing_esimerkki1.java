import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class Swing_esimerkki1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing-esimerkki1"); //luodaan ikkuna
        frame.setSize(300, 200); //ikkunan koko
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sulkee ohjelman kun ikkuna suljetaan
        
        JButton button = new JButton("Klikkaa"); //luodaan painike
        frame.add(button);

        JLabel label = new JLabel("Tämä on tekstiruutu"); //luodaan tekstikenttä
        frame.add(label);   

        button.addActionListener( //lisätään painikkeelle tapahtumankuuntelija
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                    int i = 1;
                    String numbers = "<html>";
                     while (i < 21) {
                            numbers +=  i + "<br>"; //lisätään tekstikentän tekstiin
                            i++;
                     } 
                     numbers += "</html>"; //muutetaan tekstikentän teksti
                    button.setVisible(false); //piilotetaan painike
                    label.setText(numbers);
                }
            }
        );

        frame.setLayout(new FlowLayout()); //asetetaan asettelu
        frame.setVisible(true); //ikkuna näkyviin
    }  
}
