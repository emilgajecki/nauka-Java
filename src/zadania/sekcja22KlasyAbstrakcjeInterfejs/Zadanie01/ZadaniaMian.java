package zadania.sekcja22KlasyAbstrakcjeInterfejs.Zadanie01;

public class ZadaniaMian {

    public static void main(String[] args) {

        /**
         * Zadanie 1
         * - stwórz klasę abstrakcyjną o nazwie “StacjaKosmiczna”
         * - dodaj metodę abstrakcyjną o nazwie “atakujLaserem”
         * - stwórz nową klasę o nazwie “GwiazdaSmierci”,
         * która będzie dziedziczyć po klasie “StacjaKosmiczna”.
         * Zaimplementuj metodę “atakujLaserem”, która wyświetli na ekranie “piu piu"
         * - przetestuj w main
         */

        GwiazdaSmierci gwiazdaSmierci = new GwiazdaSmierci();
        gwiazdaSmierci.atakujLaserem();

    }




}
