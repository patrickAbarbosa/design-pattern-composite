package business;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    @Test
    public void shouldSetCompanyName() {
        Company company = new Company("Pk");

        company.setName("Pk");

        assertEquals("Pk", company.getName());
    }

    @Test
    public void shouldReturnName() {
        Company company = new Company("Pk");

        company.setName("Pk");

        assertEquals("Pk", company.getName());
    }

    @Test
    public void shouldRhreeEmployers() {
        Company company = new Company("Pk");

        Sector techSector = new Sector("Tech");
        Sector productSector = new Sector("Product");

        Employee employeeA = new Employee(1, "Patrick");
        Employee employeeB = new Employee(1, "Larissa");
        Employee employeeC = new Employee(1, "Karina");

        List<Employee> employeesTech = new ArrayList<Employee>();
        employeesTech.add(employeeA);
        employeesTech.add(employeeB);

        List<Employee> employeesProduct = new ArrayList<Employee>();
        employeesProduct.add(employeeC);

        techSector.setEmployees(employeesTech);
        productSector.setEmployees(employeesProduct);

        List<Sector> sectors = new ArrayList<Sector>();
        sectors.add(techSector);
        sectors.add(productSector);

        company.setSectors(sectors);

        assertEquals(3, company.getNumberOfEmployees());
    }
}