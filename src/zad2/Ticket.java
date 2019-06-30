package zad2;

public class Ticket {
    private String eventName;
    private Address adress;
    private TicketType type;
    private double price;
    private double discount;

    public Ticket(String eventName, Address adress, TicketType type, double price, double discount) {
        this.eventName = eventName;
        this.adress = adress;
        this.type = type;
        this.price = price;
        this.discount = discount;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public TicketType getType() {
        return type;
    }

    public void setType(TicketType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
