package zadania.Sekcja16Klasy.zadanie1;

public class Programista {
    String imie;
    String nazwisko;
    String jezyk;
    float zarobki;

    String pobierzImie (){
        return imie;
    }

    String pobierzNazwisko(){
        return nazwisko;
    }

    String pobierzJezyk(){
        return jezyk;
    }

    float getZarobki(){
        return zarobki;
    }

    public Programista(String imie, String nazwisko, String jezyk, float zarobki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.jezyk = jezyk;
        this.zarobki = zarobki;
    }
}
