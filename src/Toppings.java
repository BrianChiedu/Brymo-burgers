public enum Toppings {
    BACON, CHEESE, PEPPERONI, AVOCADO, TOMATO, HALLOUMI, LETTUCE;

    public double getPrice(){
        return switch (this){
            case BACON -> 1.5;
            case CHEESE -> 0.5;
            case PEPPERONI -> 1.0;
            case AVOCADO -> 2.0;
            case TOMATO -> 0.5;
            case HALLOUMI -> 2.0;
            case LETTUCE -> 1.5;
            default -> 0.0;
        };
    }
}
