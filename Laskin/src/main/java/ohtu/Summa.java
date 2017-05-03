package ohtu;

import javax.swing.JTextField;

public class Summa implements Komento { // sum

    private Sovelluslogiikka sovellus;  // application logic
    private JTextField tuloskentta, syotekentta;    // result, input

    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        try {
            sovellus.plus(Integer.parseInt(syotekentta.getText()));
            tuloskentta.setText("" + sovellus.tulos());
        } catch (NumberFormatException e) {
        }
        syotekentta.setText("");
    }

    @Override
    public void peru() {
        try {
            tuloskentta.setText("" + sovellus.edellinen());
        } catch (NumberFormatException e) {
        }
        syotekentta.setText("");
    }

}
