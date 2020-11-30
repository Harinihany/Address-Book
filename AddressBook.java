package com.AddressBook.Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.*;

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
		

        
	public static void editContact(int id ) throws InterruptedException {
		 contacts.wait(id);
	System.out.println("contact has been edited");
	}
	
	public static void displayContact() {
	for ( int i=0; i<contacts.size(); i++) {
		System.out.println(i);
		System.out.println(contacts.get(i));
	}
	
	}
	
        
	public static void main(String[] args) {
		 ArrayList<String> contacts = new ArrayList<String>();
		 contacts.add("Aardvark");
		 contacts.add("Cat");
		 contacts.add("Buffalo");
		 contacts.add("Elephant");
		 contacts.add("Dog");
		   
		 Collections.sort(contacts);

		   
		   System.out.println("After Sorting by Last Name:");
		   for(String counter: contacts){
				System.out.println(counter);
	
				

				int count;
				for(int i=0;i<contacts.size();i+=count)
				
				    {
				        count=1;
				        Object[] zip = null;
						for(int j=i+1;j<contacts.size();++j)
				            { 
				                if(zip[i]==zip[j])
				                    count++;
				            }
						System.out.println("After sorting by Zip");
				        System.out.print("\nFrequency of " + zip[i] + " is " + count);
				    }
				
			
		   }
		 
	}
}