package pizza.sauce;

public class Tomato extends PizzaSauce {
    @Override
    public String toString() { return "pizza.sauce.Tomato Sauce"; }

    @Override
    public String toNiceString() { return "Classic tomato pizza sauce."; }

    @Override
    public Double getPrice(){ return 0.25; }
}
