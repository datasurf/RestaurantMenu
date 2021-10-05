package studios.restaurantmenu;
import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {
        MenuItems firstItem = new MenuItems(4.99, "Pizza", "main", true);
        MenuItems secondItem = new MenuItems(6.99, "Cheesesteak", "main", false);
        ArrayList<MenuItems> whatToEat = new ArrayList<>();
        Menu restaurantMenu = new Menu(whatToEat,"9/20/2021");
        restaurantMenu.addItem(firstItem);
        restaurantMenu.addItem(secondItem);
//        restaurantMenu.printAll();
        //restaurantMenu.printSingle("Pizza");
        restaurantMenu.removeItem(secondItem);
        restaurantMenu.printAll();

    }
}
