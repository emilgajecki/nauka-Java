package zadania.sekcja27Paradygmaty;

import java.util.Scanner;

public class MainPPPodsumowanie {

    public static void main(String[] args) {
        obslugaTelewizora();
    }

    private static void obslugaTelewizora(){
        Scanner scanner = new Scanner(System.in);
        UE43RU7172 tv = new UE43RU7172("UnikalneId123");

        int opcja =0;
        System.out.println("1.Włącz TV; 2.Wyłącz; 3.Zmień program; 4.Zakończ");
        while(opcja !=4){
            opcja = scanner.nextInt();

            switch (opcja){
                case 1:
                    tv.wlacz();
                    break;
                case 2:
                    tv.wylacz();
                case 3:
                    System.out.println("Podaj nr programu");
                    int mumer = scanner.nextInt();
                    tv.zmienKanal(mumer);
                    break;
            }
        }
    }
}
