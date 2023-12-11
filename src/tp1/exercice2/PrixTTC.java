package tp1.exercice2;

public class PrixTTC {
    private double prixHT;

    private static double tva = 1.2;

    public PrixTTC(double prixHT) {
        this.prixHT = prixHT;

        if(this.prixHT <=0){
            System.out.println("Le prixHT doit être supérieur a zéro");
        }else{
            System.out.println("Le prix ttc et : "+calculTTC(this.prixHT));
        }
    }

    public double calculTTC(double prixHT){
        return prixHT * this.tva;
    }
}
