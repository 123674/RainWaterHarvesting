package core;

public class HarvestCalculator {
    public static double estimate(Building b,double rainFall){
        return b.getRoofArea() * rainFall * b.getRunOff() ;
    }
}
