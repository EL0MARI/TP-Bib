import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Library bibliotheque = new Library();

        Book livre = new Book(new Isbn("1234567890123"), "Programmation Java", "Med", 2025);
        Member membre = new Member("1", "Ahmed Ali", new Email("ahmed@test.com"), LocalDate.now());

        bibliotheque.ajouterLivre(livre);
        bibliotheque.inscrireMembre(membre);

        loan emprunt = bibliotheque.emprunterLivre(livre, membre, LocalDate.now(), LocalDate.now().plusDays(7));

        System.out.println(emprunt);
        emprunt.mettreAJourStatut();
        System.out.println("Statut après mise à jour: " + emprunt.getStatut());
    }
}
