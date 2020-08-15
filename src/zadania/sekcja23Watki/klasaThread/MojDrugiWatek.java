package zadania.sekcja23Watki.klasaThread;

public class MojDrugiWatek extends Thread {
    @Override
    public synchronized void start() {
        for (int j = 0; j<1000; j++){
            System.out.println("Wypisałem to z drugiego wątku "+j);
        }
    }
}
