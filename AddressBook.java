package com.AddressBook.Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.*;

public class AddressBook {
	private static ArrayList<ContactList> contacts;

	public static void main(String args[])
    {
		ArrayList<ContactList> contacts = new ArrayList<>();
		Scanner scanner=new Scanner(System.in); 
		
		int n=1;
        while(n>0)
        {
            Iterator itr=contacts.iterator();
            System.out.println("1.Add  2.Delete  3.Display  4.Edit  5.Sort By FirstName  6.Sort By Zip");
            System.out.print("Enter the Choice: ");
            
			Scanner sc = scanner;
			int choice = sc.nextInt();
            switch(choice)
            {
                case 1: //add contact 
                	
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
					break;
   
                case 2 :
	System.out.print("Enter contact index : ");
    int index = sc.nextInt();
    contacts.remove(index);
	System.out.println("contact deleted successfully");
					break;
		

        
	
	
                case 3: //display contact
	for ( int i=0; i<contacts.size(); i++) {
		System.out.println(i);
		System.out.println(contacts.get(i));
	}
					break;
                case 4: //edit contact
                    System.out.print("Enter Contact Index: ");
                    int ind = sc.nextInt();
                    System.out.println("1.LastName  2.address  3.city  4.state  5.zip 6.phoneNumber");
                    System.out.print("Select the field to edit:");
                    int opt = sc.nextInt();
                    
                    
                    if(opt == 1 )
                    {
                        System.out.print("Enter the value: ");
                        String value = sc.next();
                        //last name modification
                        contacts.get(ind).setLastName(value);
                    }
                    else if(opt == 2)
                    {
                        System.out.print("Enter the value: ");
                        String value = sc.next();
                        //address modification
                        contacts.get(ind).setAddress(value);
                    }
                    else if(opt == 3)
                    {
                        System.out.print("Enter the value: ");
                        String value = sc.next();
                        //city name modification
                        contacts.get(ind).setCity(value);
                    }
                    else if(opt == 4)
                    {
                        System.out.print("Enter the value: ");
                        String value = sc.next();
                        //state name modification
                        contacts.get(ind).setState(value);
                    }
                    else if(opt == 5)
                    {
                        System.out.print("Enter the value: ");
                        int value = sc.nextInt();
                        //zip modification
                        contacts.get(ind).setZip(value);
                    }
                    else if(opt == 6)
                    {
                        System.out.print("Enter the value: ");
                        int value = sc.nextInt();
                        //phone number modification
                        contacts.get(ind).setPhoneNumber(value);
                    }
                    else
                    {
                        System.out.println("Error");
                    }
                    System.out.println("UPDATED");
         
                    break;
                    
            case 5: //sort by first name
                    System.out.println("Sorted Successfully");
                    contacts.sort(Comparator.comparing(ContactList::getFirstName));
                    break;
                    
            case 6: //sort by zip
                    System.out.println("Sorted Sucessfully");
                    contacts.sort(Comparator.comparingInt(ContactList::getZip));
                    break;
        
            default:System.out.println("Invalid Option");
                    break;    
	
				    }
				
		   
		   }
		 
    }
}