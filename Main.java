import src.Audio;
import src.Immagine;
import src.Multimediale;
import src.Video;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Audio song = new Audio("Name", 2, 6);
        Video vod = new Video("Vod1", 2, 5, 3);
        Immagine img = new Immagine("img1", 3);
        Video vod2 = new Video("Vod2", 3, 4, 2);
        Immagine img2 = new Immagine("img2", 1);


        Multimediale[] elementi = {song, vod, img, vod2, img2};
        for (Multimediale e : elementi) {
            e.getInfo();

        }
        Scanner input = new Scanner(System.in);

        int select = 1;
        while (select != 0) {
            System.out.println("Inserisci il numero della canzone oppure 0 per fermare");
            select = Integer.parseInt(input.nextLine());
            switch (select) {
                case 0: {
                    System.out.println("Fermata la Playlist.");
                    break;
                }
                case 1: {
                    song.play();
                    break;
                }case 2: {
                    vod.play();
                    break;
                }case 3: {
                    img.show();
                    break;
                }
                case 4: {
                    vod2.play();
                    break;
                }
                case 5: {
                  img2.show();
                    break;
                }
            }
        }


    }


}
