package Main_System;

import Methods.*;
import Methods.Edge;

import java.io.*;
import java.util.*;

public class Online_Reservation_System {

    Map<String, List<Edge>> adjacency;
    Queue<Transportation> transportationBookings;
    Queue<Sports> sportBookings;
    Queue<Event> eventBookings;
    Queue<Hotel> hotelBookings;
    List<Account> accounts;
    List<Sports> sports;
    List<Event> events;
    List<Hotel> hotels;
    List<Transportation> transportation;
    HashMap<Transportation, List<Double>> transportationSeats;
    HashMap<Sports, List<Double>> sportsSeats;
    HashMap<Event, List<Double>> eventSeats;
    HashMap<Hotel, List<Double>> hotelSeats;
    HashMap<Account, List<Booking>> customerBookings;
    List<Booking> ApprovedBookings;

    public Online_Reservation_System() {
        adjacency = new HashMap<>();
        ApprovedBookings = new LinkedList<>();
        customerBookings = new HashMap<>();
        accounts = new LinkedList<>();
        sports = new ArrayList<>();
        transportationSeats = new HashMap<>();
        sportsSeats = new HashMap<>();
        eventSeats = new HashMap<>();
        hotelSeats = new HashMap<>();
        events = new ArrayList<>();
        hotels = new ArrayList<>();
        transportationBookings = new LinkedList<>();
        sportBookings = new LinkedList<>();
        eventBookings = new LinkedList<>();
        hotelBookings = new LinkedList<>();
        transportation = new LinkedList<>();
    }

    public void addAccount() {

        //Add Accounts

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        String number = sc.nextLine();
        System.out.print("Enter Date of Birth: ");
        String DOB = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Set Password: ");
        double p = sc.nextInt();
        Account c = new Account(name, age, address, number, DOB, email, p);
        if (c.getAge() < 18) {
            System.out.println("Age Must Be 18 Plus");
        } else {
            accounts.add(c);
            System.out.println("Account Added Successfully");
        }

    }

    public void removeAccount() {

        //Remove Accounts

        Scanner sc = new Scanner(System.in);
        if (accounts.isEmpty()) {
            System.out.println("No Customer Added Yet");
        } else {
            Account a1 = null;
            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Email");
            String email = sc.nextLine();
            System.out.print("Enter Password: ");
            double p = sc.nextInt();
            for (Account a : accounts) {
                if (name.equals(a.getName()) && email.equals(a.getEMail()) && a.getPassword() == p) {
                    a1 = a;
                    break;
                }
            }
            if (a1 == null) {
                System.out.println("No Account exist of provided Information");
            } else {
                accounts.remove(a1);
                System.out.println("Account Removed");
            }
        }

    }

    public void viewAccounts() {

        //View Accounts List

        if (accounts.isEmpty()) {
            System.out.println("No Customer Added Yet");
        }
        for (Account a : accounts) {
            System.out.println(a);
        }

    }

    public void addReservations() {

        //Add Reservations (Only for System Managers)

        Scanner sc = new Scanner(System.in);
        String p = "1234reservation";
        System.out.print("Enter Password for Adding Reservations: ");
        String password = sc.nextLine();
        if (!password.equals(p)) {
            System.out.println("Wrong Password");
        } else {
            System.out.println("1-Transportations");
            System.out.println("2-Sports");
            System.out.println("3-Events");
            System.out.println("4-Hotels");
            System.out.print("Answer: ");
            int answer = sc.nextInt();
            if (answer == 1) {
                sc.nextLine();
                System.out.print("Enter Type: ");
                String type = sc.nextLine();
                type = type.toLowerCase();
                System.out.print("Enter Date: ");
                String date = sc.nextLine();
                date = date.toLowerCase();
                System.out.print("Enter Time: ");
                String time = sc.nextLine();
                time = time.toLowerCase();
                System.out.print("From: ");
                String s = sc.nextLine();
                s = s.toLowerCase();
                System.out.print("To: ");
                String d = sc.nextLine();
                d = d.toLowerCase();
                System.out.print("Enter Time Between these two Places: ");
                int t = sc.nextInt();
                adjacency.putIfAbsent(s, new ArrayList<>());
                adjacency.putIfAbsent(d, new ArrayList<>());
                adjacency.get(s).add(new Edge(d, t));
                adjacency.get(d).add(new Edge(s, t));
                sc.nextLine();
                System.out.print("Enter Price of Ticket: ");
                double price = sc.nextInt();
                System.out.print("Enter Available Seats: ");
                double seats = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Key: ");
                String key = sc.nextLine();
                Transportation t1 = new Transportation(key, seats, type, date, time, s, price, d, seats);
                transportation.add(t1);
                System.out.println("Transportation Added Successfully and Please Set Seats");
            } else if (answer == 2) {
                sc.nextLine();
                System.out.print("Enter Sport: ");
                String sport = sc.nextLine();
                sport = sport.toLowerCase();
                System.out.print("Enter Match: ");
                String match = sc.nextLine();
                match = match.toLowerCase();
                System.out.print("Enter Date: ");
                String date = sc.nextLine();
                date = date.toLowerCase();
                System.out.print("Enter Time: ");
                String time = sc.nextLine();
                time = time.toLowerCase();
                System.out.print("Enter Available Seats: ");
                double seats = sc.nextInt();
                System.out.print("Enter Price of Ticket: ");
                double price = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Key: ");
                String key = sc.nextLine();
                Sports s = new Sports(key, seats, sport, match, seats, time, date, price);
                sports.add(s);
                System.out.println("Sport Added Successfully and Please Set Seats");
            } else if (answer == 3) {
                sc.nextLine();
                System.out.print("Enter Singer Name: ");
                String name = sc.nextLine();
                name = name.toLowerCase();
                System.out.print("Enter Date: ");
                String date = sc.nextLine();
                date = date.toLowerCase();
                System.out.print("Enter Time: ");
                String time = sc.nextLine();
                time = time.toLowerCase();
                System.out.print("Enter Place: ");
                String place = sc.nextLine();
                place = place.toLowerCase();
                System.out.print("Enter Available Seats: ");
                double seats = sc.nextInt();
                System.out.print("Enter Price Of Ticket: ");
                double price = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Key: ");
                String key = sc.nextLine();
                Event e = new Event(key, price, seats, date, time, place, name, seats);
                events.add(e);
                System.out.println("Event Added Successfully and Please Set Seats");
            } else if (answer == 4) {
                sc.nextLine();
                System.out.print("Enter Hotel Name: ");
                String name = sc.nextLine();
                name = name.toLowerCase();
                System.out.print("Enter Available Rooms: ");
                double rooms = sc.nextInt();
                System.out.print("Enter Price Per Night: ");
                double price = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Key: ");
                String key = sc.nextLine();
                Hotel h = new Hotel(key, name, rooms, price, rooms);
                hotels.add(h);
                System.out.println("Hotel Added Successfully and Please Set Rooms");
            } else {
                System.out.println("Invalid Input");
            }
        }

    }

    public void applyForBooking() {

        //Apply for Bookings

        if (accounts.isEmpty()) {
            System.out.println("No Account Added Yet");
        } else {
            Scanner sc = new Scanner(System.in);
            Account a1 = null;
            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Email: ");
            String email = sc.nextLine();
            System.out.print("Enter Password: ");
            double p = sc.nextInt();
            for (Account a : accounts) {
                if (name.equals(a.getName()) && email.equals(a.getEMail()) && a.getPassword() == p) {
                    a1 = a;
                    break;
                }
            }
            if (a1 == null) {
                System.out.println("No Account exist of provided Information");
            } else {
                System.out.println("Booking for? ");
                System.out.println("1-Transportation");
                System.out.println("2-Sport");
                System.out.println("3-Hotel");
                System.out.println("4-Event");
                System.out.print("Answer: ");
                int answer = sc.nextInt();
                if (answer == 1) {
                    if (transportation.isEmpty()) {
                        System.out.println("No Transportation is Available");
                    } else {
                        sc.nextLine();
                        System.out.print("Enter Type of Transportation: ");
                        String type = sc.nextLine();
                        type = type.toLowerCase();
                        System.out.print("Enter Date: ");
                        String date = sc.nextLine();
                        date = date.toLowerCase();
                        System.out.print("Enter Time: ");
                        String time = sc.nextLine();
                        time = time.toLowerCase();
                        System.out.print("From: ");
                        String s = sc.nextLine();
                        s = s.toLowerCase();
                        System.out.print("To: ");
                        String d = sc.nextLine();
                        d = d.toLowerCase();
                        System.out.print("Enter Key of Transportation: ");
                        String key = sc.nextLine();
                        System.out.print("Enter Seat Number: ");
                        double number = sc.nextInt();
                        Transportation t = new Transportation(key, a1.getName(), type, date, time, s, d, number);
                        transportationBookings.add(t);
                        System.out.println("Successfully Applied For Booking");
                        System.out.println("Check Your Booking Section in Your Account After few Hours");
                    }
                } else if (answer == 2) {
                    if (sports.isEmpty()) {
                        System.out.println("No Sports Available");
                    } else {
                        sc.nextLine();
                        System.out.print("Enter Type of Sport: ");
                        String type = sc.nextLine();
                        type = type.toLowerCase();
                        System.out.print("Enter Match: ");
                        String match = sc.nextLine();
                        match = match.toLowerCase();
                        System.out.print("Enter Date: ");
                        String date = sc.nextLine();
                        date = date.toLowerCase();
                        System.out.print("Enter Time: ");
                        String time = sc.nextLine();
                        time = time.toLowerCase();
                        System.out.print("Enter Seat Number: ");
                        double number = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Key of Sport: ");
                        String key = sc.nextLine();
                        Sports s = new Sports(key, a1.getName(), match, time, date, type, number);
                        sportBookings.add(s);
                        System.out.println("Successfully Applied For Booking");
                        System.out.println("We will contact you in few hours");
                    }
                } else if (answer == 3) {
                    if (events.isEmpty()) {
                        System.out.println("No Event Available");
                    } else {
                        sc.nextLine();
                        System.out.print("Enter Name of Singer: ");
                        String type = sc.nextLine();
                        type = type.toLowerCase();
                        System.out.print("Enter Place Name: ");
                        String place = sc.nextLine();
                        place = place.toLowerCase();
                        System.out.print("Enter Date: ");
                        String date = sc.nextLine();
                        date = date.toLowerCase();
                        System.out.print("Enter Time: ");
                        String time = sc.nextLine();
                        time = time.toLowerCase();
                        System.out.print("Enter Seat Number: ");
                        double number = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Key of Event: ");
                        String key = sc.nextLine();
                        Event e = new Event(key, a1.getName(), type, place, date, time, number);
                        eventBookings.add(e);
                        System.out.println("Successfully Applied For Booking");
                        System.out.println("We will contact you in few hours");
                    }
                } else if (answer == 4) {
                    System.out.print("Enter Hotel Name: ");
                    String n = sc.nextLine();
                    n = n.toLowerCase();
                    System.out.print("Enter Date of Starting: ");
                    String date = sc.nextLine();
                    date = date.toLowerCase();
                    System.out.print("Enter date of Ending");
                    String dateEnd = sc.nextLine();
                    dateEnd = dateEnd.toLowerCase();
                    System.out.print("Enter Room Number: ");
                    double room = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Key of Hotel");
                    String key = sc.nextLine();
                    Hotel h = new Hotel(key, a1.getName(), n, room, date, dateEnd);
                    hotelBookings.add(h);
                    System.out.println("Successfully Applied For Booking");
                    System.out.println("We will contact you in few hours");
                } else {
                    System.out.println("Invalid Input");
                }
            }
        }

    }

    public void approveBookings() {

        //Approve Bookings (Only for System Managers)

        Scanner sc = new Scanner(System.in);
        String password = "1234booking";
        System.out.println("Enter Password to Approve Bookings because Password is required so no Customer can access it");
        System.out.print("Enter Password: ");
        String p = sc.nextLine();
        if (p.equals(password)) {
            System.out.println("1-Check Transportations Bookings");
            System.out.println("2-Check Sports Bookings");
            System.out.println("3-Check Hotels Bookings");
            System.out.println("4-Check Events Bookings");
            int choice = sc.nextInt();
            if (choice == 1) {
                if (transportationBookings.isEmpty()) {
                    System.out.println("No Application of Transportation Booking");
                } else {
                    Transportation t1 = null;
                    double seatNumber = 0;
                    Transportation t2 = transportationBookings.poll();
                    for (Transportation t : transportation) {
                        if (t2.getKey().equals(t.getKey()) && t2.getType().equals(t.getType()) && t2.getDate().equals(t.getDate()) && t2.getTime().equals(t.getTime()) && t2.getSource().equals(t.getSource()) && t2.getDestination().equals(t.getDestination())) {
                            t1 = t;
                            for (int i = 0; i < transportationSeats.get(t1).size(); i++) {
                                if (t2.getSeatNumber() == transportationSeats.get(t1).get(i)) {
                                    seatNumber = transportationSeats.get(t1).get(i);
                                    transportationSeats.get(t1).remove(i);
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    Account a1 = null;
                    for (Account a : accounts) {
                        if (t2.getName().equals(a.getName())) {
                            a1 = a;
                            break;
                        }
                    }
                    customerBookings.putIfAbsent(a1, new LinkedList<>());
                    if (t1 == null) {
                        String Message = "Wrong Information About Transportation";
                        Booking b = new Booking(t2.getKey(), t2.getName(), t2.getDate(), t2.getTime(), t2.getType(), t2.getSource(), t2.getDestination(), seatNumber, "Rejected", Message);
                        customerBookings.get(a1).add(b);
                        System.out.println("Done");
                    } else if (seatNumber == 0) {
                        String Message = "Seat Number Has Taken";
                        Booking b = new Booking(t2.getKey(), t2.getName(), t2.getDate(), t2.getTime(), t2.getType(), t2.getSource(), t2.getDestination(), seatNumber, "Rejected", Message);
                        customerBookings.get(a1).add(b);
                        System.out.println("Done");
                    } else {
                        Booking b = new Booking(t2.getKey(), t2.getName(), t2.getDate(), t2.getTime(), t2.getType(), t2.getSource(), t2.getDestination(), seatNumber, "Approved", "Your Application Has Approved");
                        customerBookings.get(a1).add(b);
                        t1.cutSeats();
                        ApprovedBookings.add(b);
                        System.out.println("Done");
                    }
                }
            } else if (choice == 2) {
                if (sportBookings.isEmpty()) {
                    System.out.println("No Application of Sport Booking");
                } else {
                    Sports s1 = null;
                    double seatNumber = 0;
                    Sports s2 = sportBookings.poll();
                    for (Sports s : sports) {
                        if (s2.getKey().equals(s.getKey()) && s2.getSport().equals(s.getSport()) && s2.getDate().equals(s.getDate()) && s2.getTime().equals(s.getTime()) && s2.getMatch().equals(s.getMatch())) {
                            s1 = s;
                            for (int i = 0; i < sportsSeats.get(s1).size(); i++) {
                                if (s2.getSeatNumber() == sportsSeats.get(s1).get(i)) {
                                    seatNumber = sportsSeats.get(s1).get(i);
                                    sportsSeats.get(s1).remove(i);
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    Account a1 = null;
                    for (Account a : accounts) {
                        if (s2.getName().equals(a.getName())) {
                            a1 = a;
                            break;
                        }
                    }
                    customerBookings.putIfAbsent(a1, new LinkedList<>());
                    if (s1 == null) {
                        String Message = "Wrong Information About Sport";
                        Booking b = new Booking(s2.getKey(), s2.getName(), s2.getDate(), s2.getTime(), s2.getSport(), s2.getMatch(), "null", s2.getSeatNumber(), "Rejected", Message);
                        customerBookings.get(a1).add(b);
                        System.out.println("Done");
                    } else if (seatNumber == 0) {
                        String Message = "Seat Number Has Taken";
                        Booking b = new Booking(s2.getKey(), s2.getName(), s2.getDate(), s2.getTime(), s2.getSport(), s2.getMatch(), "null", s2.getSeatNumber(), "Rejected", Message);
                        customerBookings.get(a1).add(b);
                        System.out.println("Done");
                    } else {
                        Booking b = new Booking(s2.getKey(), s2.getName(), s2.getDate(), s2.getTime(), s2.getSport(), s2.getMatch(), "null", s2.getSeatNumber(), "Approved", "Your Application Has Approved");
                        customerBookings.get(a1).add(b);
                        s1.cutSeats();
                        ApprovedBookings.add(b);
                        System.out.println("Done");
                    }
                }
            } else if (choice == 3) {
                if (eventBookings.isEmpty()) {
                    System.out.println("No Application of Event Booking");
                } else {
                    Event e1 = null;
                    double seatNumber = 0;
                    Event e2 = eventBookings.poll();
                    for (Event e : events) {
                        if (e2.getKey().equals(e.getKey()) && e2.getSinger().equals(e.getSinger()) && e2.getDate().equals(e.getDate()) && e2.getTime().equals(e.getTime()) && e2.getPlace().equals(e.getPlace())) {
                            e1 = e;
                            for (int i = 0; i < eventSeats.get(e1).size(); i++) {
                                if (e2.getSeatNumber() == eventSeats.get(e1).get(i)) {
                                    seatNumber = eventSeats.get(e1).get(i);
                                    eventSeats.get(e1).remove(i);
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    Account a1 = null;
                    for (Account a : accounts) {
                        if (e2.getName().equals(a.getName())) {
                            a1 = a;
                            break;
                        }
                    }
                    customerBookings.putIfAbsent(a1, new LinkedList<>());
                    if (e1 == null) {
                        String Message = "Wrong Information About Event";
                        Booking b = new Booking(e2.getKey(), e2.getName(), e2.getDate(), e2.getTime(), e2.getSinger(), e2.getPlace(), "null", e2.getSeatNumber(), "Rejected", Message);
                        customerBookings.get(a1).add(b);
                        System.out.println("Done");
                    } else if (seatNumber == 0) {
                        String Message = "Seat Number Has Taken";
                        Booking b = new Booking(e2.getKey(), e2.getName(), e2.getDate(), e2.getTime(), e2.getSinger(), e2.getPlace(), "null", e2.getSeatNumber(), "Rejected", Message);
                        customerBookings.get(a1).add(b);
                        System.out.println("Done");
                    } else {
                        Booking b = new Booking(e2.getKey(), e2.getName(), e2.getDate(), e2.getTime(), e2.getSinger(), e2.getPlace(), "null", e2.getSeatNumber(), "Approved", "Your Application Has Approved");
                        customerBookings.get(a1).add(b);
                        ApprovedBookings.add(b);
                        e1.cutSeats();
                        System.out.println("Done");
                    }
                }
            } else if (choice == 4) {
                if (hotelBookings.isEmpty()) {
                    System.out.println("No Application of Hotel Booking");
                } else {
                    Hotel h1 = null;
                    double seatNumber = 0;
                    Hotel h2 = hotelBookings.poll();
                    for (Hotel h : hotels) {
                        if (h2.getKey().equals(h.getKey()) && h2.getHotel().equals(h.getHotel())) {
                            h1 = h;
                            for (int i = 0; i < hotelSeats.get(h1).size(); i++) {
                                if (h2.getRoomNumber() == hotelSeats.get(h1).get(i)) {
                                    seatNumber = hotelSeats.get(h1).get(i);
                                    hotelSeats.get(h1).remove(i);
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    Account a1 = null;
                    for (Account a : accounts) {
                        if (h2.getName().equals(a.getName())) {
                            a1 = a;
                            break;
                        }
                    }
                    if (h1 == null) {
                        String Message = "Wrong Information About Hotel";
                        Booking b = new Booking(h2.getKey(), h2.getName(), h2.getStarting(), h2.getStarting(), h2.getHotel(), h2.getStarting(), h2.getEnding(), h2.getRoomNumber(), "Rejected", Message);
                        customerBookings.get(a1).add(b);
                        System.out.println("Done");
                    } else if (seatNumber == 0) {
                        String Message = "Seat Number Has Taken";
                        Booking b = new Booking(h2.getKey(), h2.getName(), h2.getStarting(), h2.getStarting(), h2.getHotel(), h2.getStarting(), "null", h2.getRoomNumber(), "Rejected", Message);
                        customerBookings.get(a1).add(b);
                        System.out.println("Done");
                    } else {
                        customerBookings.putIfAbsent(a1, new LinkedList<>());
                        Booking b = new Booking(h2.getKey(), h2.getName(), h2.getStarting(), h2.getStarting(), h2.getHotel(), h2.getStarting(), h2.getEnding(), h2.getRoomNumber(), "Approved", "Your Application Has Approved");
                        customerBookings.get(a1).add(b);
                        h1.cutRooms();
                        ApprovedBookings.add(b);
                        System.out.println("Done");
                    }
                }
            } else {
                System.out.println("Invalid Input");
            }
        }

    }

    public void viewAllReservations() {

        //View All Reservations

        Scanner sc = new Scanner(System.in);
        System.out.println("1-Check Transportations List");
        System.out.println("2-Check Sports List");
        System.out.println("3-Check Events List");
        System.out.println("4-Check Hotels List");
        int choice = sc.nextInt();
        if (choice == 1) {
            if (transportation.isEmpty()) {
                System.out.println("No Transportation is Available");
            } else {
                for (Transportation t : transportation) {
                    System.out.println(t);
                }
            }
        } else if (choice == 2) {
            if (sports.isEmpty()) {
                System.out.println("No Sport is Available");
            } else {
                for (Sports s : sports) {
                    System.out.println(s);
                }
            }
        } else if (choice == 3) {
            if (events.isEmpty()) {
                System.out.println("No Event is Available");
            } else {
                for (Event e : events) {
                    System.out.println(e);
                }
            }
        } else if (choice == 4) {
            if (hotels.isEmpty()) {
                System.out.println("No Hotel is Available");
            } else {
                for (Hotel h : hotels) {
                    System.out.println(h);
                }
            }
        }

    }

    public void viewCustomerBookingList() {

        //View Customer Booking List

        Scanner sc = new Scanner(System.in);
        if (accounts.isEmpty()) {
            System.out.println("No Account Added yet");
        } else {
            Account a1 = null;
            System.out.print("Enter Email: ");
            String email = sc.nextLine();
            System.out.print("Enter Password: ");
            double p = sc.nextInt();
            for (Account a : accounts) {
                if (email.equals(a.getEMail()) && p == a.getPassword()) {
                    a1 = a;
                    break;
                }
            }
            if (a1 == null) {
                System.out.println("Wrong Email or Wrong Password");
            } else {
                for (Booking b : customerBookings.get(a1)) {
                    System.out.println(b);
                }
            }
        }

    }

    public void setSeats() {

        //Set Seats Specific Reservation (Only for System Managers)

        Scanner sc = new Scanner(System.in);
        String password = "1234set";
        System.out.print("Enter Password to Set Seats: ");
        String p = sc.nextLine();
        if (!p.equals(password)) {
            System.out.println("Wrong Password");
        } else {
            System.out.println("1-Set Transportation Seats");
            System.out.println("2-Set Sport Seats");
            System.out.println("3-Set Event Seats");
            System.out.println("4-Set Hotel Rooms");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                Transportation t = null;
                System.out.print("Enter Key of Transportation: ");
                String key = sc.nextLine();
                for (Transportation t1 : transportation) {
                    if (key.equals(t1.getKey())) {
                        t = t1;
                        break;
                    }
                }
                if (t == null) {
                    System.out.println("Invalid Key");
                } else {
                    transportationSeats.putIfAbsent(t, new LinkedList<>());
                    for (double i = 1; i < t.getAvailable_Seats() + 1; i++) {
                        transportationSeats.get(t).add(i);
                    }
                    System.out.println("Seats Set Successfully");
                }
            } else if (choice == 2) {
                Sports s1 = null;
                System.out.print("Enter Key of Sport: ");
                String key = sc.nextLine();
                for (Sports s : sports) {
                    if (key.equals(s.getKey())) {
                        s1 = s;
                        break;
                    }
                }
                if (s1 == null) {
                    System.out.println("Invalid Key");
                } else {
                    sportsSeats.putIfAbsent(s1, new LinkedList<>());
                    for (double i = 1; i < s1.getAvailable_Seats() + 1; i++) {
                        sportsSeats.get(s1).add(i);
                    }
                    System.out.println("Seats Set Successfully");
                }
            } else if (choice == 3) {
                Event e1 = null;
                System.out.print("Enter Key of Sport: ");
                String key = sc.nextLine();
                for (Event e : events) {
                    if (key.equals(e.getKey())) {
                        e1 = e;
                        break;
                    }
                }
                if (e1 == null) {
                    System.out.println("Invalid Key");
                } else {
                    eventSeats.putIfAbsent(e1, new LinkedList<>());
                    for (double i = 1; i < e1.getAvailable_Seats() + 1; i++) {
                        eventSeats.get(e1).add(i);
                    }
                    System.out.println("Seats Set Successfully");
                }
            } else if (choice == 4) {
                Hotel h1 = null;
                System.out.print("Enter Key of Hotel: ");
                String key = sc.nextLine();
                for (Hotel h : hotels) {
                    if (key.equals(h.getKey())) {
                        h1 = h;
                        break;
                    }
                }
                if (h1 == null) {
                    System.out.println("Invalid Key");
                } else {
                    hotelSeats.putIfAbsent(h1, new LinkedList<>());
                    for (double i = 1; i < h1.getAvailable_Rooms() + 1; i++) {
                        hotelSeats.get(h1).add(i);
                    }
                    System.out.println("Rooms Set Successfully");
                }
            } else {
                System.out.println("Invalid Input");
            }
        }

    }

    public void viewApprovedBookings() {

        //View Approved Bookings List

        if (ApprovedBookings.isEmpty()) {
            System.out.println("No Booking Has Been Approved Yet");
        } else {
            for (Booking b : ApprovedBookings) {
                System.out.println(b);
            }
        }

    }

    public void findDistanceBetweenTwoPlaces() {

        //Find Distance Between Two Specific Locations

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name of First Place:");
        String s = sc.nextLine();
        System.out.print("Enter Name of Second Place: ");
        String d = sc.nextLine();
        if (!adjacency.containsKey(s) || !adjacency.containsKey(d)) {
            System.out.println("No path exist from " + s + " to " + d);
            return;
        }
        for (Edge edge : adjacency.get(s)) {
            if (edge.destination.equals(d)) {
                System.out.println("Distance From " + s + " to " + d + " is " + edge.time + " hours");
                return;
            }
        }

    }

    public void cancelBooking() {

        //Cancel Booking

        Scanner sc = new Scanner(System.in);
        Account a1 = null;
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Password: ");
        double p = sc.nextInt();
        for (Account a : accounts) {
            if (email.equals(a.getEMail()) && p == a.getPassword()) {
                a1 = a;
                break;
            }
        }
        if (a1 == null) {
            System.out.println("Wrong Email or Wrong Password");
        } else {
            System.out.println("Enter Type of Booking you want to Cancel");
            System.out.println("1-Cancel Transportation Booking");
            System.out.println("2-Cancel Sport Booking");
            System.out.println("3-Cancel Event Booking");
            System.out.println("4-Cancel Hotel Booking");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                Transportation t1 = null;
                System.out.print("Enter Key of Booking: ");
                String key = sc.nextLine();
                Booking b1 = null;
                for (Booking b : customerBookings.get(a1)) {
                    if (key.equals(b.getKey())) {
                        b1 = b;
                        customerBookings.get(a1).remove(b1);
                        System.out.println("Removed Successfully");
                        break;
                    }
                }
                Booking b2 = null;
                for (Booking b : ApprovedBookings) {
                    if (key.equals(b.getKey())) {
                        b2 = b;
                        ApprovedBookings.remove(b);
                        break;
                    }
                }
                if (b1 == null) {
                    System.out.println("No Booking Found with Provided Key");
                } else {
                    for (Transportation t : transportation) {
                        if (key.equals(t.getKey())) {
                            t1 = t;
                            break;
                        }
                    }
                    transportationSeats.get(t1).add(b1.getSeat_Room_Number());
                }
            } else if (choice == 2) {
                Sports s1 = null;
                System.out.print("Enter Key of Booking: ");
                String key = sc.nextLine();
                Booking b1 = null;
                for (Booking b : customerBookings.get(a1)) {
                    if (key.equals(b.getKey())) {
                        b1 = b;
                        customerBookings.get(a1).remove(b1);
                        System.out.println("Removed Successfully");
                        break;
                    }
                }
                Booking b2 = null;
                for (Booking b : ApprovedBookings) {
                    if (key.equals(b.getKey())) {
                        b2 = b;
                        ApprovedBookings.remove(b);
                        break;
                    }
                }
                if (b1 == null) {
                    System.out.println("No Booking Found with Provided Key");
                } else {
                    for (Sports s : sports) {
                        if (b1.getKey().equals(s.getKey())) {
                            s1 = s;
                            break;
                        }
                    }
                    sportsSeats.get(s1).add(b1.getSeat_Room_Number());
                }
            } else if (choice == 3) {
                Event e1 = null;
                System.out.print("Enter Key of Booking: ");
                String key = sc.nextLine();
                Booking b1 = null;
                for (Booking b : customerBookings.get(a1)) {
                    if (key.equals(b.getKey())) {
                        b1 = b;
                        customerBookings.get(a1).remove(b1);
                        System.out.println("Removed Successfully");
                        break;
                    }
                }
                Booking b2 = null;
                for (Booking b : ApprovedBookings) {
                    if (key.equals(b.getKey())) {
                        b2 = b;
                        ApprovedBookings.remove(b);
                        break;
                    }
                }
                if (b1 == null) {
                    System.out.println("No Booking Found with Provided Key");
                } else {
                    for (Event e : events) {
                        if (b1.getKey().equals(e.getKey())) {
                            e1 = e;
                            break;
                        }
                    }
                    eventSeats.get(e1).add(b1.getSeat_Room_Number());
                }
            } else if (choice == 4) {
                Hotel h1 = null;
                System.out.print("Enter Key of Booking: ");
                String key = sc.nextLine();
                Booking b1 = null;
                for (Booking b : customerBookings.get(a1)) {
                    if (key.equals(b.getKey())) {
                        b1 = b;
                        customerBookings.get(a1).remove(b1);
                        System.out.println("Removed Successfully");
                        break;
                    }
                }
                Booking b2 = null;
                for (Booking b : ApprovedBookings) {
                    if (key.equals(b.getKey())) {
                        b2 = b;
                        ApprovedBookings.remove(b);
                        break;
                    }
                }
                if (b1 == null) {
                    System.out.println("No Booking Found with Provided Key");
                } else {
                    for (Hotel h : hotels) {
                        if (b1.getKey().equals(h.getKey())) {
                            h1 = h;
                            break;
                        }
                    }
                    hotelSeats.get(h1).add(b1.getSeat_Room_Number());
                }
            } else {
                System.out.println("Wrong Input");
            }
        }
    }

    public void searchTransportation() {

        //Search Specific Transportation

        Scanner sc = new Scanner(System.in);
        Account a1 = null;
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Password: ");
        double p = sc.nextInt();
        for (Account a : accounts) {
            if (email.equals(a.getEMail()) && p == a.getPassword()) {
                a1 = a;
                break;
            }
        }
        if (a1 == null) {
            System.out.println("Wrong Email or Wrong Password");
        } else {
            sc.nextLine();
            System.out.println("Enter Transportation You Want to Search");
            System.out.print("Enter Transportation Type: ");
            String type = sc.nextLine();
            System.out.print("From: ");
            String s = sc.nextLine();
            System.out.print("To: ");
            String d = sc.nextLine();
            Transportation t1 = null;
            for (Transportation t : transportation) {
                if (type.equals(t.getType()) && s.equals(t.getSource()) && d.equals(t.getDestination())) {
                    t1 = t;
                    System.out.println(t);
                    break;
                }
            }
            if (t1 == null) {
                System.out.println("No Transportation Available of Provided Information");
            }
        }
    }

}

