public record Email(String valeur) {
    public Email {
        if (valeur == null || !valeur.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Email invalide");
        }
    }
}
