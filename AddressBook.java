package com.AddressBook.Java;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	static ArrayList<ContactList> contacts=new ArrayList<>();
	public static void addContact() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String firstName=scanner.next();
		
		System.out.println("Enter Last Name : ");
		String lastName=scanner.next();
		
		System.out.println("Enter city: ");
		String city=scanner.next();
		
		System.out.println("Enter address: ");
		String address=scanner.next();
		
		System.out.println("Enter phone number: ");
		int phoneNumber=scanner.nextInt();
		
		System.out.println("Enter state: ");
		String state=scanner.next();
		
		System.out.println("Enter Zip: ");
		int zip=scanner.nextInt();
	
		System.out.println("Enter ID: ");
		int id=scanner.nextInt();

  ContactList newContact = new ContactList(firstName, id, address, lastName, city, state, zip, phoneNumber);
  contacts.add(newContact);
	System.out.println("added new contact");
	}
	
	public static void removeContact(int id ) {
	contacts.remove(id);
	System.out.println("contact deleted successfully");
	}
	public static void displayContact() {
	for ( int i=0; i<contacts.size(); i++) {
		System.out.println(i);
		System.out.println(contacts.get(i));
	
	}
	
	}
	
	public static void main(String[] args) {

	
	}
}