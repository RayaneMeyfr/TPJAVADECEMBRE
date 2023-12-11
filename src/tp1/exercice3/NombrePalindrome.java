package tp1.exercice3;

public class NombrePalindrome {
    private int nombre;

    public NombrePalindrome(int nombre) {
        this.nombre = nombre;



        if (nombre >= 10){

            int inverser = 0;

            while (this.nombre != 0) {
                inverser = inverser * 10;
                inverser = inverser + this.nombre % 10;
                this.nombre = this.nombre / 10;
            }

            if (verificationNombrePalindrome(inverser,nombre)){
                System.out.println("Good");
            }else {
                System.out.println("nule");
            }
        }

    }


    public boolean verificationNombrePalindrome(int inverser,int nombre){

        if(inverser == nombre){
            return true;
        }else {
            return false;
        }

    }
}
