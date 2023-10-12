package com.pluralsight;

import java.util.Scanner;
public class AddressBuilder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the following information below:");

        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine().trim();

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine().trim();

        System.out.print("Billing State: ");
        String suffix = scanner.nextLine().trim();

        System.out.print("Billing Zip: ");
        String suffix = scanner.nextLine().trim();


        StringBuilder skills = new StringBuilder();
        // append strings to the StringBuilder object
        skills.append("Full Name: " + firstName + "\n \n");

        skills.append("\nBilling Street: \n");
        skills.append("Billing City: \n");
        skills.append("Billing State: \n");
        skills.append("Billing Zip: \n \n");

        skills.append("Shipping Street: \n");
        skills.append("Shipping City: \n");
        skills.append("Shipping State: \n");
        skills.append("Shipping Zip: \n");

        // retrieve the underlying characters from
        // the StringBuilder
        String mySkills = skills.toString();
        System.out.println(mySkills);
    }
}
