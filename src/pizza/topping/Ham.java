package pizza.topping;

public class Ham extends MeatTopping {
    @Override
    public String toString() { return "pizza.topping.Ham"; }

    @Override
    public String toNiceString() { return "Sweet and smoky ham."; }
    public Double getPrice(){return 2.25;}
}
