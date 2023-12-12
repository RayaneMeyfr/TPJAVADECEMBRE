import tp2.Thermometre;

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
       /* int[] listesSansDoublon = {1,2,3,4,5,6,8,9,10 };
        Doublon unDoublon = new Doublon(listesSansDoublon);
        int[] listesAvecDoublon = {1,2,3,4,5,6,8,10,10 };
        Doublon unDoublon2 = new Doublon(listesAvecDoublon);*/

        //exo5
        //Convertisseur romain = new Convertisseur("Iv");

        //TP2
        Thermometre unThermometre = new Thermometre();
        unThermometre.setTemperatureFahrenheit(122);
        unThermometre.afficheTemperature();
        Thermometre unThermometre2 = new Thermometre(10);
        unThermometre2.afficheTemperature();

    }
}

