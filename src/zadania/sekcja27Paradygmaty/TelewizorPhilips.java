package zadania.sekcja27Paradygmaty;

public abstract class TelewizorPhilips implements Telewizor{

    private boolean statusWlaczony = false;
    private int obecnyProgram = 3;

    @Override
    public void wlacz() {
        statusWlaczony=true;
        emitujNaEkran();
        System.out.println("Witaj");
    }

    @Override
    public void wylacz() {
        statusWlaczony = false;
        System.out.println("Czarność");

    }

    @Override
    public void zmienKanal(int numerKanalu) {
        if (statusWlaczony){
            obecnyProgram=numerKanalu;
        }
    }

    private void emitujNaEkran(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(statusWlaczony) {
                    try {
                        System.out.println("Progam: " + obecnyProgram);
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

}
