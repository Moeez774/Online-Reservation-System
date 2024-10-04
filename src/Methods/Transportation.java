package Methods;

public class Transportation {

    private String Type;
    private String Date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Transportation(String key,String name,String type, String date, String time, String from, String to,double seatNumber) {
        this.Key = key;
        this.name = name;
        Type = type;
        Date = date;
        Time = time;
        From = from;
        To = to;
        this.seatNumber = seatNumber;
    }

    private String Time;

    public double getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(double seatNumber) {
        this.seatNumber = seatNumber;
    }

    private double seatNumber;
    private String From;

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    private String Key;

    public Transportation(String key,double Total_Seats,String type, String date, String time, String From, double priceOfTicket, String To, double available_Seats) {
        this.Key = key;
        this.Type = type;
        this.Total_Seats = Total_Seats;
        this.Date = date;
        this.Time = time;
        this.From = From;
        this.PriceOfTicket = priceOfTicket;
        this.To = To;
        this.Available_Seats = available_Seats;
    }

    private String To;

    private double PriceOfTicket;

    public double getAvailable_Seats() {
        return Available_Seats;
    }

    public void setAvailable_Seats(double available_Seats) {
        Available_Seats = available_Seats;
    }

    public double getPriceOfTicket() {
        return PriceOfTicket;
    }

    public void setPriceOfTicket(double priceOfTicket) {
        PriceOfTicket = priceOfTicket;
    }

    public String getDestination() {
        return To;
    }

    public void setDestination(String destination) {
        To = destination;
    }

    public String getSource() {
        return From;
    }

    public void setSource(String source) {
        From = source;
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

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    private double Available_Seats;
    public double getTotal_Seats() {
        return Total_Seats;
    }

    public void setTotal_Seats(double total_Seats) {
        Total_Seats = total_Seats;
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "Type='" + Type + '\'' +
                ", Date='" + Date + '\'' +
                ", Time='" + Time + '\'' +
                ", From='" + From + '\'' +
                ", Key='" + Key + '\'' +
                ", To='" + To + '\'' +
                ", PriceOfTicket=" + PriceOfTicket +
                ", Available_Seats=" + Available_Seats +
                ", Total_Seats=" + Total_Seats +
                '}';
    }

    private double Total_Seats;

    public void cutSeats(){
        this.Available_Seats = Available_Seats  - 1;
    }
}