import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> walletItems;
//    private ArrayList<DebitCard> debitCards;
//    private ArrayList<LoyaltyCard> loyaltyCards;
//    private ArrayList<Ticket> tickets;

    public Wallet(String name) {
        this.name = name;
        this.walletItems = new ArrayList<IScan>();
//        this.debitCards = new ArrayList<DebitCard>();
//        this.loyaltyCards = new ArrayList<LoyaltyCard>();
//        this.tickets = new ArrayList<Ticket>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.walletItems.size();
//        return this.creditCards.size() + this.debitCards.size() + this.loyaltyCards.size() + this.tickets.size();
    }

    public void addItem(IScan item) {
        this.walletItems.add(item);
    }

//    public void addItem(DebitCard item) {
//        this.debitCards.add(item);
//    }
//
//    public void addItem(LoyaltyCard item) {
//        this.loyaltyCards.add(item);
//    }
//
//    public void addItem(Ticket item) {
//        this.tickets.add(item);
//    }
}
