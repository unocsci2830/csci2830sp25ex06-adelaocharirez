package pizza.topping;

public class Mushroom extends VeggieTopping {
    @Override
    public String toString() { return "Mushroom"; }

    @Override
    public String toNiceString() { return "Earthy and tender mushrooms."; }

    @Override
    public Double getPrice() { return 1.25; }
}
