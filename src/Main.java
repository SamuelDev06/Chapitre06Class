//Création de la classe contact
class Contact {
    String name;
    String phoneNumber;
}

class ContactsManager {
    int friendsCount;
    Contact[] myFriends;

    //Constructeur ContactsManager
    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    //Méthode pour ajouter une nouveau contact
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    //Méthode pour Rechercher un contact à partir du nom
    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i]; // Retourne l'objet Contact comme demandé par l'énoncé
            }
        }
        return null;
    }
}

public class Main {

    public static void main(String[] args) {

        //Instanciation des classes contactsManager et Contact
        ContactsManager myContactsManager = new ContactsManager();
        Contact myContact = new Contact();

        //Processus d'ajout de contact
        myContact.name = "Issa";
        myContact.phoneNumber = "0710480407";
        myContactsManager.addContact(myContact);

        //Reprise du processus pour 4 Contacts
        Contact contact2 = new Contact();
        contact2.name = "ALLANI";
        contact2.phoneNumber = "0712536534";
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.name = "BROU";
        contact3.phoneNumber = "0712536534";
        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact();
        contact4.name = "KOUAKOU";
        contact4.phoneNumber = "0797135915";
        myContactsManager.addContact(contact4);

        Contact contact5 = new Contact();
        contact5.name = "BAH";
        contact5.phoneNumber = "0595347885";
        myContactsManager.addContact(contact5);

        //Affichage du numéro de téléphone correspondant au nom recherché
        System.out.println("le numéro correspondant au contact recherché est :" + myContactsManager.searchContact("ALLANI").phoneNumber);
    }
}