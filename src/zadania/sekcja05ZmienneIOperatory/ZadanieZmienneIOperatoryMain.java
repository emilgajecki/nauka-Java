package zadania.sekcja05ZmienneIOperatory;

public class ZadanieZmienneIOperatoryMain {

    /**
     * 1. Utwórz program, w którym stworzysz zmienne i przypiszesz do tych zmiennych
     * wartości takie jak Twój wiek, wzrost, waga. Niech będą w jednostkach lata,
     * metry, kilogramy odpowiednio. Będziesz potrzebował 3 zmienne.
     * Zastanów się nad nazewnictwem oraz typem zmiennych. Na koniec wypisz wszystko na ekran.
     */


    public static void main(String[] args) {

        int wiek = 27;
        double waga = 90.1;
        double wzrost = 1.95;

        System.out.println("Mój wiek to " + wiek + " lat. Waga pokazuje ok " + waga + " kg. A wzrost wynosi " + wzrost + "m");


        /**
         * 2. Na podstawie danych z poprzedniego zadania oblicz Twoje BMI
         * (Body Mass Index). Wzór to masa / wzrost^2 (masa w kilogramach, wzrost w metrach).
         */

        double bmi = waga / (wzrost * wzrost);
        System.out.println("Moje Bmi to "+bmi);

        /**
         * 3. Skonwertuj wynik z poprzedniego zdania na liczbę całkowitą.
         * Zadanie jest szybkie, ale podpowiem Ci, że chcemy skonwertować liczbę
         * zmiennoprzecinkową (np. float) na liczbę całkowitą (np. int).
         */

        int zmiennaBmi =  (int) bmi;
        System.out.println("Moje bmi po zmianie na int to: " +zmiennaBmi);



        /**
         * 4. Podaj dowolną liczbę typu całkowitego.
         * Następnie oblicz wynik dzielenia oraz resztę z dzielenia
         * przez liczby 2, 3 oraz 11. Zobacz czy wyniki zgadzają się z
         * Twoimi oczekiwaniami.
         */

        int liczbDowolna = 33;
        System.out.println("Pierwszy wynik: "+ liczbDowolna/2+ " ; Wynik durugi: "+liczbDowolna/3+" Wynik trzeci: "+liczbDowolna/11);

        /**
         * 5. Odpowiedź, co ujrzymy na ekranie dla poniższego kodu?
         *
         * int x = 5;
         * boolean wynikPierwszy = x < 10 || x != 0 || x > -1;
         * boolean wynikDrugi =  x < 10 && x != 0 && x > -1;
         * System.out.println("Wynik pierwszy: " + wynikPierwszy);
         * System.out.println("Wynik drugi: " + wynikDrugi);
         */

        int x = 5;
         boolean wynikPierwszy = x < 10 || x != 0 || x > -1; //5 jest mniejsze od 10 lub 5 jest rózne od 0 lub 5 jest większe od -1
         boolean wynikDrugi =  x < 10 && x != 0 && x > -1; // 5 jest mniejsze od 10 i 5 jest rózne od 0 i 5 jest większe od -1
         System.out.println("Wynik pierwszy: " + wynikPierwszy); //ture
         System.out.println("Wynik drugi: " + wynikDrugi); //true

        /**
         * 6*. Przypisz wartość przekraczającą
         * poza rozmiar zmiennej typu int. Zobacz co się stanie i
         * zastanów dlaczego. Spróbuj oszukać środowisko, aby nie
         * wytykało Ci błędów :)
         */

        int liczba = 1000000000;
        int  zmienna = liczba + liczba +liczba;
        zmienna = Integer.MAX_VALUE;


        System.out.println("Maksymalna wartośc "+zmienna);



    }


}
