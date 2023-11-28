public class PerintaTesti{
    public static void main(String[] args){

        Kannettava kannettava_olio = new Kannettava("HP", "Win11", 299, 14, 1.2d);
        System.out.println(kannettava_olio.getMerkki());
        kannettava_olio.KannettaTervehdys();
    }
}
class Tietokone{
    private String merkki;
    private String kayttis;
    private int hinta;


    public Tietokone(String merkki, String kayttis, int hinta) {
        this.merkki = merkki;
        this.kayttis = kayttis;
        this.hinta = hinta;
    }

    //Getterit
    public int getHinta() {
        return hinta;
    }

    public String getKayttis() {
        return kayttis;
    }

    public String getMerkki() {
        return merkki;
    }

    //Metodit
    public void Tervehdys(){
        System.out.println("Tietokoneluokassa ollaan!");
    }
}

class Kannettava extends Tietokone{

    private int ruudun_koko;
    private double paino;

    public Kannettava(String merkki, String kayttis, int hinta, int ruudun_koko, double paino) {
        super(merkki, kayttis, hinta);
        this.ruudun_koko = ruudun_koko;
        this.paino = paino;
    }

    public double getPaino() {
        return paino;
    }

    public int getRuudun_koko() {
        return ruudun_koko;
    }

    public void KannettaTervehdys(){
        super.Tervehdys();
    }

}