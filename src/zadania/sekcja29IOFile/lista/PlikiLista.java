package zadania.sekcja29IOFile.lista;

import java.util.ArrayList;
import java.util.List;

public class PlikiLista {
    public static void main(String[] args) {
        //przyp. tworzenie tablicy
        // tworzymy i przypisujemy ile będzie elementów
        int [] tablica = new int[10];
        // typy proste    // typy osłonowe
        // int              Integer
        // boolean          Boolean
        // char             Character
        // float            Float
        // double           Double

        // tworzenie listy
        //List<wpisujemy jakiego typu ma być lista>

        // tutaj jest interefejs a tutaj konkretna klasa
        List<Integer> mojaLista = new ArrayList<>();

        // dodwanie elementow na liscie
        mojaLista.add(10);
        mojaLista.add(5);
        mojaLista.add(-101);
        mojaLista.add(5000);
        mojaLista.add(1234);

        // kasowanie elementow z listy
        mojaLista.remove(3);
        //              wielkosć/rozmaiar listy za pomoca size
        for (int i =0;i<mojaLista.size(); i++)
            //wyswietelenie danych z listy
            System.out.println(mojaLista.get(i));

        //lista Stringow
        List<String> listaStringow = new ArrayList<>();
        listaStringow.add("Jakiś");
        listaStringow.add("Teskt");

        System.out.println(listaStringow);
    }
}
