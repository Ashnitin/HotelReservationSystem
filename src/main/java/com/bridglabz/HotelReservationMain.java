package com.bridglabz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class HotelReservationMain {
    LocalDate checkIn= LocalDate.of(2020, 9, 11);
    LocalDate checkOut= LocalDate.of(2020, 9, 12);
    DayOfWeek ci=checkIn.getDayOfWeek();

    DayOfWeek co=checkOut.getDayOfWeek();

    ArrayList <Hotel> hotelList=new ArrayList<>();

    public void addHotel(Hotel hotel){

        hotelList.add(hotel);
    }
    public static void main(String[] args) {
        HotelReservationMain h=new HotelReservationMain();
        Hotel lakeWood=new Hotel("Lakewood",110,90,80,80,3);
        Hotel bridgeWood=new Hotel("BridgeWood",150,50,110,50,4);
        Hotel ridgeWood=new Hotel("RidgeWood",220,150,100,40,5);

        h.addHotel(lakeWood);
        h.addHotel(bridgeWood);
        h.addHotel(ridgeWood);
        h.calculateRateForRegularCustomer();
        h.bestRatedHotel();
    }
    public void calculateRateForRegularCustomer(){
        int sumLakewood=hotelList.get(0).calculateRateForCustomer(String.valueOf(ci))+hotelList.get(0).calculateRateForCustomer(String.valueOf(co));
        System.out.println("LakWood: "+"$"+sumLakewood);
        int sumBridgeWood=hotelList.get(1).calculateRateForCustomer(String.valueOf(ci))+hotelList.get(1).calculateRateForCustomer(String.valueOf(co));
        System.out.println("BridgeWood: "+"$"+sumBridgeWood);
        int sumRidgeWood=hotelList.get(2).calculateRateForCustomer(String.valueOf(ci))+hotelList.get(2).calculateRateForCustomer(String.valueOf(co));
        System.out.println("RidgeWood: "+"$"+sumRidgeWood);
        int lakeWoodRating=hotelList.get(0).calculateRating(3);
        int bridgeWoodRating=hotelList.get(1).calculateRating(4);
        int ridgeWoodRating=hotelList.get(2).calculateRating(5);

        if(sumLakewood<=sumBridgeWood && sumBridgeWood<=sumRidgeWood){
            if(sumLakewood==sumBridgeWood) {

                    System.out.println("*******************************************************************");
                    if (lakeWoodRating<bridgeWoodRating) {
                        System.out.println("Cheapest best Hotel is LakeWood: " + "$" + sumLakewood);
                        System.out.println("Cheapest Hotel is BridgeWood: " + "$" + sumBridgeWood);
                        System.out.println("Cheapest Best Rated Hotel is BridgeWood: "+"$"+sumBridgeWood+"\nRating is: "+bridgeWoodRating);
                        System.out.println("*******************************************************************");
                    }
            }
        } else if (sumBridgeWood<=sumLakewood&&sumBridgeWood<=sumRidgeWood) {
            System.out.println("Cheapest Hotel is BridgeWood: "+"$"+bridgeWoodRating);
        }
        else {
            System.out.println("Cheapest Hotel is RidgeWood: "+"$"+sumRidgeWood);
        }
    }
    public void bestRatedHotel(){
        int sumLakewood=hotelList.get(0).calculateRateForCustomer(String.valueOf(ci))+hotelList.get(0).calculateRateForCustomer(String.valueOf(co));
        System.out.println("LakWood: "+"$"+sumLakewood);
        int sumBridgeWood=hotelList.get(1).calculateRateForCustomer(String.valueOf(ci))+hotelList.get(1).calculateRateForCustomer(String.valueOf(co));
        System.out.println("BridgeWood: "+"$"+sumBridgeWood);
        int sumRidgeWood=hotelList.get(2).calculateRateForCustomer(String.valueOf(ci))+hotelList.get(2).calculateRateForCustomer(String.valueOf(co));
        System.out.println("RidgeWood: "+"$"+sumRidgeWood);
        int lakeWoodRating=hotelList.get(0).calculateRating(3);
        int bridgeWoodRating=hotelList.get(1).calculateRating(4);
        int ridgeWoodRating=hotelList.get(2).calculateRating(5);

        if(lakeWoodRating>=bridgeWoodRating && lakeWoodRating>=ridgeWoodRating){
            System.out.println("*******************************************************************");
            System.out.println("Best Rated Hotel is LakeWood: "+lakeWoodRating);
            System.out.println("*******************************************************************");
        } else if (bridgeWoodRating>=lakeWoodRating &&bridgeWoodRating>=ridgeWoodRating) {
            System.out.println("*******************************************************************");
            System.out.println("Best Rated Hotel is BridgeWood: "+bridgeWoodRating);
            System.out.println("*******************************************************************");
        }else{
            System.out.println("*******************************************************************");
            System.out.println("Best Rated Hotel is RidgeWood: "+ridgeWoodRating);
            System.out.println("Rate is: "+sumRidgeWood);
            System.out.println("*******************************************************************");
        }
    }
}
