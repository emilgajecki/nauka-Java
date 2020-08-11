package zadania.sekcja19Wyjatki.finaly;

public class WyjatekFinallyMain {
    static String str;

    public static void main(String[] args) {

        try {
            System.out.println("WSZYSTKO WIELKĄ LITERĄ :" + str.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Poszedł null");
        } finally {
            /**
             * ta część kodu pojawia się zawsze podczas wykonywania bloków.
             * Nawet jeżeli zakończy się nullem.
             */

            System.out.println("Ten komunikat pojawi się zawsze");
        }
    }


}
