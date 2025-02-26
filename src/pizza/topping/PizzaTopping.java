package pizza.topping;

import pizza.PizzaComponent;

public abstract class PizzaTopping extends PizzaComponent {
    @Override
    public abstract String toString();

    public abstract String toNiceString();

    @Override
    public abstract Double getPrice();
}
