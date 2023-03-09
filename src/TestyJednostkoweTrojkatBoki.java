import java.util.Scanner;

/**
 * główna klasa uruchomieniowa, pozwala
 * na obliczanie pola i obwodu trójkąta
 * pyta użytkownika o boki trójkąta
 * i zwraca pole oraz obwód trójkąta
 */

public class TestyJednostkoweTrojkatBoki {
    public static float bokA;
    public static float bokB;
    public static float bokC;
    public static float pole;
    public static float obwod;

    /**
     * metoda uruchamiająca program
     * @param args tablica parametrów uruchomienia
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość boku A trójkąta: ");
        bokA = scanner.nextFloat();

        System.out.print("Podaj długość boku B trójkąta: ");
        bokB = scanner.nextFloat();

        System.out.print("Podaj długość boku C trójkąta: ");
        bokC = scanner.nextFloat();

        TrojkatBoki trojkatBoki = new TrojkatBoki(bokA, bokB, bokC);
        obwod = trojkatBoki.obliczObwod();
        pole = trojkatBoki.obliczPole();
        System.out.println("Trójkąt o bokach " + bokA + ", " + bokB + ", " + bokC + " ma obwód: " + obwod);
        System.out.println("Trójkąt o bokach " + bokA + ", " + bokB + ", " + bokC + " ma pole: " + obwod);
    }
}