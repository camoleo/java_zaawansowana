package pl.camoleo.sda.zdjavapol12.s.enums.Zadanie2;

public enum Print {

    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE;

    public void Times(String s) {
        int ordinalNumber = Print.ONE.ordinal();

        for (int i = 0; i < ordinal() + 1; i++) {
            System.out.println(s);

        }

    }
}

