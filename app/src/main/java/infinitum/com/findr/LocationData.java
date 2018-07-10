package infinitum.com.findr;

public class LocationData {

    public double lat;
    public double lng;
    public String bar_name;

    public LocationData(){

    }

    public LocationData(double lat, double lng, String bar_name) {
        this.lat = lat;
        this.lng = lng;
        this.bar_name = bar_name;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getBar_name() {
        return bar_name;
    }

    public void setBar_name(String bar_name) {
        this.bar_name = bar_name;
    }
}
