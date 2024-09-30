package org.example;
import java.util.Scanner;

public class RoadAccidentReport {

        private String vehicleType;
        private String city;
        private int accidentTotal;

        public RoadAccidentReport(String vehicleType, String city, int accidentTotal) {
            this.vehicleType = vehicleType;
            this.city = city;
            this.accidentTotal = accidentTotal;
        }

        public void printReport() {
            System.out.println("\nVEHICLE ACCIDENT REPORT");
            System.out.println("----------------------------------");
            System.out.println("VEHICLE TYPE: " + vehicleType);
            System.out.println("CITY: " + city);
            System.out.println("ACCIDENT TOTAL: " + accidentTotal);
            System.out.println("----------------------------------");
        }
    }

