package pizza.crust;

public class ThickCrust extends PizzaCrust {
    private boolean deepDish;

    public ThickCrust(String ingredient, boolean deepDish) {
        super(ingredient);
        this.deepDish = deepDish;
    }

    @Override
    public String toString() { return "Thick Crust"; }

    @Override
    public String toNiceString() {
        return "Thick crust made with " + ingredient + ", " + (deepDish ? "deep dish style." : "regular style.");
    }

    @Override
    public String checkIntegrity() {
        return ingredient.equals("cauliflower") ? "Warning: Handle carefully, cauliflower crust might fall apart!" : "";
    }

    @Override
    public Double getPrice(){ return 3.00; }
}
