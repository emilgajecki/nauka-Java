package zadania.sekcja29IOFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainWczytywaniePlikow {
    public static void main(String[] args) {

        //utworzenie lokalnego pliku i wczytanie go po przekazaniu do kontruktora Scannera

        try {
            File file = new File("plik.txt");
            Scanner scanner = new Scanner(file);

            //petla, która bedzie wczytywała dane dopuki bedzie nastepna linijka
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku!");
        }
    }
}
