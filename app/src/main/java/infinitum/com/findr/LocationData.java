package infinitum.com.findr;

public class LocationData {

    public double latitude;
    public double longitud;
    public String barName;

    public LocationData(){

    }

    public LocationData(double latitude, double longitud, String barName) {
        this.latitude = latitude;
        this.longitud = longitud;
        this.barName = barName;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getBarName() {
        return barName;
    }

    public void setBarName(String barName) {
        this.barName = barName;
    }
}
