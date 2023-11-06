public class Product {
    String productName;
    int productId;
    String productColor;
    String size;
    int quantity;
    double price = 0.0;

    public Product(int productId, String productName, String productColor, String size, int quantity, double price) {
        this.productName = productName;
        this.productId = productId;
        this.productColor = productColor;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    void printDetails() {
        System.out.println("ID:" + this.productId + "   " + "Product Name: " + this.productName + "   " + "Color: " + this.productColor + "   " + "size: " + this.size +
                "   " + "Quantity:" + this.quantity + "   " + "price:" + this.price + "EUR");
    }
}
