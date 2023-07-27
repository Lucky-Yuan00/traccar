package org.traccar.reports.model;

public class DistanceCalculator {

    private double distance;

    public void addDistance(double distance) {
        this.distance += distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
         this.distance = distance;
    }

}
