package hashset_demo;

import java.util.HashSet;

public class GuestRegistrationSystem {
    HashSet<String> guests = new HashSet<>();

    public void registerGuest(String name){
        if(guests.add(name)){
            System.out.println(name + " registered");
        }else{
            System.out.println(name + " is already registered");
        }
    }

    public void removeGuest(String name){
        if(guests.remove(name)){
            System.out.println(name + " has been removed");
        }else{
            System.out.println(name + " was not found in guests list");
        }
    }

    public void listGuests(){
        System.out.println("Registered Guests:");
        for (String guest: guests){
            System.out.println(guest);
        }
    }

    public static void main(String[] args) {
        GuestRegistrationSystem guestRegistrationSystem = new GuestRegistrationSystem();

        guestRegistrationSystem.registerGuest("John");
        guestRegistrationSystem.registerGuest("Peter");
        guestRegistrationSystem.registerGuest("John");

        guestRegistrationSystem.listGuests();

        guestRegistrationSystem.removeGuest("Peter");
        guestRegistrationSystem.listGuests();

    }
}
