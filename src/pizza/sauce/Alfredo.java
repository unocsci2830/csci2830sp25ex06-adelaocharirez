package pizza.sauce;

public class Alfredo extends PizzaSauce {
    @Override
    public String toString() { return "pizza.sauce.Alfredo Sauce"; }

    @Override
    public String toNiceString() { return "Rich and creamy Alfredo sauce."; }

    @Override
    public Double getPrice(){ return 0.25; }
}
