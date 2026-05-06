public class OrderProcessor {

    public void printOrderSummary(Order order) {
        if (order == null) {
            System.out.println("No order to process");
            return;
        }

        double totalPrice = calculateTotalPrice(order);
        totalPrice = applyDiscount(totalPrice, order);
        printOrderDetails(order, totalPrice);
    }

    private double calculateTotalPrice(Order order) {
        double totalPrice = 0;
        if (order.getItems() != null) {
            for (Item item : order.getItems()) {
                totalPrice += item.getPrice() * item.getQuantity();
            }
        }
        return totalPrice;
    }

    private double applyDiscount(double totalPrice, Order order) {
        if (order.getCustomer() != null && order.getCustomer().isMember()) {
            return totalPrice * 0.9;
        }
        return totalPrice;
    }

    private void printOrderDetails(Order order, double totalPrice) {
        System.out.println("Order Summary:");
        if (order.getCustomer() != null) {
            System.out.println("Customer: " + order.getCustomer().getName());
        }
        printItems(order);
        System.out.printf("Total Price: $%.2f%n", totalPrice);
    }

    private void printItems(Order order) {
        System.out.println("Items:");
        if (order.getItems() != null) {
            for (Item item : order.getItems()) {
                System.out.println("  - " + item.getName() + ": " + item.getQuantity() + " x $" + item.getPrice() + " = $" + (item.getQuantity() * item.getPrice()));
            }
        }
    }
}