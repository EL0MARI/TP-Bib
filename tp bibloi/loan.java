import java.time.LocalDate;
import java.util.Objects;

public class loan {
    private final Book livre;
    private final Member membre;
    private final LocalDate dateEmprunt;
    private final LocalDate dateRetour;
    private LoanStatus statut;

    public loan(Book livre, Member membre, LocalDate dateEmprunt, LocalDate dateRetour) {
        if (livre == null || membre == null || dateEmprunt == null || dateRetour == null) {
            throw new IllegalArgumentException("Informations de l'emprunt invalides");
        }
        if (dateEmprunt.isAfter(dateRetour)) {
            throw new IllegalArgumentException("La date d'emprunt doit être avant la date de retour");
        }
        this.livre = livre;
        this.membre = membre;
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
        this.statut = LoanStatus.ONGOING;
    }

    public void mettreAJourStatut() {
        if (statut == LoanStatus.ONGOING && LocalDate.now().isAfter(dateRetour)) {
            statut = LoanStatus.LATE;
        }
    }

    public boolean changerStatut(LoanStatus suivant) {
        if (statut.peutAllerVers(suivant)) {
            statut = suivant;
            return true;
        }
        return false;
    }

    public LoanStatus getStatut() { return statut; }

    @Override
    public String toString() {
        return "Loan{" + livre + ", " + membre + ", statut=" + statut + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof loan)) return false;
        loan emprunt = (loan) o;
        return livre.equals(emprunt.livre) && membre.equals(emprunt.membre) && dateEmprunt.equals(emprunt.dateEmprunt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livre, membre, dateEmprunt);
    }
}
