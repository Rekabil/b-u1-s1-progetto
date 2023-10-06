package src;

public class Audio {
    private String titolo;
    private int volume;
    private int durata;

    public Audio(String titolo, int volume, int durata) {
        this.titolo = titolo;
        this.volume = volume;
        this.durata = durata;
    }

    public void play() {
        for (int i = 0; i< durata ; i++) {
        System.out.println("Titolo: " + titolo + " Durata: " + durata + " Volume: " + "!".repeat(volume) );
        }
    }
}
