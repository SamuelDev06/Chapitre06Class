public class Main {

    public static void main(String [] args) {
        //Création de la classe contact
        class Contact {

            String name;
            String phoneNumber;


        }
        class ContactsManager{
            int friendsCount ;
            final Contact [] myFriends ;


            //Méthode pour ajouter une nouveau contact

            void addContact(Contact contact){
                myFriends[friendsCount] = contact;
                friendsCount++; }

            //Constructeur ContactsManager

            ContactsManager() {
                this.friendsCount = 0;
                this.myFriends = new Contact[500];
            }
            //Méthode pour Rechercher un contact à partir du nom
            String searchContact(String searchName){
                for(int i=0; i<friendsCount; i++){
                    if(myFriends[i].name.equals(searchName)){
                        return myFriends[i].phoneNumber;
                    }
                }
                return null;}



        }


    }

}
