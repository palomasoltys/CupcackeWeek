import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello customer. Would you like to place an order? (Y or N)");
        String placeOrder = scan.nextLine();
        ArrayList<Object> order = new ArrayList<Object>();
        if(placeOrder.equalsIgnoreCase("Y")) {
            order.add(LocalDate.now());
            order.add(LocalTime.now());
            System.out.println("Here is the menu.");
            System.out.println("CUPCAKES: ");
            int itemNumber = 1;
            for(Cupcake cupcake : cupcakeMenu) {
                System.out.println(itemNumber+". "+cupcake.getName()+ " - "+cupcake.getPrice()+".");
                itemNumber++;
            }
            System.out.println();
            System.out.println("DRINKS: ");
            for(Drink drink : drinkMenu) {
                System.out.println(itemNumber+". "+drink.getName()+ " - "+drink.getPrice()+".");
                itemNumber++;
            }
            boolean ordering = true;
            while(ordering) {
                System.out.println("What would you like to order? Please use the number associated with each item to order.");
                int orderChoice = scan.nextInt();
                scan.nextLine();
                switch (orderChoice) {
                    case 1 -> order.add(cupcakeMenu.get(1));
                    case 2 -> order.add(cupcakeMenu.get(2));
                    case 3 -> order.add(cupcakeMenu.get(3));
                    case 4 -> order.add(drinkMenu.get(1));
                    case 5 -> order.add(drinkMenu.get(2));
                    case 6 -> order.add(drinkMenu.get(3));
                    default -> System.out.println("Sorry, we don't have this item on the menu.");
                }
                System.out.println("Item added to order");
                System.out.println("Would you like to continue ordering? ");
                placeOrder = scan.nextLine();
                if(!placeOrder.equalsIgnoreCase("Y")) {
                    ordering = false;
                }
            }
        } else {
            System.out.println("Have a nice day then.");
        }
    }
}
