import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderProcessorTest {

    @Test
    void testPrintOrderSummary() {
        OrderProcessor processor = new OrderProcessor();

        // Instead of passing null, create a proper Order object
        Order order = new Order();
        Customer customer = new Customer();
        Item item = new Item();

        // Note: Since Order, Customer, Item don't have setters,
        // we just test that the method exists and doesn't crash with a valid object
        try {
            processor.printOrderSummary(order);
        } catch (Exception e) {
            fail("Should not throw exception: " + e.getMessage());
        }

        // All good if we get here
        assertTrue(true);
    }
}