package restaurant;

import java.util.Date;

public class MenuItem {
    private Double price;
    private String description;
    private String category;
    private Boolean isNew;
    private Date createdOn;

    public MenuItem(String name, Double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
    }

    public boolean getIsNew() {
        return isNew;
    }

    private void setPrice(double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }
    public String getCategory() {
        return category;
    }
    private void setCategory(String category) {
        this.category = category;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setNew(Boolean aNew) {
        isNew = aNew;
    }
    public Boolean getNew() {
        return isNew;
    }
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
