abstract class Henkilo {
    private String nimi;
    private int syntymaAika;

    public Henkilo(String nimi, int syntymaAika){
        this.nimi = nimi;
        this.syntymaAika = syntymaAika;
    }

    public String getNimi(){
        return nimi;
    }

    public int getSyntymaAika(){
        return syntymaAika;
    }

    public abstract void parkkilupa();
}

class Opiskelija extends Henkilo{
    private boolean opintoOikeus;

    public Opiskelija (String nimi, int syntymaAika, boolean opintoOikeus){
        super(nimi, syntymaAika);
        this.opintoOikeus = opintoOikeus;
    }

    public boolean getOpintoOikeus(){
        return opintoOikeus;
    }

    public void parkkilupa(){
        if(opintoOikeus == true){
            System.out.println("Opiskelijalla on pysäköintioikeus");
        } else {
            System.out.println("Opiskelijalla ei ole pysäköintioikeutta");
        }
    }
}

class Opettaja extends Henkilo{
    private boolean sopimusVoimassa;

    public Opettaja (String nimi, int syntymaAika, boolean sopimusVoimassa){
        super(nimi, syntymaAika);
        this.sopimusVoimassa = sopimusVoimassa;
    }

    public boolean getSopimusVoimassa(){
        return sopimusVoimassa;
    }

    public void parkkilupa(){
        if(sopimusVoimassa == true){
            System.out.println("Opettajalla on pysäköintioikeus");
        } else {
            System.out.println("Opettajalla ei ole pysäköintioikeutta");
        }
    }

}

public class Abstrakti {
    public static void main(String[] args) {
        
        Opiskelija opiskelija = new Opiskelija("Student One", 1990, false);
        
        // Accessing and printing information about the student
        System.out.println("Opiskelija:");
        System.out.println("Nimi: " + opiskelija.getNimi());
        System.out.println("Syntymäaika: " + opiskelija.getSyntymaAika());
        System.out.println("Opinto-oikeus: " + opiskelija.getOpintoOikeus());

        // Calling the parkkilupa method for the student
        opiskelija.parkkilupa();
        System.out.println();

        // Creating an Opettaja (Teacher) instance
        Opettaja opettaja = new Opettaja("Teacher One", 1980, true);

        // Accessing and printing information about the teacher
        System.out.println("Opettaja:");
        System.out.println("Nimi: " + opettaja.getNimi());
        System.out.println("Syntymäaika: " + opettaja.getSyntymaAika());
        System.out.println("Sopimus voimassa: " + opettaja.getSopimusVoimassa());

        // Calling the parkkilupa method for the teacher
        opettaja.parkkilupa();
    }
}