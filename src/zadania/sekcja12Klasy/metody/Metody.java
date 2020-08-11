package zadania.sekcja12Klasy.metody;

public class Metody {
    static float waga;
    String imie;


    public static void main(String[] args) {

        Metody emil = new Metody();
         emil.getImie("Emil");
         emil.getWaga(91);

         Metody kinia = new Metody();
         kinia.getImie("Kinia");
         kinia.getWaga(60);

         Metody marysia = new Metody("Marysia",8.1f);



    }
    public Metody(){};

    public Metody(String imie, float waga){
        this.imie= imie;
        this.waga=waga;
        System.out.println("Osoba utworzona z konstruktora to " + imie+ " a jej waga to "+ waga);
    }

    public String getImie (String podajImie){
        this.imie = podajImie;
        return imie;
    }

    public float getWaga(float podajWage){
        System.out.println("Waga "+imie+" to "+ podajWage);
        return podajWage;

    }
}
