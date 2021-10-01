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
        private Date createdOn;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Boolean getNew() {
        return isNew;
    }

    public Date getCreatedOn() {
        return createdOn;
    }
}
