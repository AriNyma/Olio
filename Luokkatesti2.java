public class Luokkatesti2 {

    class Tuote{
        private int hinta;
        private int tuotekoodi;
        private String tuotteen_nimi;
        
        public Tuote( String tuotteen_nimi, int hinta, int tuotekoodi){
            this.hinta = hinta;
            this.tuotekoodi = tuotekoodi;
            this.tuotteen_nimi = tuotteen_nimi;
        }
    
        public int getHinta(){
            return hinta;
        }
        public int getTuotekoodi(){
            return tuotekoodi;
        }
        public String getTuotteen_nimi(){
            return tuotteen_nimi;
        }
        
        public void setHinta(int hinta){
            this.hinta = hinta;
        }
        public void setTuotekoodi(int tuotekoodi){
            this.tuotekoodi = tuotekoodi;
        }
        public void setTuotteen_nimi(String tuotteen_nimi){
            this.tuotteen_nimi = tuotteen_nimi;
        }
        
        public void TulostaTuote(){
            System.out.println("Tuotteen tiedot");
            System.out.println("Tuotteen nimi: " + tuotteen_nimi);
            System.out.println("Hinta: " + hinta);
            System.out.println("Tuotekoodi: " + tuotekoodi);
        }
    }
    
}
