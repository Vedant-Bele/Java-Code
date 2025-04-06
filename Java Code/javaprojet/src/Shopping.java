import java.util.ArrayList;
import java.util.List;

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void printReceipt() {
        System.out.println("----- Receipt -----");
        for (Item item : items) {
            System.out.println(item.getName() + " - ₹" + item.getPrice());
        }
        System.out.println("Total: ₹" + calculateTotal());
        System.out.println("-------------------");
    }
}

public class Shopping {
    public static void main(String[] args) {
        // Create items with prices in Indian Rupees (INR)
        Item apple = new Item("Apple", 90.0); // ₹90
        Item milk = new Item("Milk", 50.0);   // ₹50
        Item bread = new Item("Bread", 40.0);  // ₹40

        // Create shopping cart and add items
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(apple);
        cart.addItem(milk);
        cart.addItem(bread);

        // Print receipt and total cost
        cart.printReceipt();
    }
}