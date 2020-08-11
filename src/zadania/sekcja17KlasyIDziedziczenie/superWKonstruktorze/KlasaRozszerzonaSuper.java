package zadania.sekcja17KlasyIDziedziczenie.superWKonstruktorze;

public class KlasaRozszerzonaSuper extends KlasaPodstawowaSuper{

    KlasaRozszerzonaSuper (){
        super(101);
        System.out.println("Wywołałem konsturktor z klasy Rozszerzonej");
    }

    KlasaRozszerzonaSuper( String imie){
        super("Emil");
        System.out.println("Wywołałem konsturktor z klasy Rozszerzonej z parametrem String imie");
    }

}
