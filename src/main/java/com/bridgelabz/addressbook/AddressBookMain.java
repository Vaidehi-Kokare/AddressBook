package com.bridgelabz.addressbook;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to address book program");

        AddressBook a1 = new AddressBook();
        a1.addContact();

        a1.addContact();
        System.out.println(a1.list);

        a1.editContact();

        a1.deleteContact();
    }
}