package business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void shouldFailToPassInvalidName() {
        try {
            Employee employee = new Employee(2, "ka");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid name!", e.getMessage());
        }
    }

    @Test
    public void shouldReturnName() {
        Employee employee = new Employee(2, "Larissa");

        assertEquals("Larissa", employee.getName());
    }

    @Test
    public void shouldReturnId() {
        Employee employee = new Employee(2, "Larissa");

        assertEquals(2, employee.getId());
    }

    @Test
    public void shouldReturnModifiedName() {
        Employee employee = new Employee(2, "Larissa");

        employee.setName("Karina");

        assertEquals("Karina", employee.getName());
    }

    @Test
    public void shouldReturnModifiedId() {
        Employee employee = new Employee(2, "Larissa");

        employee.setId(13);

        assertEquals(13, employee.getId());
    }
}