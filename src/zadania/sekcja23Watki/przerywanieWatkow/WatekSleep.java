package zadania.sekcja23Watki.przerywanieWatkow;

public class WatekSleep implements Runnable {
    @Override
    public void run() {
        while (true){
            System.out.println("Działa sobie caly czas ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Poszedl exceptione w sleepie");
            }
        }
    }
}
