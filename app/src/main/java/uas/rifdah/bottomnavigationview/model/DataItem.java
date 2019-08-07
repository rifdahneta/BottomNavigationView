package uas.rifdah.bottomnavigationview.model;

public class DataItem {

    String title;
    String description;
    int image;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public DataItem(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }



}
