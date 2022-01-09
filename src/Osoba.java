public class Osoba {
    private String imie;
    private String nazwisko;
    private Integer indeks;

    public Osoba() {
    }

    public Osoba(String imie, String nazwisko, Integer indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Integer getIndeks() {
        return indeks;
    }

    public void setIndeks(Integer indeks) {
        this.indeks = indeks;
    }

    public void wyswietlInfoOsoba(){
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Indeks: " + indeks);
    }

//    @Override
//    public String toString() {
//        return "Imię: " + imie +
//                "\nNazwisko: " + nazwisko +
//                "\nIndeks: " + indeks;
//    }
}
