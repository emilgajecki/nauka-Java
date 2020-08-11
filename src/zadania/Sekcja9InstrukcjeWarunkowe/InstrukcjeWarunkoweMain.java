package zadania.Sekcja9InstrukcjeWarunkowe;

public class InstrukcjeWarunkoweMain {
    public static void main(String[] args) {
        /**
         * 1. Sprawdź czy wpisana liczba jest parzysta czy nieparzysta.
         *    Wypisz odpowiedni komunikat na ekran.
         *    (podpowiedź: jeżeli reszta z dzielenia przez 2 jest
         *    równa 0 to znaczy, że liczba jest parzysta).
         */

        int czyParzysta = 3;
         if (czyParzysta%2==0){
             System.out.println("Liczba jest parzysta");
         }else {
             System.out.println("Liczba nie jest parzysta");
         }

        /**
         * 2.  Twoim zadaniem jest obliczenie podatku od dochodu.
         *     Obecnie wynosi on 17%. Wiemy, także doświadczeni programiści
         *     potrafią zarabiać pokaźne sumy, a od pewnego dochodu zwiększony
         *     jest podatek do 32%. Sprawdź ile podatku musiałby zapłacić
         *     początkujący programista, zanim przekroczy próg wynoszący
         *     85 528 zł, a ile już ten doświadczony.
         *
         *     Wzór:
         *     dla dochodu do 85 528 zł podatek wynosi 17%,
         *     dla dochodu powyżej 85 528 zł liczy się go następująco:
         *     - obliczamy podatek 17% z 85 528,
         *     - dodatkowo obliczamy podatek 32% od nadwyżki ponad 85 528 zł,
         *     czyli dochód pomniejszony o 85 528 zł i z tego 32%.
         *     (oczywiście obliczamy orientacyjnie, gdyż nie bierzemy pod uwagę np. ulgi podatkowej).
         *
         *     Uwaga: zrób dodatkowe zabezpieczenie, jeżeli ktoś miałby więcej
         *     wydatków niż przychodu, czyli podałby kwotę ujemną dochodu ;)
         */

        double wynagrodzenie = 100000;
        double progZarobkow =85528;
        double roznicaKwotyWolnej = (wynagrodzenie-progZarobkow)*0.32;
        double podatek17 = wynagrodzenie*0.17;
        double podatek32 = (wynagrodzenie*0.17)+roznicaKwotyWolnej;

         if(wynagrodzenie<progZarobkow){
             System.out.println("Zarobiłeś "+wynagrodzenie+" w związku obowiązuje cię podatek w wysokości 17%" +
                     " musisz zapłacic podatek "+ podatek17 +" pozostanie Tobie na koncie " +(wynagrodzenie-podatek17));
         }else if(wynagrodzenie>=progZarobkow) {
             System.out.println("Zarobiłeś "+wynagrodzenie+" w związku obowiązuje cię podatek w wysokości 17% do kwoty "+progZarobkow +
                             " oraz podatek w wysokości 32% od kwoty zarobionj - próg zarobków "+podatek32+
                     " pozostanie Tobie na koncie " +(wynagrodzenie-podatek32));
         }

        /**
         * 3. Napisz bardzo prosty kalkulator. Niech potrafi dodawać, odejmować,
         *    mnożyć i dzielić. Co więcej, niech będzie na tyle prostym kalkulatorem,
         *    że po podaniu  dwóch liczb, obliczy wynik i zakończy swoje działanie.
         *
         *    Dobrze jakbyś wykorzystał do tego instrukcję "switch" w celu jej przećwiczenia,
         *    chociaż na początek możesz spróbować to zrobić "if'em".
         *
         *    (podpowiedź: będziesz potrzebował co najmniej trzech zmiennych - dwie zmienne do
         *    przechowywania liczb oraz trzecia zmienna jako znak operacji np. '+' dla dodawania)
         *
         *    (podpowiedź 2: znak operacji możesz przechowywać w zmiennej typu char)
         */

        char znakDzialania = '/';
        int liczbaPierwsza =10;
        int liczbaDruga =2;

        switch (znakDzialania){
            case '+' :
                System.out.println("Wybrałeś działanie dodawnia. Suma to " +(liczbaPierwsza+liczbaDruga));
                break;
            case '-':
                System.out.println("Wybrałeś działanie odejmowania. Różnica to " +(liczbaPierwsza-liczbaDruga));
                break;
            case '*' :
                System.out.println("Wybrałeś działanie działania. Iloczyn to " +(liczbaPierwsza*liczbaDruga));
                break;
            case '/':
                System.out.println("Wybrałeś działanie dodawnia. Iloraz to " +(liczbaPierwsza/liczbaDruga));
                break;
        }
    }
}
