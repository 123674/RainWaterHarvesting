import core.Building;
import core.HarvestCalculator;

public class Main {
    public static void main(String[] args) {
        Building b = new Building("1234","PJ Block", 1023.23,"Concrete");
        double harvest = HarvestCalculator.estimate(b,10);
        System.out.println(harvest);
    }
}
