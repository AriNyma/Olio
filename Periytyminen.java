public class Periytyminen{
    public static void main(String[] args){
        Tyontekija tyo_olio = new Tyontekija("Aamos Lehtinen", "Punostie 2", 2017, "Johtaja", 233);
        tyo_olio.TyontekijanTiedot();
    }
}

class Henkilo{
    private String nimi;
    private String osoite;
    private int syntymavuosi;
   
    public Henkilo(String nimi, String osoite, int syntymavuosi) {
        this.nimi = nimi;
        this.osoite = osoite;
        this.syntymavuosi = syntymavuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public String getOsoite() {
        return osoite;
    }

    public int getSyntymavuosi() {
        return syntymavuosi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    public void setSyntymavuosi(int syntymavuosi) {
        this.syntymavuosi = syntymavuosi;
    }
}

class Tyontekija extends Henkilo {
    private String titteli;
    private int tyohuoneen_nro;
    
    public Tyontekija(String nimi, String osoite, int syntymavuosi, String titteli, int tyohuoneen_nro) {
        super(nimi, osoite, syntymavuosi);
        this.titteli = titteli;
        this.tyohuoneen_nro = tyohuoneen_nro;
    }

    public String getTitteli() {
        return titteli;
    }

    public int getTyohuoneen_nro() {
        return tyohuoneen_nro;
    }

    public void TyontekijanTiedot() {
        System.out.println("****************************");
        System.out.println("Työntekijän tiedot");
        System.out.println("Nimi: " + this.getNimi());
        System.out.println("Osoite: " + this.getOsoite());
        System.out.println("Syntymävuosi: " + this.getSyntymavuosi());
        System.out.println("Työhuoneen numero: " + this.getTyohuoneen_nro());
        System.out.println("****************************");
    }
}