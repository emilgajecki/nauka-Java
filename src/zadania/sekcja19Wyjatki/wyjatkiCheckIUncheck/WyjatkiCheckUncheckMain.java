package zadania.sekcja19Wyjatki.wyjatkiCheckIUncheck;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class WyjatkiCheckUncheckMain {

    /**
     * Wyjątek typu CHECK - który musimy obsłużyć zanim zrobimy cokolwiek dalej (bezpośrednio dziedziczone po Exception):
     * FileNotFoundException
     * SQLException
     */

    /**
     * Wyjątek typu UNCHECK - wyjątek, którego nie musimy obsłużyć. Jeżeli nic nie zrobimy to
     * program pójdzie dalej (dziedziczy po Runtime Exception):
     * NullPointerException
     * ArrayIndexOutOfBoundsExceprion
     *
     */

    public static void main(String[] args) {
        File file = new File ("lokalizacja-pliku.txt");
        try {
            InputStream inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
