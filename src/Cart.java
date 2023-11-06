import java.util.ArrayList;

class Cart {
    private ArrayList<Product> products = new ArrayList<>();

    public void addTocart(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public int getTotalProducts() {
        return products.size();
    }
}

