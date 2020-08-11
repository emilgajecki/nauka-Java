package zadania.sekcja19Wyjatki.wlasneWyjatki;

public class Uzytkownik {

    /**
     * utworzyliśmy wyjątek, który sprawdza hasła. Jest on typu chcek, koniecznie musimy go obsłużyć
     * @param haslo
     * @throws NiezbytTajneHasloException
     */
    public void wprowadzHaslo(String haslo) throws NiezbytTajneHasloException{
        if(!haslo.contains("tajne")){
                throw new NiezbytTajneHasloException();
        }
    }

    /**
     * utworzyłem wyjątek typu uncheck - nie musimy go obsługiwac go blokiem try,catch
     * @param email
     * @throws NiepoprawnyEmailException
     */
    public void wprowadzEmail (String email) throws NiepoprawnyEmailException{
        if(!email.contains("@")) {
            throw new NiepoprawnyEmailException();
        }
    }
}
