package pl.camoleo.sda.zdjavapol12.s.zadania.Zadanie1;

import pl.camoleo.sda.zdjavapol12.s.Season;

public class WeekDayDemo {
    public static void main(String[] args) {

        WeekDay[] weekDays = WeekDay.values();

        for (WeekDay w : weekDays) {
            System.out.println(w.testDay());
        }

    }

    public String IsGreaterThanSaturday(WeekDay weekDay) {
        WeekDay saturday = WeekDay.SATURDAY;

        int result = saturday.compareTo(weekDay);

        if (result < 0) {
            return "Is greater";
        } else if (result > 0) {
            return "Is not greater";
        } else {
            return "Is equal";
        }
    }
}



