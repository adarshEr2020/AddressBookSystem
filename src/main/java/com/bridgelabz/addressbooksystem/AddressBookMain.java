package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		
		//creating scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to address book system :");

		AddressBook addressBook = new AddressBook();
		addressBook.add();
		
		System.out.println("You have entered data in address book");
		System.out.println(addressBook.contact);

		System.out.println("Enter 1 . Edit \n 2 . Delete \n press any key for exit");
		int op = sc.nextInt();
		sc.close();
		
		//ability to select choice
		switch (op) {
		case 1:

		addressBook.editContact();
			System.out.println("You have Entered following data");
			System.out.println(addressBook.contact);
			System.out.println("Thank for Using Address book");
			break;

		default:
			System.out.println("Thanks for using \n you have address" + addressBook.contact);

			System.exit(0);
			break;

		}

	}
}

