package franxx.code.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    void customer() {

        Customer customer = new Customer();

        customer.setId("111");
        customer.setName("ME");

        System.out.println(customer.getId());
        System.out.println(customer.getName());
    }

    @Test
    void constructor() {
        Customer customer = new Customer("id", "name");
        Assertions.assertEquals("id", customer.getId());
        Assertions.assertEquals("name", customer.getName());
    }

    @Test
    void equals() {

        Customer customer = new Customer("id", "name 1");

        Customer customer2 = new Customer("id", "name 2");

        Assertions.assertEquals(customer, customer2);
        Assertions.assertEquals(customer.hashCode(), customer2.hashCode());

    }
}
