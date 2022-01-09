public class Student {

    String imie;
    String nazwisko;
    int wiek;
    boolean maZnizke;

    public boolean czyMaZnizke() {
        if (wiek > 26){
            maZnizke = false;
            System.out.println("Student nie ma zniżki");
        }
        else {
            maZnizke = true;
            System.out.println("Student ma zniżkę");
        }
        return maZnizke;
    }
}
