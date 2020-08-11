package zadania.sekcja20WyjatkiZadania;

import zadania.Sekcja16Klasy.zadanie3.Matma;

public class WyjatkiZadaniaMain {
    public static void main(String[] args) {
        /**
         * 3 zadania
         * Utwórz package "wyjatki" i w nim umieszczaj tworzone klasy.
         *
         *
         * Zadanie 1
         * W metodzie main napisz kawałek kodu, który będzie dzielił liczby a/b (typu int) i wypisywał wynik na ekran.
         * Zobacz co się stanie, jeżeli pod b podasz liczbę 0. Spróbuj obsłużyć błąd try/catchem,
         * aby w przypadku dzielenia przez zero wyskoczył użytkownikowi komunikat:
         * “Nie wolno dzielić przez 0!”
         * (podpowiedź: należy obsłużyć wyjątek ArithmeticException)
         *
         */

        int a = 4;
        int b = 0;
        try{
            //w tym miejscu wykonujemy dzielenie
            int c = a/b;
            System.out.println(c);
        } catch(ArithmeticException e) {
            // tutaj obsługujemy błąc, który występuje przy dzieleniu przez 0
            System.out.println("Nie wolno dzielić przez 0");
        }


        /**
         *
         * Zadanie 2
         * Analogicznie do zadania 1, zaimplementuj metodę publiczną, statyczną (w tej samej klasie co metoda main) o nazwie “podziel”,
         * która będzie przyjmować parametry a oraz b i zwracać wynik z dzielenia a/b. Utwórz własny wyjątek typu check,
         * który będzie wyrzucany w przypadku podania liczby 0 w miejsce parametru b. Spróbuj wymyślić nazwę i pamiętaj o odpowiednim dziedziczeniu.
         * Sprawdź działanie metody wywołując ją w main.
         *
         */

        // zadanie przy wykorzysatniu ty catch
        try {
            System.out.println("Wynik z zadania 2 to : " + dzielenieZadanieDrugie(4,0));
        } catch (WlasnyWyjatekDoZadaniaDrugiego e) {
            System.out.println("Nie mozesz dzielic przez 0");
        }



        /**
         *
         * Zadanie 3
         * Wróć do zadania 3 z działu o klasach (Matma), w którym były liczone m. in. obwody i pola.
         * Stwórz wyjątek typu uncheck o nazwie "LiczbaUjemnaException". Uzupełnij metodę "obwodKola" -
         * jeżeli promień będzie ujemny wyrzuć wyjątek "LiczbaUjemnaException". Przetestuj w main podając za promień liczbę ujemną.
         */

        // utowrzenie i import obiektu z innej klasy
        Matma kolo = new Matma();
        System.out.println("\n Wynik z zadania 3, przy liczbie r dodatniej");
        System.out.println(kolo.obwodKola (2));
        System.out.println(kolo.obwodKola(-2));



    }

    //utworzona metoa dzieląca a przez b, dodatkowo porównuje czy b  jest rowne 0
    public static int dzielenieZadanieDrugie(int a, int b) throws WlasnyWyjatekDoZadaniaDrugiego {
        if (b ==0){
            throw new WlasnyWyjatekDoZadaniaDrugiego();
        }
        return a/b;
    }
}
