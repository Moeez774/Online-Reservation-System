package Main_System;


import java.io.IOException;

import java.util.Scanner;

public class Main_System{
    public static void main(String[] args) throws IOException {

        //Main System

        Online_Reservation_System o = new Online_Reservation_System();

        int i;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1-Add Account");
            System.out.println("2-Remove Account");
            System.out.println("3-View Accounts");
            System.out.println("4-Add Reservations only for System Managers");
            System.out.println("5-Apply for Booking");
            System.out.println("6-Approve Bookings only for System Managers");
            System.out.println("8-View All Reservations");
            System.out.println("9-View Customer Booking List");
            System.out.println("10-Set Seats only for System Managers");
            System.out.println("11-View Approved Bookings");
            System.out.println("12-Find Distance Between Two Places");
            System.out.println("13-Cancel Booking");
            System.out.println("14-Search Transportation");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (o != null) {
                        o.addAccount();
                    }
                    break;
                case 2:
                    if (o != null) {
                        o.removeAccount();
                    }
                    break;
                case 3:
                    if (o != null) {
                        o.viewAccounts();
                    }
                    break;
                case 4:
                    if (o != null) {
                        o.addReservations();
                    }
                    break;
                case 5:
                    if (o != null) {
                        o.applyForBooking();
                    }
                    break;
                case 6:
                    if (o != null) {
                        o.approveBookings();
                    }
                    break;
                case 7:
                    if (o != null) {
                        o.viewAllReservations();
                    }
                    break;
                case 8:
                    if (o != null) {
                        o.viewCustomerBookingList();
                    }
                    break;
                case 9:
                    if (o != null) {
                        o.setSeats();
                    }
                    break;
                case 10:
                    if (o != null) {
                        o.viewApprovedBookings();
                    }
                    break;
                case 11:
                    if (o != null) {
                        o.findDistanceBetweenTwoPlaces();
                    }
                    break;
                case 12:
                    if (o != null) {
                        o.cancelBooking();
                    }
                    break;
                case 13:
                    if (o != null) {
                        o.searchTransportation();
                    }
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            System.out.println("Enter 1 to perform more functions or press any other key to exist");
            System.out.print("Enter: ");
            i = sc.nextInt();
        } while (i == 1);

        System.out.println("Exit Successfully");

    }
}