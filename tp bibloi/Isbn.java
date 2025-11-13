public record Isbn(String valeur) {
    public Isbn {
        if (valeur == null || !valeur.matches("\\d{13}")) {
            throw new IllegalArgumentException("ISBN invalide");
        }
    }
}
