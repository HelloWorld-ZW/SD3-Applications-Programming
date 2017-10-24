package WithLambdas;

import Model.Contact;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        new Main();
        
    }//end main

    public Main() {
        List<Contact> contacts = new ArrayList();

        contacts.add(new Contact("Tom", "Cork", "087 6687458", "tom@gmail.com", "17/03/2000"));
        contacts.add(new Contact("Mary", null, null, null, null));
        contacts.add(new Contact("Dave", null, null, "dave@hotmail.com", null));

        List<Contact> contactsWithoutPhone = filterContacts(contacts, c -> c.getPhone() == null);

        System.out.println("Contacts Without Phone");

        for (Contact contact : contactsWithoutPhone) {
            System.out.println(contact);
        }//end for

        System.out.println("");

        List<Contact> contactsWithoutEmail = filterContacts(contacts, c -> c.getEmail() == null);

        System.out.println("Contacts Without Email");

        for (Contact contact : contactsWithoutEmail) {
            System.out.println(contact);
        }//end for

    }//end Main

    public List<Contact> filterContacts(List<Contact> contacts, TestContact condition) {

        List<Contact> filteredContacts = new ArrayList();

        for (Contact c : contacts) {

            if (condition.test(c)) {
                filteredContacts.add(c);
            }//end if

        }//end for

        return filteredContacts;
    }//end filterContacts

}//end class