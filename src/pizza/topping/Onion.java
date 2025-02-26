package pizza.topping;

public class Onion extends VeggieTopping {
    @Override
    public String toString() { return "Onion"; }

    @Override
    public String toNiceString() { return "Sharp and flavorful onion slices."; }

    @Override
    public Double getPrice() { return 1.25; }
}
