package com.bridglabz;

import java.time.DayOfWeek;

public class Hotel {
    private String hotelName;
    private int weekRate;
    private int weekendRate;
    private int weekRateForRewardCustomer;
    private int weekendRateForRewardCustomer;
    private int rating;

    public Hotel(String hotelName, int weekRate, int weekendRate, int weekRateForRewardCustomer, int weekendRateForRewardCustomer, int rating) {
        this.hotelName = hotelName;
        this.weekRate = weekRate;
        this.weekendRate = weekendRate;
        this.weekRateForRewardCustomer = weekRateForRewardCustomer;
        this.weekendRateForRewardCustomer = weekendRateForRewardCustomer;
        this.rating = rating;
    }

    public Hotel() {
    }


    public int calculateRateForCustomer(String day){
        if(day.equals("MONDAY")||day.equals("TUESDAY")||day.equals("WEDNESDAY")||day.equals("THURSDAY")||day.equals("FRIDAY")){
            return weekRate;
        }
        else {
            return weekendRate;
        }
}

   public int calculateRating(int r) {
        return rating;
    }
}
