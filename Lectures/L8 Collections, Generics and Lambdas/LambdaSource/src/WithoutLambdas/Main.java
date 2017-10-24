package WithoutLambdas;

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

        List<Contact> contactsWithoutPhone = filterContactsWithoutPhone(contacts);

        System.out.println("Contacts Without Phone");

        for (Contact contact : contactsWithoutPhone) {
            System.out.println(contact);
        }//end for

        System.out.println("");
        
        List<Contact> contactsWithoutEmail = filterContactsWithoutEmail(contacts);

        System.out.println("Contacts Without Email");

        for (Contact contact : contactsWithoutEmail) {
            System.out.println(contact);
        }//end for

    }//end Main

    public List<Contact> filterContactsWithoutPhone(List<Contact> list) {
        List<Contact> filteredContacts = new ArrayList();

        for (Contact c : list) {

            if (c.getPhone() == null) {
                filteredContacts.add(c);
            }//end if

        }//end for

        return filteredContacts;
    }//end filterContactsWithoutPhone

    public List<Contact> filterContactsWithoutEmail(List<Contact> list) {
        List<Contact> filteredContacts = new ArrayList();

        for (Contact c : list) {

            if (c.getEmail() == null) {
                filteredContacts.add(c);
            }//end if

        }//end for

        return filteredContacts;
    }//end filterContactsWithoutEmail
    
}//end class
