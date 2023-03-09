import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//komentarz jednoliniowy przy użyciu dwóch backslash
/* komentarz wieloliniowy zaczynający się od backslash gwiazdka
 a kończy gwiazdka backslash
 */

import static org.junit.jupiter.api.Assertions.*;

/**
 * komentarz dokumentujący zaczynający się od backslash i dwie gwiazdki,
 * aby zamknąć po wpisaniu backslash dwie gwiazdki wystarczy nacisnąć enter
 * @author lucaw
 * @version 1.0
 */

class TrojkatBokiTest {

    /**
     * sprawdza czy obliczanie obwodu jest poprawne
     */

    @Test
    void obliczanieObwoduJestPoprawne() {
        TrojkatBoki trojkatBoki = new TrojkatBoki(3,4,5);
        Assertions.assertEquals(12, trojkatBoki.obliczObwod());
    }

    /**
     * sprawdza czy obliczanie pola jest poprawne
     */

    @Test
    void obliczaniePolaJestPoprawne() {
        TrojkatBoki trojkatBoki = new TrojkatBoki(-3,4,5);
        Assertions.assertEquals(6, trojkatBoki.obliczPole());
    }

    /**
     * sprawdza czy wartość boku A jest poprawne
     */

    @Test
    void ujemnaWartoscBokuAJestNiedozwolona() {
        TrojkatBoki trojkatBoki = new TrojkatBoki(1,2,3);
        trojkatBoki.setBokA(-3);
        Assertions.assertEquals(3, trojkatBoki.getBokA());
    }

    /**
     * sprawdza czy wartość boku B jest poprawne
     */

    @Test
    void ujemnaWartoscBokuBJestNiedozwolona() {
        TrojkatBoki trojkatBoki = new TrojkatBoki(1,2,3);
        trojkatBoki.setBokB(-5);
        Assertions.assertEquals(5, trojkatBoki.getBokB());
    }

    /**
     * sprawdza czy wartość boku C jest poprawne
     */

    @Test
    void ujemnaWartoscBokuCJestNiedozwolona() {
        TrojkatBoki trojkatBoki = new TrojkatBoki(1,2,3);
        trojkatBoki.setBokC(-4);
        Assertions.assertEquals(4, trojkatBoki.getBokC());
    }

    /**
     * sprawdza czy w konstruktorze wartości boków A, B i C są nieujemne
     */

    @Test
    void ujemneWartosciWKonstruktorzeSaNiedozwolone() {
        TrojkatBoki trojkatBoki = new TrojkatBoki(-3,-4,-5);
        Assertions.assertEquals(3, trojkatBoki.getBokA());
        Assertions.assertEquals(4, trojkatBoki.getBokB());
        Assertions.assertEquals(5, trojkatBoki.getBokC());
    }
}