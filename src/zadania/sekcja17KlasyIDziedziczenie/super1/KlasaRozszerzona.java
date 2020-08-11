package zadania.sekcja17KlasyIDziedziczenie.super1;

public class KlasaRozszerzona  extends  KlasaPodstawowa{

    @Override
    void metoda() {
        super.metoda();
        System.out.println("Kolejna operacja w klasie rozszerzonej");
    }

    @Override
    void metodaNowa() {
        super.metodaNowa();
        System.out.println("kolejna super sprawa przy użyciu super");
    }
}
