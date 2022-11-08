import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cupcake> cupcakeMenu = new ArrayList<>();
        Cupcake cupcake = new Cupcake("Cupcake");
        RedVelvet redVelvet = new RedVelvet("Red Velvet");
        Chocolate chocolate = new Chocolate("Chocolate");

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        Scanner input = new Scanner(System.in);
        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");

        for(Cupcake c : cupcakeMenu) {
            String cupcakeType = c.getName();
            if(cupcakeType.equalsIgnoreCase("Cupcake")) {
                System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");

            } else {
                System.out.println("We are deciding on the price for our "+cupcakeType+ " cupcake. Here is the description:");
            }
            c.type();
            if(cupcakeType.equalsIgnoreCase("Cupcake")) {
                System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
            } else {
                System.out.println("How much would you like to charge for the "+cupcakeType+ " cupcake? (Input a numerical number taken to 2 decimal places)");
            }

            String cupcakePriceText = input.nextLine();
            double cupcakePrice = Double.parseDouble(cupcakePriceText);
            c.setPrice(cupcakePrice);

        }

        ArrayList<Drink> drinkMenu = new ArrayList<>();
        Drink water = new Drink("Water");
        Soda soda = new Soda("Coca-cola");
        Milk milk = new Milk("Fat free Milk");

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        System.out.println("We are in the middle of creating the drink menu. We currently have three drinks on the menu but we need to decide on pricing.");

        for(Drink drink : drinkMenu) {
            String drinkType = drink.getName();

            System.out.println("We are deciding on the price for our "+drinkType+" bottle. Here is the description:");
            drink.type();

            System.out.println("How much would you like to charge for the "+drinkType+ "?(Input a numerical number taken to 2 decimal places)");
            String drinkPriceText = input.nextLine();
            double drinkPrice = Double.parseDouble(drinkPriceText);
            drink.setPrice(drinkPrice);

        }

    }
}

class Cupcake {
    public double price;
    public String name;

    public Cupcake(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type() {
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }
}

class RedVelvet extends Cupcake {
    public RedVelvet(String name) {
        super(name);
    }

    @Override
    public void type() {
        System.out.println("A red velvet based cupcake, with cream cheese frosting.");
    }
}

class Chocolate extends Cupcake {

    public Chocolate(String name) {
        super(name);
    }

    @Override
    public void type() {
        System.out.println("A chocolate based cupcake, with chocolate frosting");
    }
}

class Drink {
    public double price;
    public String name;

    public Drink(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void type() {
        System.out.println("A bottle of water");
    }
}

class Soda extends Drink {

    public Soda(String name) {
        super(name);
    }

    @Override
    public void type() {
        System.out.println("A bottle of soda");
    }
}

class Milk extends Drink {

    public Milk(String name) {
        super(name);
    }

    @Override
    public void type() {
        System.out.println("A bottle of milk");
    }
}
