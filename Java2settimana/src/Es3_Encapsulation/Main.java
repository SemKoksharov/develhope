package Es3_Encapsulation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car lexus = new Car("Lexus", "GS 300", 3.0f, "god156ood");
        Car mercedes = new Car("Mercedes-benz", "E 220", 2.0f, "met666death");
        System.out.println("Hello and welcome!");
        System.out.println("To view information about the car, enter the number of the model you are interested in");
        System.out.println("\nAvailable models:\n" + "1: " + lexus.getBrand() + " " + lexus.getModel());
        System.out.println("2: " + mercedes.getBrand() + " " + mercedes.getModel() + ".\n\n");
        System.out.println("Enter number here:");
        Scanner myScan = new Scanner(System.in);
        int selectedModel = Integer.parseInt(myScan.nextLine());
        switch (selectedModel) {
            case 1:
                System.out.println("Brand: " + lexus.getBrand() + "\nModel: " + lexus.getModel() + "\nEngine: " + lexus.getEngineSize() + "\nNumber: " + lexus.getCarLicensePlateNumber());
                break;
            case 2:
                System.out.println("Brand: "+ mercedes.getBrand() + "\nModel: " + mercedes.getModel() + "\nEngine: " + mercedes.getEngineSize() + "\nNumber: " + mercedes.getCarLicensePlateNumber());
                break;
            default:
                System.out.println("input error\nYou must enter the number corresponding to the model");
                break;

        }


    }

}
