package business;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SectorTest {
    @Test
    public void shouldSetSectorName() {
        Sector sector = new Sector("Tech");

        sector.setName("Engineering");

        assertEquals("Engineering", sector.getName());
    }

    @Test
    public void shouldReturnName() {
        Sector sector = new Sector("Tech");

        assertEquals("Tech", sector.getName());
    }

    @Test
    public void shouldTwoEmployers() {
        Sector sector = new Sector("Tech");

        Employee employeeA = new Employee(1, "Patrick");
        Employee employeeB = new Employee(1, "Larissa");

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(employeeA);
        employeeList.add(employeeB);

        sector.setEmployees(employeeList);

        assertEquals(2, sector.getNumberOfEmployees());
    }
}