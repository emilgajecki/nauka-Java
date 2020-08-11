package zadania.sekcja17KlasyIDziedziczenie.superWKonstruktorze;

public class KlasaPodstawowaSuper {

    KlasaPodstawowaSuper(){
        System.out.println("Wywołałem konstruktor z Klasa Podstawowa");
    }

    KlasaPodstawowaSuper(int a ) {
        System.out.println("wywołałem konstruktor z klasa podsatwowa z wartością " + a);
    }

    KlasaPodstawowaSuper(String imie){
        System.out.println("wywołałem kontruktor z klasy podstawowowej z wartością String " + imie);
    }
}
