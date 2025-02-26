package pizza.topping;

public class GreenPepper extends VeggieTopping {
    @Override
    public String toString() { return "Green Pepper"; }

    @Override
    public String toNiceString() { return "Crisp and slightly sweet green peppers."; }

    @Override
    public Double getPrice() { return 1.25; }
}
