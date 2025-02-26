package pizza.topping;

public class Asiago extends CheeseTopping {
    @Override
    public String toString() { return "Asiago"; }

    @Override
    public String toNiceString() { return "Sharp and nutty Asiago cheese."; }

    @Override
    public Double getPrice() { return 2.50; }
}
