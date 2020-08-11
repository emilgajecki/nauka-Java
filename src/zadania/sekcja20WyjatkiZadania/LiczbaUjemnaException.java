package zadania.sekcja20WyjatkiZadania;

public class LiczbaUjemnaException extends RuntimeException {

    // klasa wykorzystana w  zadaniu 3

    public LiczbaUjemnaException (){
        super("Liczba nie może być ujemna");
    }
}
