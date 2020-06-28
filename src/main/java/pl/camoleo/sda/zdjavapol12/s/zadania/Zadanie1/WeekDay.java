package pl.camoleo.sda.zdjavapol12.s.zadania.Zadanie1;

import pl.camoleo.sda.zdjavapol12.s.Season;

public enum WeekDay {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    public boolean isWeekDay() {
        return this != SATURDAY && this != SUNDAY;

    }

    public boolean isHoliday() {
        return !isWeekDay();
    }

    public String testDay() {
        if (this == SATURDAY || this == SUNDAY) {
            return "Today time for Rest";
        } else {
            return "Go to work";
        }
    }

}
