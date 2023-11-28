public class SetteriTesti {

    public static void main(String[] args) {
        SetteriTesti st = new SetteriTesti();
        Henkilo henkilo_olio = st.new Henkilo("Matti", 34);
        System.out.println("Henkilön nimi on " + henkilo_olio.getNimi() + " ja ikä on " + henkilo_olio.getIka());
        //henkilo_olio.setNimi("Aamos");    
    }

    class Henkilo{
        private String nimi;
        private int ika;
        
        public Henkilo(String nimi, int ika) { //hiiren oikea ja sieltä source action ja generate konstruktori
            this.nimi = nimi;
            this.ika = ika;
        }

        public int getIka() { // kirjoita get ja tuplaklikkaa enter niin ohjelma syöttää tiedot automaattiesti
            return ika;
        }
        public String getNimi() {
            return nimi;
        }
        public void setIka(int ika) {
            this.ika = ika;
        }
        public void setNimi(String nimi) {
            this.nimi = nimi;
        }
    }
    
}
