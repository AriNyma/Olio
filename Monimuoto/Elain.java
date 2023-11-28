package Monimuoto;

public class Elain {
    private int paino;

    public Elain(int paino){
        this.paino = paino;
    }

    public void Syo(){
        System.out.println("Eläin syö");
    }

    public int getPaino(){
        return paino;
    }
}

class Kissa extends Elain{
    private String rotu;

    public Kissa(String rotu, int paino){
        super(paino);
        this.rotu = rotu;
    }

    public String getRotu(){
        return rotu;
    }

}

class Koira extends Elain{
    private String rotu;
    
    public Koira(String rotu, int paino){
        super(paino);
        this.rotu = rotu;
    }

    public String getRotu(){
        return rotu;
    }
}
