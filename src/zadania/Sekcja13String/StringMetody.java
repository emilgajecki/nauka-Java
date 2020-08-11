package zadania.Sekcja13String;

public class StringMetody {

    public static void main(String[] args) {

        //Weryfikacja długości tekstu
        String jakisTekst = "Jakiś teskt";
        System.out.println("Weryfikujemy ilość znalków w Stringu length()");
        System.out.println("Tekst ma długość "+ jakisTekst.length());

        //Weryfikacja czy są puste Stringi
        System.out.println("\nWeryfikacja czy String jest pusty isEmpty()");
        System.out.println(jakisTekst.isEmpty());

        //Jaki znak znajduje sie na danym indeksie
        System.out.println("\nWeryfikujemy jaki znak znajduje się na podaje pozycji length()-1");
        System.out.println(jakisTekst.charAt(jakisTekst.length()-1));

        //w jaki sposób wyciąć tekst od 6 miejsca(miejsca podanego w substringu
        System.out.println("\nWyświetlenie tekstu od wskazanego miejsca w substringu substring(6)");
        System.out.println(jakisTekst.substring(6));

        //Substring ma też możliwość wyświetlenia tekstu z zakresu (początkowa wartość, końcowa wartość)
        System.out.println("\nWyświetlenie tekstu z zakresu (początkowa wartość, końcowa wartość - ale bez tej wartości) substring(3,9)");
        System.out.println(jakisTekst.substring(3,9));

        //Usówanie spacji(białe zniaki) w przypadku początku i końca tekstu - w środku pozostaje bez zmiany
        String nowyString = " ajdlkasjd jad lkjalks al d ";
        System.out.println("\nUsówanie spacji w przypadku początku i końca tekstu - w środku pozostaje bez zmiany trim()");
        System.out.println("."+ nowyString+".");
        System.out.println("."+nowyString.trim()+".");

        //ustawianie równej wielkości tylko małymi literami, albo tylko dużymi
        System.out.println("\nFormatowanie tesktu na wszystkie małe literki toLowerCase()");
        String nowyString2 = "Róźne WIELKOŚCI TEKSTU";
        System.out.println(nowyString2.toLowerCase());

        System.out.println("\nFormatowanie tesktu na wszystkie duźe literki toUpperCase()");
        System.out.println(nowyString2.toUpperCase());

        //czy mój String zawiera jakiś jakieś słowo
        System.out.println("\nczy mój String zawiera jakiś jakieś słowo - z prefixem (zwraca boolien) jeżeli mamy podane małe litery a szykamy dużych błąd");
        String czyZawiera = "Czy zawiera jakiś tekst startsWith(\"czy zawiera\")";
        System.out.println(czyZawiera.toLowerCase().startsWith("czy zawiera"));

        //czy zaweira końcówkę
        System.out.println("\nczy zaweira końcówkę");
        String czyZawieraKonscowka = "czy zaweira końcówkę endsWith(\"końcówkę\")";
        System.out.println(czyZawiera.toLowerCase().endsWith("końcówkę"));

        //Czy zawiera jakiś ciąg tekstu
        System.out.println("\nCzy zawiera jakiś ciąg tekstu contains(\"jakiś\")");
        System.out.println(czyZawiera.toLowerCase().contains("jakiś"));

        //Zamiania jakiegś znaku na inny znak
        System.out.println("Zamiania jakiegś znaku na inny znak replace(\"j\",\"e\")");
        System.out.println(nowyString);
        System.out.println(nowyString.replace("j","e"));
    }
}
