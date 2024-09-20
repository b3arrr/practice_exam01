package exam;

public class Lydbok extends Bok {
    int lengdeminutter;

    Lydbok(String tittel, String forfatter, Double pris, int lengdeminutter) {
        super(tittel, forfatter, pris);
        this.lengdeminutter = lengdeminutter;
    }
    @Override
    public String toString() {
        return lengdeminutter + super.toString();
    }
}

