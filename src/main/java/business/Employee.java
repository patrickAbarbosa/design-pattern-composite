package business;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        if (!isValidName(name)) {
            throw new IllegalArgumentException("Invalid name!");
        }

        this.id = id;
        this.name = name;
    }

    private boolean isValidName(String name) {
        return name.length() >= 3;
    }

    public Employee setName(String name) {
        if (!isValidName(name)) {
            throw new IllegalArgumentException("Invalid name!");
        }

        this.name = name;
        return this;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
