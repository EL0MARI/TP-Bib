import java.util.Objects;

public class Book {
    private final Isbn isbn;
    private final String titre;
    private final String auteur;
    private final int anneePublication;

    public Book(Isbn isbn, String titre, String auteur, int anneePublication) {
        if (isbn == null || titre == null || auteur == null) {
            throw new IllegalArgumentException("Informations du livre invalides");
        }
        this.isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
    }

    public Isbn getIsbn() { return isbn; }
    public String getTitre() { return titre; }
    public String getAuteur() { return auteur; }
    public int getAnneePublication() { return anneePublication; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book livre = (Book) o;
        return isbn.equals(livre.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "Book{" + isbn + ", " + titre + ", " + auteur + ", " + anneePublication + "}";
    }
}
