package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {
    Contact contact = new Contact();
    void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = scanner.next();
        System.out.println("Enter last name");
        String lastName = scanner.next();
        System.out.println("Enter address");
        String address = scanner.next();
        System.out.println("Enter city");
        String city = scanner.next();
        System.out.println("Enter state");
        String state = scanner.next();
        System.out.println("Enter zip code");
        String zipCode = scanner.next();
        System.out.println("Enter phone number");
        String phoneNumber = scanner.next();
        System.out.println("Enter email-id");
        String emailID = scanner.next();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zipCode);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmailID(emailID);
    }
    public void editContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name of the contact you want to edit :");
        String searchName = scanner.next();
        if (this.contact.getFirstName().equalsIgnoreCase(searchName)) {
            System.out.println("Enter firstName");
            String firstName = scanner.next();
            System.out.println("Enter lastName");
            String lastName = scanner.next();
            System.out.println("Enter address");
            String address = scanner.next();
            System.out.println("Enter city");
            String city = scanner.next();
            System.out.println("Enter State");
            String state = scanner.next();
            System.out.println("Enter Zip Code");
            String zip = scanner.next();
            System.out.println("Enter Phone number");
            String phoneNumber = scanner.next();
            System.out.println("Enter Phone number");
            String emailID = scanner.next();
            Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, emailID);
            this.contact = contact;
        }

    }
}
