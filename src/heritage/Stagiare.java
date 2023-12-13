package heritage;

import java.time.LocalDate;

public class Stagiare extends Personne {
    private LocalDate debutContrat;
    private LocalDate finContrat;

    private Salarie tuteur;

    public Stagiare(String nom, String prenom, LocalDate dateNaissance, LocalDate debutContrat, LocalDate finContrat, Salarie tuteur) {
        super(nom, prenom, dateNaissance);
        this.debutContrat = debutContrat;
        this.finContrat = finContrat;
        this.tuteur = tuteur;
    }

    public LocalDate getDebutContrat() {
        return debutContrat;
    }

    public LocalDate getFinContrat() {
        return finContrat;
    }

    public Salarie getTuteur() {
        return tuteur;
    }

    public void setDebutContrat(LocalDate debutContrat) {
        this.debutContrat = debutContrat;
    }

    public void setFinContrat(LocalDate finContrat) {
        this.finContrat = finContrat;
    }

    public void setTuteur(Salarie tuteur) {
        this.tuteur = tuteur;
    }

    @Override
    public String toString() {
        return "Stagiare{" +
                "debutContrat=" + debutContrat +
                ", finContrat=" + finContrat +
                ", tuteur=" + tuteur +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                '}';
    }
}
