import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
        Osoba osoba1 = new Osoba("Jacek", "Placek", 12345);
        Osoba osoba2 = new Osoba("Marita", "Kowalska", 45452);
        Osoba osoba3 = new Osoba("Joanna", "Nowak", 54321);
        Osoba osoba4 = new Osoba("Mateusz", "Janowski", 12323);
        Osoba osoba5 = new Osoba("Alojzy", "Gregorij", 32354);

        Student student1 = new Student(osoba1, WydzialEnum.INFORMATYKI);
        Student student2 = new Student(osoba2, WydzialEnum.FINANSOWY);
        Student student3 = new Student(osoba3, WydzialEnum.ZARZĄDZANIA);
        Student student4 = new Student(osoba4, WydzialEnum.ADMINISTRACJI);
        Student student5 = new Student(osoba5, WydzialEnum.INFORMATYKI);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        for (Student students: studentList) {
            System.out.println(students.toString());
        }
    }
}
