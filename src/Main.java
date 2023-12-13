import heritage.Salarie;
import heritage.Stagiare;
import tp2.Thermometre;

import java.time.LocalDate;

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
        /*Thermometre unThermometre = new Thermometre();
        unThermometre.setTemperatureFahrenheit(122);
        unThermometre.afficheTemperature();
        Thermometre unThermometre2 = new Thermometre(10);
        unThermometre2.afficheTemperature();*/

        //TPHeritageDemo
        Salarie michel = new Salarie(
                "Quezak",
                "Michel",
                LocalDate.of(1980, 12, 31),
                30,
                LocalDate.now()
        );

        System.out.println(michel);

        Stagiare nicola = new Stagiare("datel","nicola",
                LocalDate.of(2000, 8, 25),
                LocalDate.of(2023, 9, 1),
                LocalDate.of(2023, 10, 1),michel);

        System.out.println(nicola);
    }



}


