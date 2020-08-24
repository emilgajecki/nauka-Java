package zadania.sekcja30IOFileZadania;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainZadanie {
    public static void main(String[] args) {
        /**
         * Zapisz plik, który znajduje się w załączonych materiałach, przenieś do projektu, a następnie:
         *
         * a) wypisz jego zawartość na ekran
         *
         * b) zlicz i wypisz ilość znaków występujących w pliku
         *
         * c) wczytaj dowolny tekst z klawiatury i sprawdź czy znajduje się dana fraza pliku
         *
         * d) w pliku może znajdować się wiele takich fraz. Znajdź wszystkie i wypisz n
         * r linii wraz z całą linią tam gdzie znajduje się szukany tekst w postaci:
         * <nr linii>: <cała linia z szukanym tekstem>
         * // Zakomentuj wypisywanie z podpunktu a), aby wynik był czytelniejszy
         *
         * e) przekopiuj całą zwartość do nowego pliku o nazwie "fragment-kopia.txt". Otwórz plik i sprawdź czy
         * kopia została poprawnie utworzona. Dopisz na końcu pliku "Kopia pliku utworzona przez <imię nazwisko>"
         */


        try {
            File file = new File("fragment.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String sciezka = "fragment-kopia.txt";
            FileWriter fileWriter = new FileWriter(sciezka);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj szukaną fraze");
            String szukanaFraza = scanner.nextLine();

            String linia;
            int liczbaZnakow =0;
            boolean czyZawieraFraze = false;
            int nrLinii =0;
            while ((linia = bufferedReader.readLine()) != null) {
                nrLinii++;
                /**
                 * Zadanie a
                 */
                //System.out.println(linia);

                /**
                 * Zadanie b
                 */

                liczbaZnakow += linia.length();

                /**
                 * Zadanie c
                 */
                if(linia.toLowerCase().contains(szukanaFraza)){
                    czyZawieraFraze =true;

                }

                /**
                 * Zadanie d
                 */
                if (linia.toLowerCase().contains(szukanaFraza)){
                    System.out.println(nrLinii+ ": "+linia);
                }

                /**
                 * Zadanie e
                 */
                bufferedWriter.write(linia);
            }
            System.out.println("\nLiczba znakow "+ liczbaZnakow);
            System.out.println("Czy zawiera fraze "+czyZawieraFraze);

            // zamykanie źródeł
            bufferedReader.close();
            bufferedWriter.close();
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
        } catch (IOException e) {
            System.out.println("Coś poszło nie tak");
        }
    }
}
