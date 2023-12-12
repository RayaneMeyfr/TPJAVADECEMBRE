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
        boolean verifDoublon = false;
        int comteurDoublon = 0;
        for(int index1 = 0; index1<listes.length;index1++) {
            for(int index2 = 0; index2<listes.length;index2++) {
                if (listes[index1]==listes[index2]){
                    comteurDoublon++;
                    if(comteurDoublon>=2){
                        verifDoublon = true;
                        break;
                    }
                }
            }
            comteurDoublon = 0;
        }

        return verifDoublon;
    }
}
