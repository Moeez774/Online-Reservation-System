package Methods;

import java.util.ArrayList;
import java.util.List;

public class Sports {

    private String Sport;
    private String Date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public double getPrice_Of_Ticket() {
        return Price_Of_Ticket;
    }

    public void setPrice_Of_ticket(double price_Of_Ticket) {
        Price_Of_Ticket = price_Of_Ticket;
    }

    private double Price_Of_Ticket;

    public double getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(double seatNumber) {
        this.seatNumber = seatNumber;
    }

    private double seatNumber;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    private String key;

    public Sports(String key,String name,String match, String time, String date, String sport,double seatNumber) {
        this.key = key;
        this.name = name;
        Match = match;
        Time = time;
        Date = date;
        Sport = sport;
        this.seatNumber = seatNumber;
    }

    private String Time;
    public double getTotal_Seats() {
        return Total_Seats;
    }

    public void setTotal_Seats(double total_Seats) {
        Total_Seats = total_Seats;
    }

    @Override
    public String toString() {
        return "Sports{" +
                "Sport='" + Sport + '\'' +
                ", Date='" + Date + '\'' +
                ", Price_Of_Ticket=" + Price_Of_Ticket +
                ", key='" + key + '\'' +
                ", Time='" + Time + '\'' +
                ", Total_Seats=" + Total_Seats +
                ", Available_Seats=" + Available_Seats +
                ", Match='" + Match + '\'' +
                '}';
    }

    private double Total_Seats;

    public Sports(String key,double Total_Seats,String sport, String match, double available_Seats, String time, String date,double Price_Of_Ticket){
        this.key = key;
        this.Sport = sport;
        this.Total_Seats = Total_Seats;
        this.Match = match;
        this.Available_Seats = available_Seats;
        this.Time = time;
        this.Date = date;
        this.Price_Of_Ticket = Price_Of_Ticket;
    }

    private double Available_Seats;

    public String getMatch() {
        return Match;
    }

    public void setMatch(String match) {
        Match = match;
    }

    public String getSport() {
        return Sport;
    }

    public void setSport(String sport) {
        Sport = sport;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public double getAvailable_Seats() {
        return Available_Seats;
    }

    public void setAvailable_Seats(double available_Seats) {
        Available_Seats = available_Seats;
    }

    private String Match;
    public void cutSeats(){
        this.Available_Seats = Available_Seats  - 1;
    }
}