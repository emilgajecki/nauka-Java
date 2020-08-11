package zadania.sekcja7Tablice;


public class Zadanie7TabliceMain {
    public static void main(String[] args) {

        /**
         * 1. Uzupełnij tablicę typu int rozmiaru 5 dowolnymi wartościami.
         * Następnie zsumuj wszystkie elementy tej tablicy i wynik wypisz na ekran.
         * Sumowania dokonaj poprzez dodawanie elementów odwołując się do indeksów tablicy.
         */

        int [] tab1 = new int[] {10,20,30,40,50};
        int sumaTablic = tab1[0]+tab1[1]+tab1[2]+tab1[3]+tab1[4];

        System.out.println("Suma Tablic wynosi "+sumaTablic);

        /**
         * 2. Utwórz tablicę dwuwymiarową typu double wymiaru 3x5 i
         * także wypełnij dowolnymi wartościami. Tym razem zsumuj elementy z
         * każdego wiersza osobno i wypisz wynik na ekran.
         */

        double [][] tabDouble = {{1.1,11.11,100.100,111.111,1000.1000},
            {2.2,22.22,200.200,222.222,2000.2000}, {3.3,33.33,300.300,333.333,3000.3000}};

        double wynikWiersz1 =tabDouble[0][0]+tabDouble[0][1]+tabDouble[0][2]+tabDouble[0][3]+tabDouble[0][4];
        double wynikWiersz2 =tabDouble[1][0]+tabDouble[1][1]+tabDouble[1][2]+tabDouble[1][3]+tabDouble[1][4];
        double wynikWiersz3 =tabDouble[2][0]+tabDouble[2][1]+tabDouble[2][2]+tabDouble[2][3]+tabDouble[2][4];

        System.out.println("\nWynik pierwszego wiersza "+wynikWiersz1+"\n"+"Wynik drugiego wiersza "+wynikWiersz2
                +"\n"+ "Wynik trzeciego wiersza "+ wynikWiersz3);

    }
}
