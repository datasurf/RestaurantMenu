package studios.restaurantmenu;
import java.util.ArrayList;

public class Menu {
    private String lastUpdated;
    private ArrayList<MenuItems> items;

    public Menu(ArrayList<MenuItems> items, String lastUpdated) {
        this.items = items;
        this.lastUpdated = lastUpdated;
    }

    public void addItem(MenuItems food) {
        items.add(food);
    }

    public void removeItem(MenuItems food) {
        int itemToRemove = items.indexOf(food);
        items.remove(itemToRemove);
    }

    public void printAll() {
        for (MenuItems item : items) {
            System.out.println("Price: " + item.getPrice() + "\nDescription: " + item.getDescription() + "\nNew: " + item.isNew() + "\n");
        }
    }

    public void printSingle(String singleItem) {
        for (MenuItems item : items) {
            if (item.getDescription().equals(singleItem)) {
                System.out.println("Price: " + item.getPrice() + "\nDescription: " + item.getDescription() + "\nNew: " + item.isNew() + "\n");
            }
        }
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItems> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItems> items) {
        this.items = items;
    }
}
