package exam;

public class Papirbok extends Bok {
    int ISBN;

    Papirbok(String tittel, String forfatter, Double pris, int ISBN) {
        super(tittel, forfatter, pris);
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return super.toString() + "\tISBN = " + ISBN;
    }
}
