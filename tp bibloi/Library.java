import java.util.*;

public class Library {
    private final List<Book> livres = new ArrayList<>();
    private final List<Member> membres = new ArrayList<>();
    private final List<loan> emprunts = new ArrayList<>();

    public void ajouterLivre(Book livre) {
        livres.add(livre);
    }

    public void inscrireMembre(Member membre) {
        membres.add(membre);
    }

    public loan emprunterLivre(Book livre, Member membre, java.time.LocalDate dateEmprunt, java.time.LocalDate dateRetour) {
        loan emprunt = new loan(livre, membre, dateEmprunt, dateRetour);
        emprunts.add(emprunt);
        return emprunt;
    }

    public List<Book> getLivres() {
        return Collections.unmodifiableList(livres);
    }

    public List<Member> getMembres() {
        return Collections.unmodifiableList(membres);
    }

    public List<loan> getEmpruntsActifs() {
        return emprunts.stream().filter(e -> e.getStatut().isActif()).toList();
    }
}
