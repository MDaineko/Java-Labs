package gsu;

public class Runner {
    public static void main(String[] args) {

        Product[] products = new Product[]{
                new Product("Chocolate bar", true, 1.49),
                new Product("Bubblegum", false, 1.09),
                null,
                new Product("Bottle of milk", true, 1.25),
                new Product("Packet of biscuits", true, 2.49),
                new Product("Coke", false, 1.89),
                new Product("Bread", true, 0.99),
                new Product("Baguette", true, 1.35),
                new Product("Butter", true, 2.25),
                new Product(),
        };

        double totalPrice = 0;
        int availableProducts = 0;

        for (Product product : products) {
            if (product != null) {
                totalPrice += product.getPrice();
                if (product.isAvailable()) {
                    availableProducts += 1;
                }
            }
        }

        System.out.println("Total price of products = " + totalPrice);
        System.out.println("Products available = " + availableProducts);

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
