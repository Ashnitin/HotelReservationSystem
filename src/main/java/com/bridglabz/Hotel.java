package com.bridglabz;

import java.time.DayOfWeek;

public class Hotel {
    private String hotelName;
    private int weekRate;
    private int weekendRate;
    private int weekRateForRewardCustomer;
    private int weekendRateForRewardCustomer;

    public Hotel(String hotelName, int weekRate, int weekendRate, int weekRateForRewardCustomer, int weekendRateForRewardCustomer) {
        this.hotelName = hotelName;
        this.weekRate = weekRate;
        this.weekendRate = weekendRate;
        this.weekRateForRewardCustomer = weekRateForRewardCustomer;
        this.weekendRateForRewardCustomer = weekendRateForRewardCustomer;
    }
    public Hotel() {
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekRate() {
        return weekRate;
    }

    public void setWeekRate(int weekRate) {
        this.weekRate = weekRate;
    }

    public int getWeekendRate() {
        return weekendRate;
    }

    public void setWeekendRate(int weekendRate) {
        this.weekendRate = weekendRate;
    }

    public int getWeekRateForRewardCustomer() {
        return weekRateForRewardCustomer;
    }

    public void setWeekRateForRewardCustomer(int weekRateForRewardCustomer) {
        this.weekRateForRewardCustomer = weekRateForRewardCustomer;
    }

    public int getWeekendRateForRewardCustomer() {
        return weekendRateForRewardCustomer;
    }

    public void setWeekendRateForRewardCustomer(int weekendRateForRewardCustomer) {
        this.weekendRateForRewardCustomer = weekendRateForRewardCustomer;
    }

    public int calculateRateForCustomer(String day){
        if(day.equals("MONDAY")||day.equals("TUESDAY")||day.equals("WEDNESDAY")||day.equals("THURSDAY")||day.equals("FRIDAY")){
            return weekRate;
        }
        else {
            return weekendRate;
        }

}
}
