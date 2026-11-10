package core;

import validation.DictReturnType;
import validation.StringValidator;
import errors.StringValidationError;

public final class Building {
    private final String buildingID;
    private String buildingName;
    private double roofArea;
    private double runOffCoefficient;

    public Building(String id, String name, double area, double runOff) throws StringValidationError {

        DictReturnType validID = StringValidator.validate(id, 10);
        if (!validID.success) {
            throw new StringValidationError("Invalid Building ID : " + validID.error);
        }
        buildingID = validID.data;
        updateBuildingName(name);
        updateRoofArea(area);
        updateRunOffCoefficient(runOff);
    }

    public Building(String id, String name, double area, String surface) throws StringValidationError {

        DictReturnType validID = StringValidator.validate(id, 10);
        if (!validID.success) {
            throw new StringValidationError("Invalid Building ID : " + validID.error);
        }
        buildingID = validID.data;
        updateBuildingName(name);
        updateRoofArea(area);
        updateRunOffCoefficient(surface);
    }

    public void updateBuildingName(String name) throws StringValidationError {
        DictReturnType validName = StringValidator.validate(name, 100);
        if (!validName.success) {
            throw new StringValidationError("Invalid Building Name : " + validName.error);
        }
        buildingName = validName.data;
    }

    public void updateRoofArea(double area) throws IllegalArgumentException {
        if (Double.isNaN(area)) {
            throw new IllegalArgumentException("Roof Area must be a number");
        }
        if (area <= 0) {
            throw new IllegalArgumentException("Roof Area cannot be less than 0 ");
        }
        roofArea = area;
    }

    public void updateRunOffCoefficient(double runOff) throws IllegalArgumentException {
        if (Double.isNaN(runOff)) {
            throw new IllegalArgumentException("Run off coefficient must be a number");
        }
        if (runOff <= 0 || runOff > 1) {
            throw new IllegalArgumentException("Run off coefficient must be greater than 0 and less or equal than 1");
        }
        runOffCoefficient = runOff;
    }

    public void updateRunOffCoefficient(String surface) throws StringValidationError {
        DictReturnType validSurface = StringValidator.validate(surface, 100);
        if (!validSurface.success) {
            throw new StringValidationError("Invalid Surafce Name : " + validSurface.error);
        }
        runOffCoefficient = RunOffbySurfaces.getSurfaceRunOff(validSurface.data);
    }

    public String getBuildingName() {
        return buildingName;
    }

    public String getBuildingId() {
        return buildingID;
    }

    public double getRoofArea() {
        return roofArea;
    }

    public double getRunOff() {
        return runOffCoefficient;
    }

    // Check if two building objects are equal
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Building))
            return false;
        return buildingID.equals(((Building) o).buildingID);
    }

    @Override
    public String toString() {
        return "Building{id = " + buildingID + ", name = " + buildingName + ", roof area = " + roofArea
                + "m², run off cofficient = " + runOffCoefficient;
    }

}