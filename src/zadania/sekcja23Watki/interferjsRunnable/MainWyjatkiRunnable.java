package zadania.sekcja23Watki.interferjsRunnable;

public class MainWyjatkiRunnable {

    public static void main(String[] args) {

        /**
         * nie musimy tworzyć obiektu uzywamy thread a w konstruktorze go przekauzjemy
         */

        Thread thread = new Thread(new MojWatek());
        thread.run();

        /**
         * Tworzenie przy pomocy klasy anonimowej
         */

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 999; j > 0; j--) {
                    System.out.println("Działam, ponieważ utworzono mnie w klasie anonimowej " + j);
                }
            }
        });
        thread2.run();

        /**
         * Trzecia mozliwość utworzenia wątków bez przypisania - do zastosowania tylko raz
         */

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int k = 999; k > 0; k--) {
                    System.out.println("działam bez przypisania " + k);
                }
            }
        }).run();
    }
}

