import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, Product> productSelection = new HashMap<Integer, Product>();
        Request req = new Request();
        int request = 0;
        boolean run = true;

        // Create Products.
        Product gucciTshirt = new Product(3, "Gucci Tshirt", "Blue", "XXL", 200, 45);
        Product addidasTshirt = new Product(4, "Addidas Tshirt", "Black", "L", 220, 30);

        // Add products to productSelection
        productSelection.put(3, gucciTshirt);
        productSelection.put(4, addidasTshirt);

        Store juBuy = new Store("juBuy", "Frankfurt", 2215, +497789);

        juBuy.printStoreInfo();
        Cart cart = new Cart();

        while (run) {
            request = req.getRequest();

            if (request == 2) {
                boolean addMoreProducts = true;
                while (addMoreProducts) {
                    System.out.println("Available Products:");
                    for (Product product : productSelection.values()) {
                        product.printDetails();
                    }

                    System.out.println("Please enter the ID of the Product you want to Buy");
                    int choice = input.nextInt();

                    if (productSelection.containsKey(choice)) {
                        Product selectedProduct = productSelection.get(choice);
                        cart.addTocart(selectedProduct);
                        System.out.println("Added to cart:");
                        selectedProduct.printDetails();
                    } else {
                        System.out.println("Product with ID " + choice + " does not exist.");
                    }

                    int nextAction;
                    do {
                        System.out.println("Press 2 to add more products, 0 for the total, or 1 to exit.");
                        nextAction = input.nextInt();
                    } while (nextAction != 0 && nextAction != 1 && nextAction != 2);

                    if (nextAction == 0) {
                        addMoreProducts = false;
                        System.out.println("Here is the Total of your Shopping: " + cart.calculateTotal());
                        break; // This will exit the loop after displaying the total.
                    } else if (nextAction == 1) {
                        run = false;
                        addMoreProducts = false;
                    }
                }
            } else if (request == 1) {
                run = false;
                System.out.println("Exiting the app...");
            }
        }
    }
}










