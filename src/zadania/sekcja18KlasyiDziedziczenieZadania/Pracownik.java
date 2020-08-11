package zadania.sekcja18KlasyiDziedziczenieZadania;

public class Pracownik extends Osoba{

    protected String stanowisko;
    protected String nazwaFirmy;

  public Pracownik(String imie, String nazwisko, String nazwaFirmy, String stanowisko) {
        super(imie, nazwisko);
        this.nazwaFirmy = nazwaFirmy;
        this.stanowisko = stanowisko;
    }

    @Override
     public void przedstawSie() {
        System.out.println("Jestem " + imie +" "+ nazwisko +" pracuję w firmie "+nazwaFirmy+" i chciałbym zostać "+stanowisko);
    }

    public static void main(String[] args) {

    }
}
