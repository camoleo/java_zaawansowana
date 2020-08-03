package com.camoleo.zad16;

import java.time.Duration;

public enum Runner {
    BEGINNER(181L, Long.MAX_VALUE),
    INTERMEDIATE(151L, 180L),
    ADVANCED(120L, 150L),
    PROFESSIONAL(Integer.MIN_VALUE, 130);

    private final long minTime;
    private final long maxTime;


    Runner(long minTime, long maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    //   public Runner getFitnessLevel(long runningTime){
//        return (runningTime <= 150) ? ADVANCED : (runningTime <= 180L) ? INTERMEDIATE : BEGINNER;
//    }
//    public static Runner getFitnessLevel(long runningTime) {
//        return (runningTime <= ADVANCED.maxTime) ? ADVANCED : (runningTime <= INTERMEDIATE.maxTime) ? INTERMEDIATE : BEGINNER;
//
//    }
    public static Runner getFitnessLevel(long runningTime) {
        for (Runner value : Runner.values()) {
            if (runningTime <= value.maxTime && runningTime >= value.minTime) {
                return value;
            }
        }
        return BEGINNER;
    }

}
//<2:30 - ADVANCED <3:00 - INTERMEDIATE >= 3:00 - BEGINNER
//* Duration - czas