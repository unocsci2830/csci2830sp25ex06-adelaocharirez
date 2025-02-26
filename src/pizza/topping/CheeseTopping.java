package pizza.topping;

public abstract class CheeseTopping extends PizzaTopping {
    @Override
    public Double getPrice() {
        return 2.00; // Default price for cheese toppings (can be overridden)
    }
}
