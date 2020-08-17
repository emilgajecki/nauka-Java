package zadania.sekcja27Paradygmaty.telewizory.Philips;

import zadania.sekcja27Paradygmaty.telewizory.Telewizor;

public abstract class TelewizorPhilips implements Telewizor {

    private String id;
    private boolean statusWlaczony = false;
    private int obecnyProgram = 3;
    private int cale;

    protected TelewizorPhilips (String id,int cale){
        this.id= id;
        this.cale = cale;
    }

    public String getId() {
        return id;
    }

    public int getCale() {
        return cale;
    }

    @Override
    public void akcjaZailania() {
        if(statusWlaczony){
            wylacz();
        } else {
            wlacz();
        }
    }


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
            this.obecnyProgram=numerKanalu;
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
