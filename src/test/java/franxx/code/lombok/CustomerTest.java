package franxx.code.lombok;

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
}
