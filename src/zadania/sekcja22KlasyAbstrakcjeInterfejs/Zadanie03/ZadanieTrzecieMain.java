package zadania.sekcja22KlasyAbstrakcjeInterfejs.Zadanie03;

public class ZadanieTrzecieMain {

    public static void main(String[] args) {
        /** todo do powtorzenia
         * Stwórz interfejs wewnętrzny o nazwie "Info" z metodą “wyswietlInfo” w klasie, w której masz metodę main.
         * Przećwiczyć tworzenie klasy anonimowej tworząc ją w metodzie main i przesłoń metodę tak, aby wypisywała tekst
         * “informacja wypisana z klasy anonimowej”. Następnie wywołaj tę metodę “wyswietlInfo”
         * i sprawdź czy prawidłowo została stworzona klasa anonimowa.
         */

        Info infoAnonimowe = new Info() {
            @Override
            public void wyswietlInfo() {
                System.out.println("informacja wypisana z klasy anonimowej");
            }
        };

        infoAnonimowe.wyswietlInfo();
    }


    interface Info {
        void wyswietlInfo();
    }
}
