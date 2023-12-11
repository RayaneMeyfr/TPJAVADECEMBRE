package tp1.ecercice4;

public class Doublon {
    private int[] listes;

    public Doublon(int[] listes) {
        this.listes = listes;

        if(verificationDeDoublon(listes)){
            System.out.println("Il existe un doublon");
        }else {
            System.out.println("Pas de doublon");
        }
    }

    public boolean verificationDeDoublon(int[] listes){
        int index = 0;
        for(int nombre : listes){
            for(int unNombre : listes){


            }

        }


        return false;
    }
}
