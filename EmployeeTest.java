import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void testPayRegularHours() {
        Employee employee = new Employee(40, 10.0);
        double expectedPay = 40 * 10.0;
        assertEquals(expectedPay, employee.pay(), 0.001);
    }

    @Test
    public void testPayOvertime() {
        Employee employee = new Employee(45, 10.0);
        double expectedPay = (40 * 10.0) + (5 * 10.0 * 1.5);
        assertEquals(expectedPay, employee.pay(), 0.001);
    }

    @Test
    public void testPayNoOvertime() {
        Employee employee = new Employee(35, 12.0);
        double expectedPay = 35 * 12.0;
        assertEquals(expectedPay, employee.pay(), 0.001);
    }
}