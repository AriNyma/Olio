package koeharjoitus;

abstract class Henkilo {
    private String nimi;
    private int syntAika;

    public Henkilo(String nimi, int syntAika){
        this.nimi = nimi;
        this.syntAika = syntAika;
    }

    public String getNimi() {
        return nimi;
    }

    public int getSyntAika() {
        return syntAika;
    }

    public void setNimi(String nimi){
        this.nimi = nimi;
    }

    public void setSyntAika(int syntAika){
        this.syntAika = syntAika;
    }

    public abstract void parkkilupa();
}

class Opettaja extends Henkilo{
    private boolean tyosopimus;

    public Opettaja(String nimi, int syntAika, boolean tyosopimus){
        super(nimi, syntAika);
        this.tyosopimus = tyosopimus;
    }

    public boolean getTyosopimus(){
        return tyosopimus;
    }

    public void parkkilupa(){
        if (tyosopimus == true){
            System.out.println("Pysäköintilupa on voimassa");
        }else{
            System.out.println("Pysäköintilupa ei ole voimassa");
        }
    }
}

class Opiskelija extends Henkilo{
    private boolean opintoOikeus;

    public Opiskelija(String nimi, int syntAika, boolean opintoOikeus){
        super(nimi, syntAika);
        this.opintoOikeus = opintoOikeus;
    }

    public boolean getOpintoOikeus(){
        return opintoOikeus;
    }

    public void parkkilupa(){
        if (opintoOikeus == true){
            System.out.println("Pysäköintilupa on voimassa");
        }else{
            System.out.println("Pysäköintilupa ei ole voimassa");
        }
    }
}
