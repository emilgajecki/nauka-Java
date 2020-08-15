package zadania.sekcja23Watki.czekanieCzyZyje;

public class MainWatekJoinIsAlive {
    public static void main(String[] args) {

        System.out.println("Start");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0; i<3;i++){
                    System.out.println("Wykonuje bardzo ciezka prace ..."+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) { }
                }
            }
        });
        thread.run();
        System.out.println("Czy wątek żyje "+thread.isAlive());
        try {
            thread.join();
        } catch (InterruptedException e) { }

        System.out.println("Czy wątek żyje "+ thread.isAlive());

        System.out.println("Stop");
    }
}
