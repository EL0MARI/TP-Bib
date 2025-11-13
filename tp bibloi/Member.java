import java.time.LocalDate;
import java.util.Objects;

public class Member {
    private final String id;
    private final String nomComplet;
    private final Email email;
    private final LocalDate dateInscription;

    public Member(String id, String nomComplet, Email email, LocalDate dateInscription) {
        if (id == null || nomComplet == null || email == null || dateInscription == null) {
            throw new IllegalArgumentException("Informations du membre invalides");
        }
        if (dateInscription.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La date d'inscription ne peut pas être dans le futur");
        }
        this.id = id;
        this.nomComplet = nomComplet;
        this.email = email;
        this.dateInscription = dateInscription;
    }

    public String getId() { return id; }
    public String getNomComplet() { return nomComplet; }
    public Email getEmail() { return email; }
    public LocalDate getDateInscription() { return dateInscription; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member)) return false;
        Member membre = (Member) o;
        return id.equals(membre.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Member{" + id + ", " + nomComplet + ", " + email + ", " + dateInscription + "}";
    }
}
