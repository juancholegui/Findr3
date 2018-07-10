package infinitum.com.findr;

public class GalleryBar {

    private String description;
    private int galleryImage;

    public GalleryBar() {

    }

    public GalleryBar(String description, int galleryImage) {
        this.description = description;
        this.galleryImage = galleryImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getGalleryImage() {
        return galleryImage;
    }

    public void setGalleryImage(int galleryImage) {
        this.galleryImage = galleryImage;
    }
}
