package zadania.sekcja29IOFile.zapisywanie;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainZaisywaniePliku {

    public static void main(String[] args) {

        try{
        String path = "moj_plik.txt";
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // wszystko zapisze w jedej linii
        bufferedWriter.write("Test widaomości");
        bufferedWriter.write("Test wiadomości 1");
        bufferedWriter.write("Test.wiadomości 2");

        // zostawiamy tutaj bo zakladmy, ze wszysko dobrze sie wykona
        bufferedWriter.close();

        } catch (IOException e){
            System.out.println("Błąd na operacji z plikiem");
        } finally {
         // buffered powinien być w finnalu - aby unikanc bledow
        }
    }
}
