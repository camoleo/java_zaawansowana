package pl.camoleo.sda.zdjavapol12.s.Exceptions.wyjatki_zadanie_1.v2;


public class UnsupportedMonthExceptionTest {
    public static void main(String[] args) {
        try {
            for (int i = 1; i < 13; i++) {
                Month month = Month.ofNumber(i);
                System.out.println(month);
            }

        } catch (UnsupportedMonthException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getInvalidMonthNumber());
        }
    }
}
