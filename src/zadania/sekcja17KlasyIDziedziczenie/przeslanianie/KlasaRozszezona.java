package zadania.sekcja17KlasyIDziedziczenie.przeslanianie;

public class KlasaRozszezona extends KlasaPodstawowa {

    @Override
    void metoda() {
        System.out.println("wypisałem z @override");
    }

    @Override
    void metodaDruga() {
        System.out.println("wypisałem z @override metody druga");
    }
}
