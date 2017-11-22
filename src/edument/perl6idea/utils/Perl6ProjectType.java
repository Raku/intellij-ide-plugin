package edument.perl6idea.utils;

public enum Perl6ProjectType {
    PERL6_SCRIPT,
    PERL6_MODULE,
    PERL6_APPLICATION;

    public static String toTypeLabel(Perl6ProjectType type) {
        switch (type) {
            case PERL6_SCRIPT:
                return "Perl 6 script";
            case PERL6_MODULE:
                return "Perl 6 module";
            default:
                return "Perl 6 application";
        }
    }

    public static Perl6ProjectType fromTypeLabel(String label) {
        switch (label) {
            case "Perl 6 script":
                return PERL6_SCRIPT;
            case "Perl 6 module":
                return PERL6_MODULE;
            default:
                return PERL6_APPLICATION;
        }
    }
}