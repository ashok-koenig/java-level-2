package arraylist_demo;

import java.util.ArrayList;

public class TicketBookingSystem {
    ArrayList<MovieTicket> tickets = new ArrayList<>();

    public void bookTicket(MovieTicket ticket){
        tickets.add(ticket);
        System.out.println("Ticket Booked: "+ ticket);
    }

    public void showAllTickets(){
        System.out.println("All Booked tickets");
        for (MovieTicket ticket: tickets){
            System.out.println(ticket);
        }
    }

    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem();
        bookingSystem.bookTicket(new MovieTicket(1, "Avengers", "A05"));
        bookingSystem.bookTicket(new MovieTicket(2, "The Lion King", "D07"));

        bookingSystem.showAllTickets();
    }
}
