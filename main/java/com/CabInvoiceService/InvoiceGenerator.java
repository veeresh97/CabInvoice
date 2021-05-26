package com.CabInvoiceService;

public class InvoiceGenerator {

    private static final double MINIMUM_COST_PER_KM = 10.0;
    private static final double COST_PER_TIME = 1.0;
    private static final double MINIMUM_COST = 5.0;

    public double calculateFare(double distance, int time) {
        double totalFare =  distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
        if (totalFare<5.0)
            return MINIMUM_COST;
        return totalFare;
    }

    public double calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride:rides){
            totalFare += this.calculateFare(ride.distance, ride.time);
        }
        return totalFare;
    }
}
