public class Meal {
    private Burger burger;
    private Item drink;
    private Item side;

    public Meal(){
        this("regular", "coke", "fries");
    }

    public Meal(String burgerType, String drinkType, String sideType) {
        if(burgerType.equalsIgnoreCase("deluxe")){
            this.burger = new DeluxeBurger(burgerType, 8.5);
        } else{
            this.burger = new Burger(burgerType,4.0);
        }
        this.drink = new Item("drink", drinkType, 1.00);
        this.side = new Item("side", sideType, 1.50);
    }

    public double getTotalPrice(){
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemizedList(){
        burger.printItem();
        drink.printItem();
        side.printItem();

        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String... extras){
        if(burger instanceof DeluxeBurger db){
            db.addToppings(extras);
        } else {
            burger.addToppings(extras);
        }
    }

    public void setDrinkSize(String size){
        drink.setSize(size);
    }
}