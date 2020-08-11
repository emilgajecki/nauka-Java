package zadania.Sekcja10Petle;

public class ZadaniaPetleMain {


    public static void main(String[] args) {

        /**
         * Zadanie 1:
         * Wypisz na ekran liczby od 0 do 30, a następnie do 30 do 0
         */
        System.out.println("Zadanie 1");
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int j = 30; j >= 0; j--) {
            System.out.print(j + " ");
        }

        /**
         * Zadanie 2:
         * Napisz program, który wypisze wszystkie liczby parzyste z zakresu od 0 do 30
         */
        System.out.println();
        System.out.println("\nZadanie 2");
        for (int k = 0; k <= 30; k += 2) {
            System.out.print(k + " ");
        }

        /**
         * Zadanie 3:
         * Podaj dwie dowolne liczby a i b gdzie a jest mniejsze od b (a<b)
         * Wypisz na ekran zakres liczb od a do b.
         */
        System.out.println();
        System.out.println("\nZadanie 3");


        int b = 9;
        for (int a = 3; a <= b; a++) {
            System.out.print(a + " ");
        }

        /**
         * Zadanie 4:
         * Utworz tablicę rozmiaru 10 i uzupełnij liczbami.
         * Wypisz wszystkie liczby z tej tablicy na ekran.
         * Następnie wypisz wszystkie liczby od tyłu
         */
        System.out.println();
        System.out.println("\nZadanie 4");
        int[] tab = {20, 3, 50, 6, 70, 8, 90, 110, 120, 130};

        for (int i = 0; i <= tab.length - 1; i++) {
            System.out.print(tab[i] + " ");
        }

        /**
         * Zadanie 5:
         * Wykorzystując tablicę z poprzedniego zadania, oblicz sumę
         * wszystkich jej elementów
         */
        System.out.println();
        System.out.println("\nZadanie 5");
        int suma = 0;
        for (int i = 0; i <= tab.length - 1; i++) {
            suma += tab[i];
        }
        System.out.println(suma);

        /**
         * Zadanie 6:
         * Napisz program, który będzie liczył silniez  z nieujemnej
         * liczby tj. jeżeli podany liczbę 5, to zostanie obliczona 5!
         * (wykrzyknik to znak silni). Oliczamy to w następujący sposób :
         * 5!= 5*4*3*2*1 = 120
         * Uważaj bo silnia kolejnych liczb bardzo szybko rośnie i łatwo wyjść
         * poza rozmiar typu int.
         */

        System.out.println("\nZadanie 6");

        int wynikSilnia = 1;
        for (int silnia = 7; silnia > 0; silnia--) {
            wynikSilnia = silnia * wynikSilnia;
        }
        System.out.println(wynikSilnia);


        /**
         * Zadanie 7:
         * Napisz program w którym po podaniu liczby n narysujesz za pomocą *
         * trójką prostokątny  o przyprostokąnych składających sie z n-razy *
         *  np podając n =5
         *
         *  *
         *  **
         *  ***
         *  ****
         *  *****
         */

        System.out.println("\nZadanie 7");

        int n = 6;
        for (int i = 0; i < n; i++) { //liczba poziomów
            for (int j = 0; j < i; j++) { //liczba w wierszu
                System.out.print('*');
            }
            System.out.println('*');
        }

        /**
         *
         * TODO - WYKONAĆ ZADANIE Z KURSU OD ŁUKASZA
         * Zadanie 8:
         * Narysuj odbicie lustrzane trójkąta z poprzedniego zadania
         * tj. dla n =5 powinniśmy ujrzeć
         *
         *      *
         *     **
         *    ***
         *   ****
         *  *****
         */
        System.out.println("\nZadanie 8");


        for (int i = 1; i <= n; i++) { //liczba poziomów
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /**
         * Zadanie 9:
         * (Do samodzielnego wykoanania)
         * Napisz program, w którym po podaniu liczby n narysujesz za pomocą *(gwiazdki)
         * drzewko choinkowe o wysokości n
         * np dając n = 5 powinnuiśmy otrzymać takie drzewko:
         *
         *          *
         *         ***
         *        *****
         *       *******
         *      *********
         */




    }
}
