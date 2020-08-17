package zadania.sekcja27Paradygmaty.telewizory;

import zadania.sekcja27Paradygmaty.telewizory.Philips.P43PUS652;
import zadania.sekcja27Paradygmaty.telewizory.Samsung.UE43RU7172;

import java.util.Scanner;

public class MainPPPodsumowanie {

    public static void main(String[] args) {
        obslugaTelewizora();
    }

    private static void obslugaTelewizora(){
        Scanner scanner = new Scanner(System.in);
        P43PUS652 tv = new P43PUS652("UnikalneId123");

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
