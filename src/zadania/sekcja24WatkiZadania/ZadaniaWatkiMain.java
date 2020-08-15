package zadania.sekcja24WatkiZadania;

public class ZadaniaWatkiMain {
    public static void main(String[] args) {
        /**
         * Zadanie 1
         * Przećwicz tworzenie wątku poprzez klasę anonimową:
         * - niech metoda “run” wypisze na ekran “Ta informacja została wypisana z klasy anonimowej i z mojego wątku”
         * - wystartuj wątek pamiętając o odpowiednich czynnościach
         * - dopisz, aby informacja została wyświetlona z 3 sekundowym opóźnieniem
         */


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<100;i++){
                    System.out.println("Ta informacja została wypisana z klasy anonimowej i z mojego wątku "+ i);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        /**
         *   Zadanie 2
         *   Stwórz nową klasę o nazwie “Czasoodmierzacz” implementująca interfejs Runnable. Stwórz tzw. “timer”,
         *   który będzie co 1 sekundę wypisywał na ekran informację o tym jak długo (ile sekund) działa program od momentu jego uruchomienia.
         *   Przetestuj wątek w main.
         */

        Thread thread = new Thread(new Czasoodmierzacz());
        thread.start();

        /**
         *
         * Zadanie 3
         * Stwórz dwa wątki, które będą się ścigać. Każdy z wątków niech wypisze na ekran 1000 razy:
         * “Będę pierwszy - to ja <tutaj_nazwa_wątku>”.
         * Po wykonaniu tej czynności ma zawiadomić o skończonej pracy wypisując:
         * “ZAKOŃCZYŁEM! Melduje się <tutaj_nazwa_wątku>".
         * Uruchom kilka razy program i zobacz czy wynik za każdym razem jest taki sam.
         * wyścig męża i żony
         */

        Thread kinga = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int k = 0; k<1000;k++){
                    System.out.println("Jestem Kinga i jestem na pozycji "+ k+ "  z 1000");

                }
                System.out.println("Zakonczyłem swoje działanie Kinga");
            }
        });

        Thread emil = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int e = 0; e<1000;e++){
                    System.out.println("Jestem Emil i jestem na pozycji "+ e+ "  z 1000");
                }
                System.out.println("Zakonczyłem swoje działanie Emil");
            }
        });
        kinga.start();
        emil.start();

    }

}
