package zadania.sekcja25Scanner;

import java.util.Scanner;

public class MainWczytywanieDanych {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String linia = scanner.nextLine();
            System.out.println(linia);

            if (linia.toLowerCase().equals("koniec")){
                System.out.println("No to koniec działania programu");
                break;
            }
        }
    }
}
