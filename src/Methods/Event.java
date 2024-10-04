package Methods;

public class Event {

    private String Singer;
    private String Place;
    private String Date;

    public double getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(double seatNumber) {
        this.seatNumber = seatNumber;
    }

    private double seatNumber;

    public double getPrice_Of_Ticket() {
        return Price_Of_Ticket;
    }

    public void setPrice_Of_Ticket(double price_Of_Ticket) {
        Price_Of_Ticket = price_Of_Ticket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Event{" +
                "Singer='" + Singer + '\'' +
                ", Place='" + Place + '\'' +
                ", Date='" + Date + '\'' +
                ", key='" + key + '\'' +
                ", Price_Of_Ticket=" + Price_Of_Ticket +
                ", Time='" + Time + '\'' +
                ", Total_Seats='" + Total_Seats +
                ", Available_Seats=" + Available_Seats +
                '}';
    }

    private String key;

    private String name;
    public Event(String key,String name,String singer, String place, String date, String time,double seatNumber){
        this.key = key;
        this.name = name;
        Singer = singer;
        Place = place;
        Date = date;
        Time = time;
        this.seatNumber = seatNumber;
    }

    private double Price_Of_Ticket;

    public Event(String key,double priceOfTicket,double available_Seats, String date, String time, String place, String singer,double Total_seats) {
        this.key = key;
        this.Available_Seats = available_Seats;
        this.Date = date;
        this.Time = time;
        this.Place = place;
        this.Singer = singer;
        this.Total_Seats = Total_seats;
        this.Price_Of_Ticket = priceOfTicket;
    }

    private String Time;

    public double getTotal_Seats() {
        return Total_Seats;
    }

    public void setTotal_Seats(double total_Seats) {
        Total_Seats = total_Seats;
    }

    private double Total_Seats;

    public double getAvailable_Seats() {
        return Available_Seats;
    }

    public void setAvailable_Seats(double available_Seats) {
        Available_Seats = available_Seats;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getSinger() {
        return Singer;
    }

    public void setSinger(String singer) {
        Singer = singer;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    private double Available_Seats;
    public void cutSeats(){
        this.Available_Seats = Available_Seats  - 1;
    }
}