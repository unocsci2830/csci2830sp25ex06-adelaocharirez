package pizza.topping;

public class Beef extends MeatTopping {
    @Override
    public String toString() { return "pizza.topping.Beef"; }

    @Override
    public String toNiceString() { return "Seasoned ground beef."; }
    public Double getPrice(){return 2.25;}
}
