package Methods;


public class Booking {

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    private String Customer_Name;
    private String date;

    private String time;
    private String BookingType;


    public String getApplication() {
        return Application;
    }

    public void setApplication(String application) {
        Application = application;
    }

    private String Application;

    public double getSeat_Room_Number() {
        return Seat_Room_Number;
    }

    public void setSeat_Room_Number(double seat_Room_Number) {
        Seat_Room_Number = seat_Room_Number;
    }

    private double Seat_Room_Number;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    private String Message;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "Customer_Name='" + Customer_Name + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", BookingType='" + BookingType + '\'' +
                ", Application='" + Application + '\'' +
                ", Seat_Room_Number=" + Seat_Room_Number +
                ", Message='" + Message + '\'' +
                ", key='" + key + '\'' +
                ", Starting='" + Starting + '\'' +
                ", Status='" + Status + '\'' +
                ", Ending='" + Ending + '\'' +
                '}';
    }

    private String key;

    public Booking(String key,String Customer_Name,String date, String time, String bookingType, String starting, String ending,double Seat_Room_Number,String Application,String Message) {
        this.key = key;
        this.Customer_Name = Customer_Name;
        this.Message = Message;
        this.date = date;
        this.time = time;
        this.Seat_Room_Number = Seat_Room_Number;
        this.BookingType = bookingType;
        this.Starting = starting;
        this.Ending = ending;
        this.Application = Application;
        this.Status = "Pending";
    }

    private String Starting;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    private String Status;

    public String getEnding() {
        return Ending;
    }

    public void setEndingTime(String ending) {
        Ending = ending;
    }

    public String getStarting() {
        return Starting;
    }

    public void setStarting(String starting) {
        Starting = starting;
    }

    public String getBookingType() {
        return BookingType;
    }

    public void setBookingType(String bookingType) {
        BookingType = bookingType;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private String Ending;

}