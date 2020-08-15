package zadania.sekcja23Watki.klasaThread;

public class WatkiThreadMain {
    public static void main(String[] args) {

        MojPierwszyWatek watek = new MojPierwszyWatek();
        watek.start();
        MojDrugiWatek watekDrugi = new MojDrugiWatek();
        watekDrugi.start();

    }
}
