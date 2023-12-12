package tp1.exercice5;

import java.util.HashMap;
import java.util.Map;

public class Convertisseur {
    private HashMap<String, Integer> tableauConvertion;
    private String romain;

    public Convertisseur(String romain) {
        this.tableauConvertion = new HashMap<>();
        this.tableauConvertion.put("I", 1);
        this.tableauConvertion.put("V", 5);
        this.tableauConvertion.put("X", 10);
        this.tableauConvertion.put("L", 50);
        this.tableauConvertion.put("C", 100);
        this.tableauConvertion.put("D", 500);
        this.tableauConvertion.put("M", 1000);

        this.romain = romain;
        if(romain.length()<=15){
            System.out.println("resultat après convertion : " + conversion(this.romain));
        }else{
            System.out.println("Le nombre de caractère doit être supérieur de 15 maximum");
        }

    }

    public int conversion(String romain) {
        int chiffreConverti = 0;

        String lettrePrecedente = "";
        String lettrePrecedenteEtActuelle = "";
        int chiffrePrecedent = 0;

        romain = romain.toUpperCase();

        int longueurChiffreRomain = romain.length();
        char[] tableau = new char[longueurChiffreRomain];

        for (int i = 0; i < longueurChiffreRomain; i++) {
            tableau[i] = romain.charAt(i);
        }

        for (int index1 = 0; index1 < tableau.length; index1++) {
            for (Map.Entry<String, Integer> maMap : tableauConvertion.entrySet()) {

                if (maMap.getKey().equals(String.valueOf(tableau[index1]))) {
                    System.out.println(maMap.getKey());
                    lettrePrecedenteEtActuelle = lettrePrecedente + maMap.getKey();

                    if (lettrePrecedenteEtActuelle.equals("IV")) {
                        chiffreConverti -= chiffrePrecedent;
                        chiffreConverti += 4;
                        chiffrePrecedent = 4;
                        lettrePrecedente = "V";
                    } else if (lettrePrecedenteEtActuelle.equals("IX")) {
                        chiffreConverti -= chiffrePrecedent;
                        chiffreConverti += 9;
                        chiffrePrecedent = 9;
                        lettrePrecedente = "X";
                    } else if (lettrePrecedenteEtActuelle.equals("XL")) {
                        chiffreConverti -= chiffrePrecedent;
                        chiffreConverti += 40;
                        chiffrePrecedent = 40;
                        lettrePrecedente = "L";
                    } else if (lettrePrecedenteEtActuelle.equals("XC")) {
                        chiffreConverti -= chiffrePrecedent;
                        chiffreConverti += 90;
                        chiffrePrecedent = 90;
                        lettrePrecedente = "C";
                    } else if (lettrePrecedenteEtActuelle.equals("CD")) {
                        chiffreConverti -= chiffrePrecedent;
                        chiffreConverti += 400;
                        chiffrePrecedent = 400;
                        lettrePrecedente = "D";
                    } else if (lettrePrecedenteEtActuelle.equals("CM")) {
                        chiffreConverti -= chiffrePrecedent;
                        chiffreConverti += 900;
                        chiffrePrecedent = 900;
                        lettrePrecedente = "M";
                    } else {
                        chiffreConverti += maMap.getValue();
                        lettrePrecedente = maMap.getKey();
                        chiffrePrecedent = maMap.getValue();
                    }
                }
            }
        }

        return chiffreConverti;
    }
}

