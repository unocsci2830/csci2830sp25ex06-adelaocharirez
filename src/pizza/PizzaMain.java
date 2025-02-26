package pizza;

import pizza.crust.PizzaCrust;
import pizza.crust.Stuffed;
import pizza.crust.ThickCrust;
import pizza.crust.Thin;
import pizza.sauce.Alfredo;
import pizza.sauce.PizzaSauce;
import pizza.sauce.Tomato;
import pizza.topping.*;

import java.util.Scanner;

public class PizzaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PizzaCrust crust = chooseCrust(scanner);
        PizzaSauce sauce = chooseSauce(scanner);
        Pizza pizza = new Pizza(crust, sauce);

        chooseToppings(scanner, pizza);

        System.out.println("\nYour Little Caesars pizza.Pizza:");
        System.out.println(pizza);
        pizza.checkIntegrity();
    }

    private static PizzaCrust chooseCrust(Scanner scanner) {
        System.out.println("Choose your crust:");
        System.out.println("1 - Thin Crust\n2 - Stuffed Crust\n3 - Thick Crust");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Choose your crust ingredient:\n1 - Flour\n2 - Cauliflower");
        int choiceIng = scanner.nextInt();
        scanner.nextLine();
        String ingredient = (choiceIng == 1) ? "Flour" : "Cauliflower";

        if (choice == 1) return new Thin(ingredient);
        if (choice == 2) return new Stuffed(ingredient);

        System.out.println("Is it deep dish? (true/false)");
        boolean deepDish = scanner.nextBoolean();
        return new ThickCrust(ingredient, deepDish);
    }

    public static PizzaSauce chooseSauce(Scanner scanner) {
        System.out.println("Choose your sauce:\n1 - Tomato Sauce\n2 - Alfredo Sauce");
        int choice = scanner.nextInt();
        return (choice == 1) ? new Tomato() : new Alfredo();
    }

    private static void chooseToppings(Scanner scanner, Pizza pizza) {
        System.out.println("How many toppings? (Max 4)");
        int numToppings = Math.min(scanner.nextInt(), 4);

        for (int i = 0; i < numToppings; i++) {
            System.out.println("Choose your toppings:");
            System.out.println("1 - Pepperoni\n2 - Sausage\n3 - Ham\n4 - Beef\n5 - Mozzarella\n6 - Asiago\n7 - American\n8 - Blue Cheese\n9 - Green Pepper\n10 - Pineapple\n11 - Onion\n12 - Mushroom");
            System.out.print("Enter topping number: ");

            int choice = scanner.nextInt();

            PizzaTopping topping = switch (choice) {
                case 1 -> new Pepperoni();
                case 2 -> new Sausage();
                case 3 -> new Ham();
                case 4 -> new Beef();
                case 5 -> new Mozzarella();
                case 6 -> new Asiago();
                case 7 -> new American();
                case 8 -> new BlueCheese();
                case 9 -> new GreenPepper();
                case 10 -> new Pineapple();
                case 11 -> new Onion();
                case 12 -> new Mushroom();
                default -> null;
            };

            if (topping != null) {
                pizza.addTopping(topping);
            } else {
                System.out.println("Invalid choice, skipping topping.");
            }
        }
    }

}
