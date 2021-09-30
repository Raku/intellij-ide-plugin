package edument.perl6idea.pm;

public enum RakuPackageManagerKind {
    EMPTY, ZEF, PAKKU;

    public String getName() {
        switch (this) {
            case ZEF:
                return "zef";
            case PAKKU:
                return "Pakku";
            default:
                return "...";
        }
    }
}
