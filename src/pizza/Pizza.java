package pizza;

import pizza.crust.PizzaCrust;
import pizza.sauce.PizzaSauce;
import pizza.topping.PizzaTopping;

import java.util.ArrayList;

public class Pizza implements MenuItem {
    private PizzaCrust crust;
    private PizzaSauce sauce;
    private ArrayList<PizzaTopping> toppings;
    private ArrayList<MenuItem> selectionList;

    public Pizza(PizzaCrust crust, PizzaSauce sauce) {
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = new ArrayList<>();
        this.selectionList = new ArrayList<>();
        this.selectionList.add(crust);
        this.selectionList.add(sauce);
    }

    public boolean addTopping(PizzaTopping topping) {
        if (toppings.size() < 4) {
            toppings.add(topping);
            selectionList.add(topping);
            return true;
        }
        System.out.println("pizza.Pizza has too many toppings");
        return false;
    }
    private String getToppingsList() {
        StringBuilder toppingNames = new StringBuilder();
        for (PizzaTopping topping : toppings) {
            if (toppingNames.length() > 0) {
                toppingNames.append(", ");
            }
            toppingNames.append(topping.toNiceString());  // Use readable names
        }
        return toppingNames.toString();
    }


    @Override
    public String toString() {
        return "Crust: " + crust.toNiceString() + "\n" +
                "Sauce: " + sauce.toNiceString() + "\n" +
                "Toppings: " + (toppings.isEmpty() ? "None" : getToppingsList()) + "\n" +
        "Price: $" + String.format("%.2f", getPrice());
    }

    public void checkIntegrity() {
        String warning = crust.checkIntegrity();
        if (!warning.isEmpty()) {
            System.out.println(warning);
        }
    }

    @Override
    public Double getPrice() {
        Double totalPrice = 0.0;
        for (MenuItem m : this.selectionList) {
            totalPrice += m.getPrice();
        }
        return totalPrice;
    }
}
