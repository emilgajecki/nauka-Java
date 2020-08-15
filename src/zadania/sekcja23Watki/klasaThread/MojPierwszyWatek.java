package zadania.sekcja23Watki.klasaThread;

public class MojPierwszyWatek extends Thread{

    /**
     * Tworzymy klase, aby użyć kilku wątków podczas jednego działania (równocześnie)\
     *
     * Ważne jest aby w tym miejscu zapisać całą logike działania - czyli musimy nadpisać
     * metodę run
     */

    @Override
    public void run() {
        for (int i = 0;i<1000;i++){
            System.out.println("Wypisałem to z pierwszego wątku "+i);
        }
    }
}
