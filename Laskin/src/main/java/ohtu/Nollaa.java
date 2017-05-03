package ohtu;

import javax.swing.JTextField;

public class Nollaa implements Komento {    // reset
    private int edellinen;
    private Sovelluslogiikka sovellus;  // application logic
    private JTextField tuloskentta, syotekentta;    // result, input

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        edellinen = sovellus.tulos();
        sovellus.nollaa();
        tuloskentta.setText("" + sovellus.tulos());
        syotekentta.setText("");
    }

    @Override
    public void peru() {
        tuloskentta.setText("" + sovellus.edellinen());
        syotekentta.setText("");
    }

}
