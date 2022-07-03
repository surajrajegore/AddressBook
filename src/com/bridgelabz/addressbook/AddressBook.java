package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {
    static String firstName;
    static String lastName;
    static String city;
    static String state;
    static String address;
    static String emailId;
    static long phoneNo;
    static int zipCode;
    private static void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Name : ");
        firstName = sc.next();

        System.out.print("Enter the Last Name : ");
        lastName = sc.next();

        System.out.print("Enter the Address: ");
        address = sc.nextLine();
        address += sc.nextLine();

        System.out.print("Enter the City Name : ");
        city = sc.next();

        System.out.print("Enter the state Name : ");
        state = sc.next();

        System.out.print("Enter the Email-Id : ");
        emailId = sc.next();

        System.out.print("Enter the Zip Code : ");
        zipCode = sc.nextInt();

        System.out.print("Enter the  Phone Number: ");
        phoneNo = sc.nextLong();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook.getInput();
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("City Name : " + city);
        System.out.println("State Name : " + state);
        System.out.println("Email-Id : " + emailId);
        System.out.println("Zip Code : " + zipCode);
        System.out.println("phone Number  : " + phoneNo);
    }
}