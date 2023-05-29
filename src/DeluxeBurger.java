import java.util.ArrayList;

public class DeluxeBurger extends Burger{
    private ArrayList<Item> deluxeExtras;

    public DeluxeBurger(String name, double price) {
        super(name, price);
        deluxeExtras = new ArrayList<>();
    }


    public void addToppings(String... extras) {
        for (String extra:extras) {
            deluxeExtras.add(new Item("TOPPING", extra, 0));
        }
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        for (Item extra:deluxeExtras) {
            extra.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }
}
