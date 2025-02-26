package pizza.topping;

public class Mozzarella extends CheeseTopping {
    @Override
    public String toString() { return "Mozzarella"; }

    @Override
    public String toNiceString() { return "Creamy and stretchy mozzarella cheese."; }

    @Override
    public Double getPrice() { return 1.50; }  // Override if needed
}
