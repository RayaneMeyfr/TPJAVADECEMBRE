import tp1.ecercice4.Doublon;
import tp1.exercice1.Note;
import tp1.exercice2.PrixTTC;
import tp1.exercice3.NombrePalindrome;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        //exo1
        //Note notes = new Note();
        //exo2
        //PrixTTC prix = new PrixTTC(100);
        //exo3
        //NombrePalindrome nombre = new NombrePalindrome(12);

        //exo4
        int[] listesSansDoublon = {1,2,3,4,5,6,8,9,10 };
        Doublon unDoublon = new Doublon(listesSansDoublon);
        int[] listesAvecDoublon = {1,2,3,4,5,6,8,10,10 };
        Doublon unDoublon2 = new Doublon(listesAvecDoublon);

    }
}

