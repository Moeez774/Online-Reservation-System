package Methods;


public class Hotel {

    public Hotel(String key,String hotel, double available_Rooms, double pricePerNight,double Total_Rooms) {
        this.key = key;
        this.Hotel = hotel;
        this.Total_rooms = Total_Rooms;
        this.Available_Rooms = available_Rooms;
        this.PricePerNight = pricePerNight;
    }

    public Hotel(String key,String name,String hotel,double roomNumber,String Starting,String Ending){
        this.key = key;
        Hotel = hotel;
        this.name = name;
        this.roomNumber = roomNumber;
    }

    public double getAvailable_rooms() {
        return Available_rooms;
    }

    public void setAvailable_rooms(double available_rooms) {
        Available_rooms = available_rooms;
    }



    private double Available_rooms;
    private String Hotel;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "Hotel='" + Hotel + '\'' +
                ", key='" + key + '\'' +
                ", Total_Rooms='" + Total_rooms +
                ", Available_Rooms=" + Available_Rooms +
                ", PricePerNight=" + PricePerNight +
                '}';
    }

    private String key;

    public String getStarting() {
        return Starting;
    }

    public void setStarting(String starting) {
        Starting = starting;
    }

    public String getEnding() {
        return Ending;
    }

    public void setEnding(String ending) {
        Ending = ending;
    }

    private String Starting;
    private String Ending;

    public double getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(double roomNumber) {
        this.roomNumber = roomNumber;
    }

    private double roomNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getHotel() {
        return Hotel;
    }

    public void setHotel(String hotel) {
        Hotel = hotel;
    }

    public double getAvailable_Rooms() {
        return Available_Rooms;
    }

    public void setAvailable_Rooms(double available_Rooms) {
        Available_Rooms = available_Rooms;
    }

    public double getPricePerNight() {
        return PricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        PricePerNight = pricePerNight;
    }

    private double Available_Rooms;
    private double PricePerNight;

    public double getTotal_rooms() {
        return Total_rooms;
    }

    public void setTotal_rooms(double total_rooms) {
        Total_rooms = total_rooms;
    }

    private double Total_rooms;
    public void cutRooms(){
        this.Available_Rooms = this.Available_Rooms - 1;
    }
}