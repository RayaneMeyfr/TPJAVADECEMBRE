package tp1.exercice1;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Note {
    private int[] notes;

    public Note() {
        this.notes = new int[3];

        Scanner lc = new Scanner(System.in);
        for(int i = 0;i<3;i++)
        {
            System.out.println("Saisir le premier note qui doit être comprise entre 0 et 20");
            int saisie = lc.nextInt();

            if (saisie < 0) {
                System.out.println("Votre saisie doit être comprise entre 0 et 20");
                saisie = lc.nextInt();
            } else if (saisie > 20) {
                System.out.println("Votre saisie doit être comprise entre 0 et 20");
                saisie = lc.nextInt();
            }

            this.notes[i] = saisie;
        }

        System.out.println("La moyenne de c'est note sont :"+moyenne(notes));
    }

    public int moyenne(int[] notes){
        int total = 0;

        for(int uneNote : notes){

            total += uneNote;

        }

        total /= 3;

     ;   return total;
    }
}
