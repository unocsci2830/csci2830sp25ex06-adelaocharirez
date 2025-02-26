package pizza.topping;

public class BlueCheese extends CheeseTopping {
    @Override
    public String toString() { return "Blue Cheese"; }

    @Override
    public String toNiceString() { return "Strong and tangy blue cheese."; }

    @Override
    public Double getPrice() { return 4.50; }
}
