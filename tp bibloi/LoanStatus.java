public enum LoanStatus {
    ONGOING, RETURNED, LATE;

    public boolean isActif() {
        return this == ONGOING || this == LATE;
    }

    public boolean peutAllerVers(LoanStatus suivant) {
        return switch (this) {
            case ONGOING -> suivant == RETURNED || suivant == LATE;
            case LATE -> suivant == RETURNED;
            case RETURNED -> false;
        };
    }
}
