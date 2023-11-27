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

    }
    public void calculateRateForRegularCustomer(){
        int sumLakewood=hotelList.get(0).calculateRateForCustomer(String.valueOf(ci))+hotelList.get(0).calculateRateForCustomer(String.valueOf(co));
        System.out.println(sumLakewood);
        int sumBridgeWood=hotelList.get(1).calculateRateForCustomer(String.valueOf(ci))+hotelList.get(1).calculateRateForCustomer(String.valueOf(co));
        System.out.println(sumBridgeWood);
        int sumRidgeWood=hotelList.get(2).calculateRateForCustomer(String.valueOf(ci))+hotelList.get(2).calculateRateForCustomer(String.valueOf(co));
        System.out.println(sumRidgeWood);

        if(sumLakewood<=sumBridgeWood && sumBridgeWood<=sumRidgeWood){
            if(sumBridgeWood==sumLakewood) {
                System.out.println("*******************************************************************");
                System.out.println("Cheapest Hotel is LakeWood: " + "$" + sumLakewood);
                System.out.println("Cheapest Hotel is BridgeWood: "+"$"+sumBridgeWood);
                System.out.println("*******************************************************************");
            }

        } else if (sumBridgeWood<=sumLakewood&&sumBridgeWood<=sumRidgeWood) {
            System.out.println("Cheapest Hotel is BridgeWood: "+"$"+sumBridgeWood);
        }
        else {
            System.out.println("Cheapest Hotel is RidgeWood: "+"$"+sumRidgeWood);
        }
    }
}
