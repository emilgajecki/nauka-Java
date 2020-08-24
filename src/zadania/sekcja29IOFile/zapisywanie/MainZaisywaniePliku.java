package zadania.sekcja29IOFile.zapisywanie;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainZaisywaniePliku {

    public static void main(String[] args) {

        try{
        String path = "moj_plik.txt";
        // w konstruktorze musimy dodac append true - pozowli nam to dopisac do aktualnego wpisu
        FileWriter fileWriter = new FileWriter(path, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // wszystko zapisze w jedej linii - nadpisze napisane wczesniej
        bufferedWriter.write("Test widaomości \n");
        bufferedWriter.write("Test wiadomości 1\n");
        bufferedWriter.write("Test.wiadomości 2 \n");

        // zostawiamy tutaj bo zakladmy, ze wszysko dobrze sie wykona
        bufferedWriter.close();

        } catch (IOException e){
            System.out.println("Błąd na operacji z plikiem");
        } finally {
         // buffered powinien być w finnalu - aby unikanc bledow
        }
    }
}
