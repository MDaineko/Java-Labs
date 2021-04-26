package by.gsu.pms;

public class Runner {
    public static void main(String[] args) {

        Product[] products = {
                new Product("Chocolate bar", 1.49, true),
                new Product("Bubblegum", 1.09, false),
                null,
                new Product("Bottle of milk", 1.25, true),
                new Product("Packet of biscuits", 2.50, true),
                new Product("Coke", 1.89, false),
                new Product("Bread", 0.99, true),
                new Product("Baguette", 1.30, true),
                new Product("", 2000, true),
                new Product(),
        };

        for (Product product : products) {
            if (product != null) {
                System.out.println();
            }
        }

        int totalExpenses = 0;
        int maxTotal = 0;

        products[products.length - 1].setTransport(3000);
        System.out.println(products[products.length - 1]);

        System.out.println("Duration = " + (products[0].getDays() + products[1].getDays()));

        for (BusinessTrip employee: products) {
            if(employee != null){
                System.out.println(employee.toString());
            }
        }



        for (BusinessTrip employee : employees) {
            if (employee != null) {
                totalExpenses += employee.getTotal();
            }
        }
        System.out.println("Total expenses = " + totalExpenses);



        for (BusinessTrip employee : employees) {
            if (employee != null && employee.getTotal() > maxTotal) {
                maxTotal = employee.getTotal();
            }
        }
        System.out.println("Maximum total = " + maxTotal);
    }
}

