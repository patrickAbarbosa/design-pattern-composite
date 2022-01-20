package business;

import java.util.List;

public class Sector extends Department {
    private List<Employee> employees;

    public Sector(String name) {
        super(name);
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public int getNumberOfEmployees() {
        if (employees == null) {
            return 0;
        }

        return this.employees.size();
    }
}
