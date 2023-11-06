import java.util.Scanner;
public class Request {
    Scanner scanner;
    Request () {
        scanner = new Scanner (System.in);
    }
    int getRequest () {

        System.out.println();
        System.out.println("Welcome to our application!");
        System.out.println("Please press 1 to Exit the App");
        System.out.println("Please press 2 to select the product");
        System.out.println("Please press 0 to get the total");

        int requestNumber = this.scanner.nextInt();

        return requestNumber;
    }
    void quit () {

        System.exit(0);
    }
}
