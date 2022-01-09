import java.rmi.ConnectIOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */
        Samochod samochod1 = new Samochod(RodzajPojazduEnum.OSOBOWY, "Audi", "A5", 2018, 275, RodzajSamochoduEnum.COUPE);
        Samochod samochod2 = new Samochod(RodzajPojazduEnum.OSOBOWY, "KIA", "Ceed", 2019, 240, RodzajSamochoduEnum.KOMBI);

        Ciężarówka ciężarówka1 = new Ciężarówka(RodzajPojazduEnum.CIĘŻAROWY, "Scania", "R500", 2014, 787124);
        Ciężarówka ciężarówka2 = new Ciężarówka(RodzajPojazduEnum.CIĘŻAROWY, "DAF", "XF460", 2017, 425878);

        Motocykl motocykl1 = new Motocykl(RodzajPojazduEnum.MOTOCYKL, "Yamaha", "YZF-R6", 2017, 600);
        Motocykl motocykl2 = new Motocykl(RodzajPojazduEnum.MOTOCYKL, "Honda", "CBR", 2019, 1000);
        List<Pojazd> pojazdList = new ArrayList<>();

        //dodawanie pojazdów do listy
        pojazdList.add(samochod1);
        pojazdList.add(samochod2);
        pojazdList.add(ciężarówka1);
        pojazdList.add(ciężarówka2);
        pojazdList.add(motocykl1);
        pojazdList.add(motocykl2);

        samochod1.jazdaAutem();
        System.out.println("");

        ciężarówka1.jedzTIR();
        System.out.println("");

        Motocykl.porownajPojemnosc(motocykl1, motocykl2);
        System.out.println("");

        for (Pojazd item : pojazdList) {
            System.out.println(item.toString());
        }

    }
}
