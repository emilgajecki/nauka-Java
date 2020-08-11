package zadania.sekcja19Wyjatki.tryICatch;

public class WyjatkiObslugaMain {

    static String str;
    static int[] tablica;

    public static void main(String[] args) {

        str = "test";
        tablica = new int[2];
        try {
            /**
             * W tym miejscy wpisujemy blok kodu, który chcemy wykoańć
             */

            System.out.println("Czy string jest pusty: " + str.isEmpty());
            System.out.println("Wszystko przebiegło prawidłowo");

            tablica[0] = 101;
            tablica[1] = 202;
            tablica[2] = 303;

        } catch (NullPointerException e) {
            /**
             * W tym miejscu wpisujemy blok kodu który, który jest reakcją na błąd wywołany wyźej
             */

            System.out.println("nie masz zainicjonowaniej zmiennej - dlatgo poszedł Null");
            System.out.println("Utwórz stringa poprawnie");

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Sprawdź jaka masz tablice zdefiniowaną");
        }

    }
}
