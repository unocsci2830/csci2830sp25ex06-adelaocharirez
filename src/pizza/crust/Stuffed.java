package pizza.crust;

public class Stuffed extends PizzaCrust {
    public Stuffed(String ingredient) { super(ingredient); }

    @Override
    public String toString() { return "pizza.crust.Stuffed Crust"; }

    @Override
    public String checkIntegrity() { return ""; }

    @Override
    public Double getPrice(){ return 4.50; }
}
