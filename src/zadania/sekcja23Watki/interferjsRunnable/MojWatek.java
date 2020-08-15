package zadania.sekcja23Watki.interferjsRunnable;

public class MojWatek implements Runnable{

    /**
     * zalecane jest jak powyżej implementowanie metod, aby usprawnić działanie.
     * dziadziczymy po jednej kalasie, a możemu importować od wielu intefrejsów
     *
     * Runnable - pokazuje logikę jaka ma byc wykonana -  projektant domów
     * Thread - zajmuje sie pracą po przekazaniu parametrów. - wykonawcy
     */

    @Override
    public void run() {
        for (int i = 0; i<1000; i++){
            System.out.println("Jestem w moim watku "+ i);
        }
    }
}
