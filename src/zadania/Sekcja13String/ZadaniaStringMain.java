package zadania.Sekcja13String;

public class ZadaniaStringMain {
    public static void main(String[] args) {
        /**
         * Zadanie 1 :
         * Utwórz trzy zmienne typu String. Do pierwszej przypisz swoje imię, do drugiej nazwisko oraz
         * do trzeciej imię i nazwisko oddzielone spacją. Następnie wykonaj polecenia używając odpowiednich
         * metod z String (nie robić nic ręcznie! :) ) i wypisując informacje na ekran:
         *
         * a) wypisz ile znaków zawiera zmienna przechowująca imię, ile nazwisko a ile imię i nazwisko
         *
         * b) sprawdź czy Twoje imię jest równe "Alicja" lub "Jan"
         *
         * c) wypisz nazwisko z WIELKICH LITER
         *
         * d) zamień w nazwisku litery 'a' na 'e' i zobacz czy coś się zmieniło
         */


        String imie = "Emil";
        String nazwisko = "Gajecki";
        String imieNazwisko = "Emil Gajecki";

        System.out.println("wypisz ile znaków zawiera zmienna przechowująca imię, ile nazwisko a ile imię i nazwisko");

        System.out.println("Ilość liter w imieniu to "+imie.length());
        System.out.println("Ilość liter w imieniu to "+nazwisko.length());
        System.out.println("Ilość liter w imieniu to "+imieNazwisko.length());

        System.out.println("\nsprawdź czy Twoje imię jest równe \"Alicja\" lub \"Jan\"");
        System.out.println("Czy moje imie to Jan: "+ imie.equals("Jan"));

        System.out.println("\nwypisz nazwisko z WIELKICH LITER");
        System.out.println("Moje nazwisko z duźych liter to "+nazwisko.toUpperCase());

        System.out.println("\nzamień w nazwisku litery 'a' na 'e' i zobacz czy coś się zmieniło");
        System.out.println("Moje nazwisko z zamienionymi literkami to " + nazwisko.replace("a", "e"));

        /**
         * 2. Dla zdania "Potrafię coraz więcej z programowania." wypisz każdy znak w osobnej linii, czyli:
         *
         * P
         * o
         * t
         * r
         * a
         * f
         * i
         * ę
         *
         * c
         * o
         * r
         * a
         * z
         * ... itd. ;)
         */

        System.out.println();
        String potrafieProgramowac = "Potrafię coraz więcej z programowania.";
        for(int i =0; i<potrafieProgramowac.length();i++){
            System.out.println(potrafieProgramowac.charAt(i));
        }

        /**
         * 3. Tym razem powyższe zdanie „Potrafię coraz więcej z programowania.” napisz od tyłu „.ainawomargorp z jecęiw zaroc ęifartoP”
         */

        System.out.println();
        for(int i =potrafieProgramowac.length()-1;i>=0; i--){
            System.out.println(potrafieProgramowac.charAt(i));
        }

    }
}
