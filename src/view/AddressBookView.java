package com.addressbook.view;

import com.addressbook.model.Contact;

import java.util.List;

public class AddressBookView {
    public void displayMenu() {
        System.out.println("\nAddress Book");
        System.out.println("1. Add Contact");
        System.out.println("2. View All Contacts");
        System.out.println("3. Search Contact");
        System.out.println("4. Delete Contact");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public void displayContacts(List<Contact> contacts) {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("\nContacts:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
