package studios.restaurantmenu;

import java.util.Objects;

public class MenuItems {

        private double price;
        private String description;
        private String category;
        private boolean isNew;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItems menuItems = (MenuItems) o;
        return Double.compare(menuItems.price, price) == 0 && isNew == menuItems.isNew && Objects.equals(description, menuItems.description) && Objects.equals(category, menuItems.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category, isNew);
    }

    public MenuItems(double price, String description, String category, boolean isNew) {
            this.price = price;
            this.description = description;
            this.category = category;
            this.isNew = isNew;
        }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
