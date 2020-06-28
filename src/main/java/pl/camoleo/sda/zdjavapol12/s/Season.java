package pl.camoleo.sda.zdjavapol12.s;

import java.time.Year;

public enum Season {

    SPRING(93,"Wiosna"),
    SUMMER(93, "Lato"),
    FALL(90, "Jesień"),
    WINTER(89, "Zima");            //nie dajemy przecinka na końcu

    private int daysCounter;
    private String polishTranslation;

    Season(int daysCounter, String translation) {
        this.daysCounter = daysCounter;
        this.polishTranslation = translation;
    }

    public int getDaysCounter(int year) {
        if (this == Season.WINTER && Year.isLeap(year)) {
            return daysCounter + 1;
        }
        return daysCounter;
    }
    public  static Season fromPolishTranslation(String polishTranslation){
        Season.values();
        for(Season s : values()){
            if(polishTranslation.equals(s.polishTranslation)){
                return s;
            }
        }
        throw new UnsupportedOperationException(("nie udało się stworzyć enuma"));
    }
}