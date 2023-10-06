package src;

public class Audio extends Multimediale {
    private String titolo;
    private int volume;
    private int durata;

    public Audio(String titolo, int volume, int durata) {
        this.titolo = titolo;
        this.volume = volume;
        this.durata = durata;
    }

    public void play() {

        System.out.println("Titolo: " + titolo + " Volume: " + "!".repeat(volume) );

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
    @Override
    public void getInfo() {
        System.out.println("Audio Name: " +titolo);
    }
}
