package pl.camoleo.sda.zdjavapol12.s.Exceptions.wyjatki_zadanie_1.v1;

public class UnsupportedMonthException extends RuntimeException {
    int invalidMonthNumber;

    public int getInvalidMonthNumber() {
        return invalidMonthNumber;
    }

    public UnsupportedMonthException(int invalidMonthNumber) {
        this.invalidMonthNumber = invalidMonthNumber;
    }

    public UnsupportedMonthException(String message, int invalidMonthNumber) {
        super("Error occured while parsing" + invalidMonthNumber + "to Month");
        this.invalidMonthNumber = invalidMonthNumber;
    }


}
