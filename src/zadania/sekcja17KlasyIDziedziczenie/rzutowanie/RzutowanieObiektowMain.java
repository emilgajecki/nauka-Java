package zadania.sekcja17KlasyIDziedziczenie.rzutowanie;

public class RzutowanieObiektowMain {

    public static void main(String[] args) {
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();
        klasaRozszerzona.ustawLiczbe(999);
        klasaRozszerzona.wyswietlLiczbe();

        KlasaPodstawowa klasaPodstawowa = klasaRozszerzona;
        klasaPodstawowa.wyswietlLiczbe();
    }
}
