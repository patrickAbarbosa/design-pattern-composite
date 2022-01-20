package business;

import java.util.List;

public class Company extends Department {
    private List<Sector> sectors;

    public Company(String name) {
        super(name);
    }

    public void setSectors(List<Sector> sectors) {
        this.sectors = sectors;
    }

    public List<Sector> getSectors() {
        return sectors;
    }

    public int getNumberOfEmployees() {
        if (sectors == null) {
            return 0;
        }

        int sum = 0;

        for(Sector sector : sectors) {
           sum += sector.getNumberOfEmployees();
        };

        return sum;
    };
}
