package src;

public class Video extends Multimediale {

    private String titolo;
    private int volume;
    private int durata;
 private boolean riproducibile = true;
    private int luminosita;


    public Video(String titolo, int volume, int durata,int luminosita) {
        this.titolo = titolo;
        this.volume = volume;
        this.durata = durata;
        this.luminosita = luminosita;
    }

    public void play() {
        for (int i = 0; i< durata ; i++) {
            System.out.println("Titolo: " + titolo + " Volume: " + "!".repeat(volume) + " Luminosita: " + "*".repeat(luminosita));
        }
    }

    public void abbassaVolume() {
        if (volume == 0) {
            System.out.println("Volume al Minimo");
        } else {
            volume--;
            System.out.println("Volume al " + volume);
        }

    }
    public void alzaVolume() {
        if (volume == 5) {
            System.out.println("Volume al Massimo");
        } else {
            volume++;
            System.out.println("Volume al " + volume);
        }

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

    @Override
    public void getInfo() {
        System.out.println("Video Name: " +titolo);
    }
}
