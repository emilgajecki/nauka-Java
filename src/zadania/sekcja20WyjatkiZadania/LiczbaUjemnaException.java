package zadania.sekcja20WyjatkiZadania;

public class LiczbaUjemnaException extends RuntimeException {

    // klasa na potrzeby zadania 3

    public LiczbaUjemnaException (){
        super("Liczba nie może być ujemna");
    }
}
