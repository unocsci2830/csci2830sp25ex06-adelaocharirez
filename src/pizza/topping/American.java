package pizza.topping;

public class American extends CheeseTopping {
    @Override
    public String toString() { return "American"; }

    @Override
    public String toNiceString() { return "Mild and creamy American cheese."; }

    @Override
    public Double getPrice() { return 2.50; }
}
