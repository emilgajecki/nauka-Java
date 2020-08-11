package zadania.sekcja17KlasyIDziedziczenie.dziedziczenie;

public class MainDziedziczenie {
    public static void main(String[] args) {
        KlasaPodstawowa klasaPodstawowa = new KlasaPodstawowa();
        klasaPodstawowa.metodaPierwsza();

        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();
        klasaRozszerzona.metodaRozszerzona();
        klasaRozszerzona.metodaDruga();


    }



}
