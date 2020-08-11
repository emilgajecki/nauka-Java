package zadania.sekcja17KlasyIDziedziczenie.przeslanianie;

public class PrzeslanianieMain {

    public static void main(String[] args) {
        KlasaPodstawowa klasaPodstawowa = new KlasaPodstawowa();
        klasaPodstawowa.metoda();
        klasaPodstawowa.metodaDruga();

        KlasaRozszezona klasaRozszezona = new KlasaRozszezona();
        klasaRozszezona.metoda();
        klasaRozszezona.metodaDruga();
    }
}
