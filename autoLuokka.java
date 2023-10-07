public class autoLuokka {
    private String merkki;
    private int teho;
    private int vm;

    public autoLuokka(String merkki, int teho, int vm){
        this.merkki = merkki;
        this.teho = teho;
        this.vm = vm;
    }

    public void kaynnista() {
        System.out.println(merkki + " on käynnissä. Kaikella " +  vm + " vuosimallin " + teho + " hevosvoimalla");
    } 

    public static void main(String[] args){
        autoLuokka auto1 = new autoLuokka("Mursu", 1, 2000);

        auto1.kaynnista();
    }
}
