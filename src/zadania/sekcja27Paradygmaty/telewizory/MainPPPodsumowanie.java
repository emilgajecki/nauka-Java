package zadania.sekcja27Paradygmaty.telewizory;

import zadania.sekcja27Paradygmaty.telewizory.Philips.P43PUS652;
import zadania.sekcja27Paradygmaty.telewizory.Samsung.UE43RU7172;

import java.util.Scanner;

public class MainPPPodsumowanie {

    public static void main(String[] args) {
 //       obslugaTelewizora();
        obslugaPilota();
    }


    private static void obslugaTelewizora(){
        Scanner scanner = new Scanner(System.in);
        Telewizor tv = new UE43RU7172("UnikalneId123");

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
        }scanner.close();
    }

    private static void obslugaPilota(){
        Pilot pilot = new PilotNoName() ;
        Telewizor telewizor = new UE43RU7172("SuperUnikalneID123") ;
        pilot.sparujTelewizor(telewizor);
        Scanner scanner = new Scanner(System.in);
        int opcja;

        System.out.println("0. Naciśnij czerwony; 1. Nacisnij 1; 2. Nacisnij 2; 3.Nacisnij 3; 4.Zakoncz");

        do {
            opcja=scanner.nextInt();
            switch (opcja){
                case 0:
                    pilot.nacisnijCzerwony();
                    break;
                case 1:
                    pilot.nasisnijPrzyciskJeden();
                    break;
                case 2:
                     pilot.nacisnijPrzyciskDwa();
                     break;
                case 3:
                    pilot.nacisnijPrzyciskTrzy();
                    break;
            }
        } while (opcja!=4);
        scanner.close();
    }
}
