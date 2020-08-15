package zadania.sekcja23Watki.usypianiaWatku;

public class MainWatkiSleep {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Watek1 :" + i);

                    /**
                     *  uśpienie wątku zawsze dajemy na klasie Thread
                     *  musimy obidowac w try/catch pownież jest typu check
                     */

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread1.run();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 10; j++) {
                    System.out.println("Watek2 :" + j);
                }
            }
        });
        thread2.run();
    }
}
