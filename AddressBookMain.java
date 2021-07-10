package com.bridgelabz;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
	private static Scanner sc = new Scanner(System.in);
	HashMap<String, Person> hashmap = new HashMap<>();

	public void addContact() {
		Person person = new Person();
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

	public static void main(String[] args) {
		System.out.println("Welcome To Address Book Program");
		AddressBookMain obj = new AddressBookMain();
		obj.addContact();
	}
}
