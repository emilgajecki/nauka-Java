package zadania.sekcja19Wyjatki.wlasneWyjatki;

public class TworzenieWyjatkowMain {
    public static void main(String[] args) {

        /**
         * Utworzułem klasę i obiekt Urzytkownik user dla któego błędnie przipiałem hasło w celu sprawdzenia, czy system zadziała prawodłowo
         * oraz dla tego przypadku wprowadziłem będny adres email, aby pokazac działanie weryfikatora maila
         */

        Uzytkownik user = new Uzytkownik();
        try {
            user.wprowadzEmail("jankowalski.przyklad.com");
            user.wprowadzHaslo("przykaldoweHaslo");
        } catch (NiezbytTajneHasloException e) {
            System.out.println("Nie udało się zalogować");
        }

        // w tym przypadku zatrzyma się nasz system poniewąż wystąpi błąd związany z błędnym mailem, a nie został on obsłużony.

        /**
         * Utworzyłem klasę aby zweryfikowac czy system prawidłowo zadziała w przypadku prawidłowego hasła, w tym przypadku również prawidłowo zostało pdane hasło
         */

        Uzytkownik user1 = new Uzytkownik();
        try {
            user1.wprowadzEmail("jan.kowalki@test.com");
            user1.wprowadzHaslo("test");
        } catch (NiezbytTajneHasloException e) {
            System.out.println("Hasło poprawne - udało się zalogować");
        }
    }
}
