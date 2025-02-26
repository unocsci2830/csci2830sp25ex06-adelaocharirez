package pizza.crust;

import pizza.PizzaComponent;

public abstract class PizzaCrust extends PizzaComponent {
    protected String ingredient;

    public PizzaCrust(String ingredient) {
        this.ingredient = ingredient;
    }

    public abstract String checkIntegrity();

    @Override
    public String toNiceString() {
        return "Crust made with " + ingredient + ".";
    }
}

