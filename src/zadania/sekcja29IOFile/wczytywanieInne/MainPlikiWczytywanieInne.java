package zadania.sekcja29IOFile.wczytywanieInne;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MainPlikiWczytywanieInne {
    public static void main(String[] args) {
        // Scanner
        // FileReader - plik do znakow - tekst, wyrazy
        // InputStreamReader - surowe dane, byte

        // Jak wczystac caly plik od razu
        try {
            // readAllLines zwraca nam Liste Stringow
            List<String> allLines = Files.readAllLines(Paths.get("przykladowy_plik.txt"));
            // kazdy element bedzie oddzieloy przecinkiem
            System.out.println(allLines);
        } catch (IOException e) {
            System.out.println("Coś poszło nie tak");
        }
    }
}
