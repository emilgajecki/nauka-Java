package zadania.sekcja23Watki.przerywanieWatkow;

public class MainWatkiInterrupt {
    public static void main(String[] args) {

        Thread therad1= new Thread(new WatekSleep());
        therad1.start();


        therad1.interrupt();
    }
}
