package zadania.sekcja26ScannerZadania;

import java.util.Scanner;

public class ScannerZadanieDrugieMain {
    public static void main(String[] args) {

        /**
         * Zadanie 2
         * Wczytuj z klawiatury dane do momentu napotkania małego ‘x’ bądź dużego ‘X’. Wypisuj na ekran teksty, które są oddzielane średnikiem ';'
         */


        Scanner scanner = new Scanner(System.in);
        String tekst;
        System.out.println("Wprowadz tekst");
        scanner.useDelimiter(";");
        while (!(tekst=scanner.next()).toLowerCase().equals("x")) {

            System.out.println("Wpisany tekst to: " + tekst);

        }
    }
}
