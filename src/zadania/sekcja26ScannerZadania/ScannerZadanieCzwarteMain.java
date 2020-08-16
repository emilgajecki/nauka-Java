package zadania.sekcja26ScannerZadania;

import java.util.Scanner;

public class ScannerZadanieCzwarteMain {
    public static void main(String[] args) {
        /**
         * Zadanie 4
         * Wczytuj liczby i licz ich sumę. Zakończ działanie w momencie napotkania liczby ujemnej
         */

        Scanner scanner = new Scanner(System.in);
        int wynik = 0;
        int liczbaNieujemna;
        System.out.println("Wprowadz cyfre");
        while((liczbaNieujemna = scanner.nextInt())>=0) {
            wynik += liczbaNieujemna;
            System.out.println(wynik);
            }
        System.out.println("podałeś liczne ujemną - praca zakończona");



       }
    }
