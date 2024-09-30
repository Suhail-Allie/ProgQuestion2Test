package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the accident vehicle type: ");
         String vehicleType = scanner.nextLine();

         System.out.println("Enter the city for the vehicle accidents: ");
         String city = scanner.nextLine();

         System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
         int accidentTotal = scanner.nextInt();

         RoadAccidentReport report = new RoadAccidentReport(vehicleType, city, accidentTotal);
         report.printReport();


    }
}




