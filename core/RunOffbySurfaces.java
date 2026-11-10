package core;

import java.util.HashMap;
import java.util.Map;

import errors.StringValidationError;

public class RunOffbySurfaces {
    final static private Map<String, Double> surfaces = new HashMap<>(Map.ofEntries(
            Map.entry("Cultivated Land, Sand & Gravel Soils", 0.3),
            Map.entry("Cultivated Land, Sandy Loam Soils", 0.36),
            Map.entry("Cultivated Land, Clay & Silt Loam Soils", 0.56),
            Map.entry("Cultivated Land, Tight Clay Soils", 0.66),
            Map.entry("Pasture, Sandy Loam Soils", 0.16),
            Map.entry("Pasture, Clay & Silt Loam Soils", 0.36),
            Map.entry("Pasture, Tight Clay Soils", 0.5),
            Map.entry("Meadow", 0.3),
            Map.entry("Woodland, Sandy Loam Soils", 0.2),
            Map.entry("Woodland, Clay & Silt Loam Soils", 0.4),
            Map.entry("Woodland, Tight Clay Soils", 0.5),
            Map.entry("Bare Rock", 0.88),
            Map.entry("Desert", 0.425),
            Map.entry("Parking", 0.905),
            Map.entry("Commercial", 0.8),
            Map.entry("Streets", 0.805),
            Map.entry("Industrial", 0.765),
            Map.entry("Residential Lots, High Density", 0.395),
            Map.entry("Residential Lots, Medium Density", 0.345),
            Map.entry("Residential Lots, Low Density", 0.3),
            Map.entry("Railway Yards", 0.275),
            Map.entry("Playgrounds", 0.25),
            Map.entry("Sports Fields", 0.275),
            Map.entry("Parks", 0.175),
            Map.entry("Cemetaries", 0.175),
            Map.entry("Roofs, Steeply Sloping", 0.925),
            Map.entry("Roofs, Small Flat", 0.925),
            Map.entry("Roofs, Large Flat", 0.85),
            Map.entry("Asphalt", 0.825),
            Map.entry("Pervious Asphalt", 0.675),
            Map.entry("Concrete", 0.825),
            Map.entry("Pervious Concrete", 0.7),
            Map.entry("Concrete Blocks, Uncemeted Joints", 0.6),
            Map.entry("Concrete Blocks, Cemeted Joints", 0.775),
            Map.entry("Gravel", 0.55),
            Map.entry("Earth", 0.5),
            Map.entry("Grass, Poor Condition", 0.47),
            Map.entry("Grass, Fair Condition", 0.425),
            Map.entry("Grass, Good Condition", 0.395),
            Map.entry("Turf Block", 0.225)));
    static double getSurfaceRunOff(String surface) throws StringValidationError{
        double res = surfaces.getOrDefault(surface,0.0);
        if(res == 0){
            throw new StringValidationError("Surafce not found");
        }
        return res;
    }

}
