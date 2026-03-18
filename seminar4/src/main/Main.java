package main;

import acs.cts.singleton.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1=Hotel.getInstance("Intercontinental",7,5);
        System.out.println(hotel1);
        Hotel hotel2=Hotel.getInstance("MegaHotel",200,0);

        hotel1.rezerva_camera();
        hotel1.rezerva_camera();
        hotel2.rezerva_camera();
        hotel2.rezerva_camera();

    }
}