package pizza.topping;

public abstract class VeggieTopping extends PizzaTopping {
    @Override
    public Double getPrice() {
        return 1.25;
    }
}
