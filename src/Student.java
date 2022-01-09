public class Student extends Osoba{
    private Osoba osoba;
    private WydzialEnum wydzial;

    public Student() {
    }

    public Student(Osoba osoba, WydzialEnum wydzial) {
        this.osoba = osoba;
        this.wydzial = wydzial;
    }

    public Student(String imie, String nazwisko, Integer indeks, WydzialEnum wydzial) {
        super(imie, nazwisko, indeks);
        this.wydzial = wydzial;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public WydzialEnum getWydzial() {
        return wydzial;
    }

    public void setWydzial(WydzialEnum wydzial) {
        this.wydzial = wydzial;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWydział: " + wydzial;

    }
}
