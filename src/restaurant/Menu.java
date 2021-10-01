package restaurant;

import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Menu {
    private Date createdOn;
    private Boolean newItem;
    private String[] categories = {"appetizer", "main", "desert"};
    private HashMap<String, ArrayList<MenuItem>> items;
    private Double price;


    public Date getCreatedOn() {
        return createdOn;
    }

    public Boolean getNewItem() {
        return newItem;
    }

    public String[] getCategories() {
        return categories;
    }

    public HashMap<String, ArrayList<MenuItem>> getItems() {
        return items;
    }

    public Double getPrice() {
        return price;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public void setNewItem(Boolean newItem) {
        this.newItem = newItem;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public void setItems(HashMap<String, ArrayList<MenuItem>> items) {
        this.items = items;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
