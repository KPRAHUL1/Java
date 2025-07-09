package BusReservation;

import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {
    public static void main(String[] args) {
//        Bus[] buses = new Bus[50];
        ArrayList<Bus> buses =new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();
          buses.add(new Bus(1,true,2));
        buses.add(new Bus(1,true,12));
        buses.add(new Bus(1,true,38));
        int userOpt =1;
        Scanner s = new Scanner(System.in);
        for (Bus b:buses){
            b.displayBusInfo();
        }
        while(userOpt==1){
            System.out.println("Enter 1 to Book and 2 to exit");
            userOpt = s.nextInt();
            if ((userOpt==1)){
                Booking booking = new Booking();
                if (booking.isAvailable(bookings,buses)){
                    bookings.add((booking));
                    System.out.println("Your booking is confirmed");
                }
                else{
                    System.out.println("Sorry. Bus is full, Try another bus or date");
                }
            }
        }

    }
}
