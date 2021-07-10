
/**********************************************************************************
 * Purpose : Implementation Of Address Book System Program Using hashmap or ArrayList
 * @author Ganesh Gavad
 * @version 1.0;
 **********************************************************************************/
package com.bridgelabz;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @AddressBookMain is main class Of Program
 */

public class AddressBookMain {
	private static Scanner sc = new Scanner(System.in);
	HashMap<String, Person> hashmap = new HashMap<>();
	Person person = new Person(); // Object of person class

	/**
	 * UC2
	 * 
	 * @addContact This method for UC2 adds object person and its fields to Hashmap
	 */
	public void addContact() {
		System.out.println("Enter First Name");
		person.setFirstName(sc.next());
		System.out.println("Enter Last Name");
		person.setLastName(sc.next());
		System.out.println("Enter Address");
		person.setAddress(sc.next());
		System.out.println("Enter City");
		person.setCity(sc.next());
		System.out.println("Enter State");
		person.setState(sc.next());
		System.out.println("Enter Zip");
		person.setZip(sc.next());
		System.out.println("Enter Phone");
		person.setPhone(sc.next());
		System.out.println("Enter Email");
		person.setEmail(sc.next());
		hashmap.put(person.getFirstName(), person);
		System.out.println(hashmap);
	}

	/**
	 * UC3
	 * 
	 * @editContact This is method for UC3 finds person according to first name and
	 *              change its field according to user input
	 */
	public void editContact() {
		System.out.println("Enter First Name To edit Contact Details ");
		String enterName;
		enterName = sc.next();
		Set<String> key = hashmap.keySet();
		for (String i : key) {
			if (i.equals(enterName)) {
				int check = 0;
				System.out.println("Person Found, What Do You Want To Edit");
				System.out
						.println("Enter\n1.FirstName\n2.lastName\n3.address\n4.city\n5.state\n6.zip\n7.phone\n8.email");
				check = sc.nextInt();
				switch (check) {
				case 1:
					System.out.println("Enter New First Name");
					person.setFirstName(sc.next());
					break;
				case 2:
					System.out.println("Enter New Last Name");
					person.setLastName(sc.next());
					break;
				case 3:
					System.out.println("Enter New Address");
					person.setAddress(sc.next());
					break;
				case 4:
					System.out.println("Enter New City");
					person.setCity(sc.next());
					break;
				case 5:
					System.out.println("Enter New State");
					person.setState(sc.next());
					break;
				case 6:
					System.out.println("Enter New Zip");
					person.setZip(sc.next());
					break;
				case 7:
					System.out.println("Enter New Phone");
					person.setPhone(sc.next());
					break;
				case 8:
					System.out.println("Enter New Email");
					person.setEmail(sc.next());
					break;
				default:
					System.out.println("Invalid Input");
				}
			}
			hashmap.put(enterName, person);
			System.out.println(hashmap);
		}
	}

	/**
	 * UC4
	 * 
	 * @deleteContact This is method for UC4 To removes person from Hashmap
	 *                according to first name.
	 */
	private void deleteContact() {
		System.out.println("Enter First name of contact to delete it ");
		String enteredName = sc.next();
		Set<String> Keys = hashmap.keySet();
		for (String i : Keys) {
			if (i.equals(enteredName)) {
				hashmap.remove(i);
				System.out.println("Person removed from Address book");
			} else
				System.out.println("Person not found");
		}

	}

	private void showDetails() {
		System.out.println(hashmap);
	}

	/**
	 * @main This is main method of Class
	 */
	public static void main(String[] args) {

		System.out.println("Welcome To Address Book Program");
		AddressBookMain obj = new AddressBookMain();
		boolean isExit = false;
		while (!isExit) {
			System.out.println("Emter Option \n1.addContact\n2.editContact\n3.deleteContact\n4.showDetails\n5.Exit");
			int userInput = sc.nextInt();
			switch (userInput) {
			case 1:
				obj.addContact();

				break;
			case 2:
				obj.editContact();
				break;
			case 3:
				obj.deleteContact();
			case 4:
				obj.showDetails();
			case 5:
				isExit = true;
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
	}
}
