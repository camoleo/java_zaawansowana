package pl.camoleo.sda.zdjavapol12.s.Exceptions.wyjatki_zadanie_1.v1;

public enum Month {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

   int monthNumber;

    Month(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public static Month ofNumber(int monthNumber) {
        for (Month month : values()) {
            if (monthNumber == month.ordinal() + 1) {
                return month;
            }

        }
        throw new UnsupportedMonthException(monthNumber);
    }

    public boolean isMonthNumberSupported(int monthNumber){
        return monthNumber > 0 && monthNumber < values().length;
    }
}


