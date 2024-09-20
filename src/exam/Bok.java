package exam;

public class Bok {
    String tittel;
    String forfatter;
    Double pris;
    Bok(String tittel, String forfatter, Double pris) {
        this.tittel = tittel;
        this.forfatter = forfatter;
        this.pris = pris;
    }
    @Override
    public String toString() {
        return tittel + "\t" + forfatter + "\t" + pris;
    }
  
}
