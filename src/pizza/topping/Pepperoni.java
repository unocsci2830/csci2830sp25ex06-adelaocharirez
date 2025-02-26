package pizza.topping;

public class Pepperoni extends MeatTopping {
    @Override
    public String toString() { return "pizza.topping.Pepperoni"; }

    @Override
    public String toNiceString() { return "Classic spicy pepperoni slices."; }
    public Double getPrice(){return 1.25;}
}
