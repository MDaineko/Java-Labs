import by.gsu.pms.BusinessTrip;

public class Runner {
    public static void main(String[] args) {

        BusinessTrip[] employees = {
                new BusinessTrip("Bill Gates", 5000, 1),
                new BusinessTrip("Jeff Bezos", 15000, 3),
                null,
                new BusinessTrip("Ilon Musk", 20000, 4),
                new BusinessTrip("Sergey Brin", 4500, 6),
                new BusinessTrip("Mark Zukerberg", 25000, 8),
                new BusinessTrip("Jack Ma", 2000, 7),
        };

        for (BusinessTrip employee : employees) {
            if (employee != null) {
                employee.show();
                System.out.println();
            }
        }

        employees[employees.length - 1].setTransport(3000);
        System.out.println(employees[employees.length - 1]);

        System.out.println("Duration = " + (employees[0].getDays() + employees[1].getDays()));

        for (BusinessTrip employee: employees) {
            if(employee != null){
                System.out.println(employee.toString());
            }
        }

        int totalExpenses = 0;

        for (BusinessTrip employee : employees) {
            if (employee != null) {
                totalExpenses += employee.getTotal();
            }
        }
        System.out.println("Total expenses = " + totalExpenses);

        int maxTotal = 0;

        for (BusinessTrip employee : employees) {
            if (employee != null && employee.getTotal() > maxTotal) {
                maxTotal = employee.getTotal();
            }
        }
        System.out.println("Maximum total = " + maxTotal);
    }
}
