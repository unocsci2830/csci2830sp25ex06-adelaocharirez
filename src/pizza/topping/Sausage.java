package pizza.topping;

public class Sausage extends MeatTopping {
    @Override
    public String toString() { return "pizza.topping.Sausage"; }

    @Override
    public String toNiceString() { return "Savory sausage crumbles."; }
    public Double getPrice(){return 1.25;}
}
