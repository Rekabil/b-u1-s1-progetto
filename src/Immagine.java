package src;

public class Immagine extends Multimediale {
    private String titolo;
    private int luminosita;


    public Immagine(String titolo ,int luminosita) {
        this.titolo = titolo;
        this.luminosita = luminosita;
    }

    public void abbassaLuminosita() {
        if (luminosita == 0) {
            System.out.println("Luminosita al Minimo");
        } else {
            luminosita--;
            System.out.println("Luminosita al " + luminosita);
        }

    }
    public void alzaLuminosita() {
        if (luminosita == 5) {
            System.out.println("Luminosita al Massimo");
        } else {
            luminosita++;
            System.out.println("Luminosita al " + luminosita);
        }

    }

    public void show() {

            System.out.println("Titolo: " + titolo + " Luminosita: " + "*".repeat(luminosita));

    }

    @Override
    public void getInfo() {
        System.out.println("Immagine Name: " +titolo);
    }
}
