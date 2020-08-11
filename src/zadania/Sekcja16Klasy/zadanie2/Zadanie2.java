package zadania.Sekcja16Klasy.zadanie2;

public class Zadanie2 {


    /**
     *
     * TODO - ZADANIE DO POWTÓRKI - SŁABO POSZŁO GENEROWANIE METAOD - metoda utworzona wraz z Lukaszem
     * Napisz klasę, która w konstruktorze będzie przyjmować tablicę oraz będzie posiadać cztery metody:
     * - zliczającą sumę wszystkich elementów z tablicy
     * - liczącą średnią
     * - znajdującą wartość najmniejszą
     * - znajdującą wartość największą
     *
     * Każda z metod powinna zwracać wynik jako int.
     * Utwórz pole przechowujące tablicę. Załóż, że w tablicy będą tylko liczby całkowite.
     * Pola będą prywatne a metody i konstruktor publiczne.
     * Klasę, pole i metody nazwij według własnego uznania.
     * Przetestuj całość w main.
     */

    int srednia;
    int najmniejszaWartosc;
    int najwiekszaWartosc;
    int []tab;

    public Zadanie2(int[]podajTablica ){
        tab=podajTablica;
    }

    int sumaWszyskichElementow() {
        int suma = 0;
        for(int i = 0; i <= tab.length; i ++){
            suma = suma+tab[i];
        }
        return suma;
    }

    int getSrednia(){
        return srednia;
    }

    int getNajmniejszaWartosc(){
        return najmniejszaWartosc;
    }

    int getNajwiekszaWartosc(){
        return najwiekszaWartosc;
    }



}