import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        Student student1 = new Student();
        student1.imie = "Bartosz";
        student1.nazwisko = "Kowalski";
        student1.wiek = 22;


        Student student2 = new Student();
        student2.imie = "Karolina";
        student2.nazwisko = "Lewandowska";
        student2.wiek = 20;

        Student student3 = new Student();
        student3.imie = "Marcin";
        student3.nazwisko = "Nowak";
        student3.wiek = 27;

        Student[] tab = new Student[3];
        tab[0] = student1;
        tab[1] = student2;
        tab[2] = student3;

        for (Student item : tab) {
            System.out.println("\nSTUDENT");
            System.out.println("Imię: " + item.imie);
            System.out.println("Nazwisko: " + item.nazwisko);
            System.out.println("Wiek: " + item.wiek);
            System.out.println("Czy ma zniżkę?: " + item.czyMaZnizke());
        }

    }
}
