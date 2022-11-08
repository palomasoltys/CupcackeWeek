import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello customer. Would you like to place an order? (Y or N)");
        String placeOrder = scan.nextLine();
        ArrayList<Object> order = new ArrayList<>();
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

        } else {
            System.out.println("Have a nice day then.");
        }
    }
}
