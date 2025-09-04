package arraylist_demo;

public class MovieTicket {
    private int ticketId;
    private String movieName;
    private String seatNo;

    public MovieTicket(int ticketId, String movieName, String seatNo) {
        this.ticketId = ticketId;
        this.movieName = movieName;
        this.seatNo = seatNo;
    }

    public String toString() {
        return "MovieTicket{" +
                "ticketId=" + ticketId +
                ", movieName='" + movieName + '\'' +
                ", seatNo='" + seatNo + '\'' +
                '}';
    }
}
