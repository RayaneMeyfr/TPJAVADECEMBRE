package tp1.exercice4;

public class Doublon {
    private int[] listes;
    private int doublon;

    public Doublon(int[] listes) {
        this.listes = listes;
        this.doublon = 0;

        if(verificationDeDoublon(listes)){
            System.out.println("Le tableau contient un doublon avec "+this.doublon);
        }else {
            System.out.println("Le tableau ne contient pas de doublon");
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
                        this.doublon = listes[index2];
                        break;
                    }
                }
            }
            comteurDoublon = 0;
        }

        return verifDoublon;
    }
}
