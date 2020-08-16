package zadania.sekcja26ScannerZadania;

import java.util.Scanner;

public class ScannerZadaniePierwszeMain {
    public static void main(String[] args) {

        /**
         * Zadanie 1
         * Wykorzystując Scanner wczytaj wpisane z klawiatury imię, nazwisko oraz wzrost. Następnie wypisz na ekran zdanie:
         * “Jestem <imię> <nazwisko> i mam <wzrost> cm wzrostu”
         */
        Scanner scanner = new Scanner(System.in);


            System.out.println("Podaj swoje imie");
        String imie = scanner.nextLine();;
            System.out.println("Podaj swoje nazwisko");
        String nazwisko = scanner.nextLine();
            System.out.println("Podaj swoj wzrost");
        int wzrost = scanner.nextInt();
            System.out.println("Jestem "+imie+" "+nazwisko+ " i mam "+wzrost+ " cm wzrostu");

    }






    }
