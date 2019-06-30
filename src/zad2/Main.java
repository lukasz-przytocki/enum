package zad2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket("Opole2019", new Address("Wroclaw", "Zaporoska", "25-423", "3C"), TicketType.ONLINE, 200, 0.9));
        tickets.add(new Ticket("Mrągowo", new Address("Katowice", "Jana Pawła", "35-123", "23C"), TicketType.GIFT, 200, 0.9));
        tickets.add(new Ticket("Kołobrzeg2019", new Address("Kraków", "Mickiewicza", "15-023", "10"), TicketType.STANDARD, 200, 0.9));

        for (Ticket ticket:tickets) {
            double price = finalePrice(ticket);
            System.out.println("Total price for: " +ticket.getEventName()+" is: "+ticket.getType()+" " +price);

        }

    }


    static double finalePrice(Ticket ticket){
        switch (ticket.getType()){
            case ONLINE:
                return price(ticket);
            case STANDARD:
                return price(ticket)+5.0;
            case GIFT:
                return price(ticket)+(0.05*price(ticket));
            default:
                return 0;
        }
    }

    static double price(Ticket ticket){
        double totalprice = (ticket.getPrice()*(1-(ticket.getDiscount()/100)));
        return totalprice;
    }
}
