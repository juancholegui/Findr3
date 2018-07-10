package infinitum.com.findr;

public class Recommendations {

    private int recImage;
    private String recBarName;
    private String recBarLocation;
    private String recBarPrice;

    public Recommendations(){

    }

    public Recommendations(int recImage, String recBarName, String recBarLocation, String recBarPrice) {
        this.recImage = recImage;
        this.recBarName = recBarName;
        this.recBarLocation = recBarLocation;
        this.recBarPrice = recBarPrice;
    }

    public int getRecImage() {
        return recImage;
    }

    public void setRecImage(int recImage) {
        this.recImage = recImage;
    }

    public String getRecBarName() {
        return recBarName;
    }

    public void setRecBarName(String recBarName) {
        this.recBarName = recBarName;
    }

    public String getRecBarLocation() {
        return recBarLocation;
    }

    public void setRecBarLocation(String recBarLocation) {
        this.recBarLocation = recBarLocation;
    }

    public String getRecBarPrice() {
        return recBarPrice;
    }

    public void setRecBarPrice(String recBarPrice) {
        this.recBarPrice = recBarPrice;
    }
}

