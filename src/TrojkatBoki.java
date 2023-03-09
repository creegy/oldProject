public class TrojkatBoki {
    private float bokA;
    private float bokB;
    private float bokC;

    /**
     * komentarz dokumentacyjny automatycznie dodaje poniższe parametry
     *
     * @param bokA - można komentować parametry w ten sposób
     * @param bokB - wystarczy dodać po spacji minus
     * @param bokC
     */

    /**
     * jakikolwiek tekst
     * @author luca
     * @version 1.0
     *
     * @param bokA można komentować parametry w ten sposób
     * @param bokB wystarczy dodać po spacji minus
     * @param bokC tekst
     */
    public TrojkatBoki(float bokA, float bokB, float bokC) {
        setBokA(bokA);
        setBokB(bokB);
        setBokC(bokC);
    }

    /**
     * metoda zwracająca bok A trójkąta
     * @return bok A trójkąta
     */

    public float getBokA() {
        return bokA;
    }

    /**
     * ustawia długość boku A trójkąta
     * @param bokA bok A trójkąta
     */

    public void setBokA(float bokA) {
        if (bokA<0){
            this.bokA = -bokA;
        }
        else {
            this.bokA = bokA;
        }
    }

    /**
     * pobiera długość boku B trójkąta
     * @return bok B trójkąta
     */

    public float getBokB() {
        return bokB;
    }

    /**
     * ustawia długość boku B trókąta
     * @param bokB bok B trójkąta
     */

    public void setBokB(float bokB) {
        if (bokB<0){
            this.bokB = - bokB;
        }
        else {
            this.bokB = bokB;
        }
    }

    /**
     * pobiera długość boku B trójkąta
     * @return bok C trójkąta
     */

    public float getBokC() {
        return bokC;
    }

    /**
     * ustawia długość boku B trókąta
     * @param bokC bok B trójkąta
     */

    public void setBokC(float bokC) {
        if (bokC<0){
            this.bokC = - bokC;
        }
        else {
            this.bokC = bokC;
        }
    }

    /**
     * oblicza obwód trójkąta
     * <pre> this.bokA + this.bokB + this.bokC;</pre>
     * @see <a href = "http://www.pole-kola.pl/obwod-trojkata/">obliczanie obwodu</a>
     * @return obwód trójkąta
     */

    public float obliczObwod(){
        return this.bokA + this.bokB + this.bokC;
    }

    /**
     * oblicza pole trójkąta na podstawie długości jego boków
     * <pre>Math.sqrt(p*(p-this.bokA)*(p-this.bokB)*(p-this.bokC));</pre>
     * @see <a href="https://www.matemaks.pl/wzory-na-pole-trojkata.html">obliczanie pola trojkata na podstawie długości jego boków</a>
     * @return pole trójkąta
     */

    public float obliczPole(){
        float p = obliczObwod()/2;
        return (float) Math.sqrt(p*(p-this.bokA)*(p-this.bokB)*(p-this.bokC));
    }
}
