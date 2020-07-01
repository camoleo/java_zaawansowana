package pl.camoleo.sda.zdjavapol12.s.enums.Zadanie4;

public enum MenuItems implements Translatable {
    PRODUCTS,
    CONTACT,
    SITE_MAP,
    BLOG;

    @Override
    public String translate(Language language) {
        switch (this) {
            case PRODUCTS:
                switch (language) {
                    case PL:
                        return "produkty";
                    case ENG:
                        return "products";
                    case DE:
                        return "Produkte";

                }
            case CONTACT:
                switch (language) {
                    case PL:
                        return "kontakt";
                    case ENG:
                        return "contact";
                    case DE:
                        return "der Kontakt";
                }
            case SITE_MAP:
                switch (language) {
                    case PL:
                        return "mapa strony";
                    case ENG:
                        return "site map";
                    case DE:
                        return "Seitenverzeichnis";
                }
            case BLOG:
                switch (language) {
                    case PL:
                        return "blog";
                    case ENG:
                        return "blog";
                    case DE:
                        return "Blog";
                }
        } throw new IllegalArgumentException();

    }
}