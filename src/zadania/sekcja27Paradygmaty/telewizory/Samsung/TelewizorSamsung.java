package zadania.sekcja27Paradygmaty.telewizory.Samsung;

import zadania.sekcja27Paradygmaty.telewizory.Telewizor;

public abstract class TelewizorSamsung implements Telewizor {

    private  boolean stanWlaczony =false;
    private int numerKanalu=1;
    private int cale;

     protected TelewizorSamsung(int cale){
         this.cale = cale;
     }

    //uruchamiamy telewizro przełącznikem
    @Override
    public void wlacz() {
        stanWlaczony=true;
        System.out.println("Samsung TV");
        wyswietlajObraz();
    }

    @Override
    public void wylacz() {
        System.out.println("Animacja Czarnosci");
        stanWlaczony =false;
    }

    @Override
    public void zmienKanal(int numerKanalu) {
        if(stanWlaczony){
        this.numerKanalu=numerKanalu;}
        System.out.println("Zmieniono kanala na "+numerKanalu);
    }

    //metoda odpowiedzialna za wyswietalnie kanalu - na star kanal pierwszy
    private void wyswietlajObraz(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(stanWlaczony){
                    try {
                        System.out.println("Wyświetlaj obraz: "+numerKanalu);
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
