public class AutoLuokka {
        //Oliomuuttujat
        private String merkki;
        private int vuosimalli;
        private String kayttovoima;
        
        //Konstruktori
        public AutoLuokka(String merkki, int vuosimalli, String kayttovoima){
        this.merkki = merkki;
        this.vuosimalli = vuosimalli;
        this.kayttovoima = kayttovoima;
        }

        public AutoLuokka(String merkki, int vuosimalli){
        this.merkki = merkki;
        this.vuosimalli = vuosimalli;
        this.kayttovoima = "Ei tiedossa";
        }

        public AutoLuokka(String merkki){
        this.merkki = merkki;
        this.vuosimalli = 0;
        this.kayttovoima = "Ei tiedossa";
        }

        
        
        //Metodit
        public void kaynnista(){
            if (vuosimalli == 0 && kayttovoima == null){
                System.out.println(merkki + " on nyt käynnissä!");
            } else if (vuosimalli > 0 && kayttovoima == null){
                System.out.println(merkki + " on nyt käynnissä!(vuosimalli: " + vuosimalli + ")");
            } else {
                System.out.println(merkki + " on nyt käynnissä!(vuosimalli: " + vuosimalli + ", käyttövoima: " + kayttovoima + ")");
            }
            
        }
        
        public static void main(String[] args){
            AutoLuokka autoolio = new AutoLuokka("Toyota", 2018, "Bensiini");
            autoolio.kaynnista();
            AutoLuokka toinenautoolio = new AutoLuokka("Nissan", 2011);
            toinenautoolio.kaynnista();
            AutoLuokka kolmasautoolio = new AutoLuokka("Volkswagen");
            kolmasautoolio.kaynnista();
        }
}
