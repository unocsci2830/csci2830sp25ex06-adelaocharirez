package pizza.crust;

public class Thin extends PizzaCrust {
    public Thin(String ingredient) { super(ingredient); }

    @Override
    public String toString() { return "pizza.crust.Thin Crust"; }

    @Override
    public String checkIntegrity() { return ""; }

    @Override
    public Double getPrice(){ return 3.00; }
}
