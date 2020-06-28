package pl.camoleo.sda.zdjavapol12.s;

import javax.security.sasl.Sasl;
import java.util.stream.Stream;             //Alt+ENTER

import static pl.camoleo.sda.zdjavapol12.s.Season.FALL;
import static pl.camoleo.sda.zdjavapol12.s.Season.SPRING;

public class EnumMain {
    public static void main(String[] args) {

        Season winter = Season.WINTER;
        Season summer = Season.SUMMER;
        Season fall = FALL;
        Season spring = SPRING;
        System.out.println(winter);

        System.out.println("------");

        Season fromString = Season.valueOf("WINTER");
        Season [] seasons = Season.values();
        for (Season s: seasons) {
            System.out.print(s);
            System.out.println(" " + s.getDaysCounter(2019));
        }
        int winterNumber = Season.WINTER.ordinal();

        Season fromInt = Season.values()[winterNumber];     //pod valueOf jest tablica i dlatego
                            // w [] jest odwołanie do konkretnego indeksu w tablicy
        int daysCounter = fromString.getDaysCounter(2019);

        System.out.println(Season.WINTER.getDaysCounter(2019));

        Season wiosna = Season.fromPolishTranslation("Wiosna");
        System.out.println(wiosna);

        int comparisonResult;

    }

}