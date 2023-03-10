package com.bridgelabz.addressbook;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    static Scanner scanner = new Scanner(System.in);
    AddressBook a1 = new AddressBook();
    ArrayList <Contacts> list = new ArrayList<>();
    void addContact() {
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

        Contacts contactList = new Contacts(firstName, lastName, address, zipCode, city,state,phoneNumber,emailID);
        list.add(contactList);
    }

    public void editContact(){
        System.out.println("Enter name whose details you want to edit");
        String name = AddressBook.scanner.nextLine();
        for (Contacts x : a1.list) {
            if (x.getFirstName().equals(name)) {
                System.out.println("Enter which details you want to edit eg. firstName, lastName etc ");
                String check = AddressBook.scanner.nextLine();
                switch (check) {
                    case "firstName":
                        System.out.println("Rename first Name to  ");
                        x.setFirstName(AddressBook.scanner.nextLine());
                        break;
                    case "lastName":
                        System.out.println("Rename last Name to  ");
                        x.setLastName(AddressBook.scanner.nextLine());
                        break;
                    case "address":
                        System.out.println("Rename address to  ");
                        x.setAddress(AddressBook.scanner.nextLine());
                        break;
                    case "city":
                        System.out.println("Rename city to  ");
                        x.setCity(AddressBook.scanner.nextLine());
                        break;
                    case "zip":
                        System.out.println("Rename zip to  ");
                        x.setZip(AddressBook.scanner.nextInt());
                        break;
                    case "phone":
                        System.out.println("Rename phone to  ");
                        x.setPhone(AddressBook.scanner.nextLong());
                        break;
                    case "email":
                        System.out.println("Rename email to  ");
                        x.setEmail(AddressBook.scanner.nextLine());
                        break;
                    case "state":
                        System.out.println("Rename state to  ");
                        x.setState(AddressBook.scanner.nextLine());
                        break;
                    default:
                        System.out.println("invalid entry");
                }
            }
        }
    }

    public  void deleteContact(){
        System.out.println("Delete a contact using name " );
        String name = AddressBook.scanner.nextLine();
        name = AddressBook.scanner.nextLine();

        int count=0;

        for(Contacts x : a1.list){
            if(x.getFirstName().equals(name)){
                a1.list.remove(count);
                break;
            }
            count++;
        }
        System.out.println(a1.list);

    }
    public void addMultipleAddressBook(){
        AddressBook a1 = new AddressBook();
        Map<Integer,AddressBook> dictonary = new HashMap<>();
        dictonary.put(1,a1);
        for(Map.Entry<Integer,AddressBook> x : dictonary.entrySet()){
            System.out.println(x.getKey()+" : "+x.getValue());
        }
    }
}
