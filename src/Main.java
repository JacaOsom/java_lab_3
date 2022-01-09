import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćw 3 klasy */
        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */
        Punkt punktA = new Punkt(10);
        System.out.println("A: " + punktA.toString());

        punktA = new Punkt(3,4,2);
        System.out.println("A: " + punktA.toString());

        punktA.setpX(4);
        punktA.setpY(5);
        punktA.setpZ(6);
        System.out.println("A: " + punktA.toString());

        System.out.println(punktA.getpX());
        System.out.println(punktA.getpY());
        System.out.println(punktA.getpZ());

        System.out.println("Suma: " + punktA.suma());
        System.out.println("Różnica 1: " + punktA.roznica());
        System.out.println("Różnica 2: " + punktA.roznica(2, 3, 4));




    }
}
