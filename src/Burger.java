import java.util.ArrayList;

public class Burger extends Item {
    private ArrayList<Item> addOns;

    public Burger(String name, double price) {
        super("Burger", name, price);
        this.addOns = new ArrayList<>();
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    @Override
    public double getAdjustedPrice() {
        //Calculating the total adjustedPrice for extras
        double totalExtraPrice = 0;
        for (Item extra:addOns) {
            totalExtraPrice += extra.getAdjustedPrice();
        }
        return getBasePrice()  + totalExtraPrice;
    }

    public double getExtraPrice(String toppingName) {
        return Toppings.valueOf(toppingName.toUpperCase()).getPrice();
    }

    public void addToppings(String... extras) {
        for (String extra:extras) {
            addOns.add(new Item("TOPPING", extra, getExtraPrice(extra)));
        }
    }

    public void printItemizedList() {
        printItem("BASE BURGER", getBasePrice());
        for (Item extra:addOns) {
            extra.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
