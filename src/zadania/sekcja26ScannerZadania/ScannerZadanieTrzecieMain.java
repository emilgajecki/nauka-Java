package zadania.sekcja26ScannerZadania;

import java.util.Scanner;

public class ScannerZadanieTrzecieMain {

    public static void main(String[] args) {
        /**
         * Zadanie 3
         * Wczytaj całą linię tekstu z klawiatury. Następnie pobierz liczbę. Wypisz na ekran wczytaną linię tyle razy ile wynosi podana liczba
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("wprowadz tekst");
        String linia = scanner.nextLine();
        System.out.println("Wprowadz liczbe");
        int liczba = scanner.nextInt();
        for(int i =0;i<liczba;i++){
            System.out.println(linia);
        }





    }
}
