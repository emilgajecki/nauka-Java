package zadania.sekcja22KlasyAbstrakcjeInterfejs.Zadanie02;

public class ZadanieDrugieMain {
    public static void main(String[] args) {

        /**
         * Zadanie 2
         * - stwórz interfejs o nazwie "Figury", który będzie posiadał metody “obwod”, “pole”.
         * Obydwie metody będą zwracały liczbę zmiennoprzecinkową
         * - stwórz dwie klasy “Kolo”, “Prostokat”, które będą implementowały ten interfejs
         * - dodaj konstruktor, w którym w klasie “Kolo” będzie przekazywany promień koła,
         * a w klasie “Prostokat” długości dwóch boków prostokąta a i b
         * - zaimplementuj metody w obydwóch klasach, aby dokonywały poprawnych obliczeń
         * - pola będą prywatne a konstruktor i metody publiczne
         * - przetestuj w main
         */

        Kolo kolo = new Kolo(4);
        System.out.println("Obwod kola to " + kolo.obwod());

        Prostokat prostokat = new Prostokat(2, 3);
        System.out.println("Pole prostokąta to " + prostokat.pole());


    }
}
