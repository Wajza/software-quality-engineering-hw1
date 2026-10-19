package edu.kfupm.marketplace;

public class App {
    public static void main(String[] args) {
        MarketplaceManager marketplace = new MarketplaceManager();
        User buyer = new User(); buyer.setId("U1"); buyer.setName("Sara");
        User seller = new User(); seller.setId("U2"); seller.setName("Mona");
        Product book = new Product(); book.setId("P1"); book.setTitle("Software Engineering Book"); book.setPrice(180); book.setQuantity(5);
        marketplace.users().add(buyer); marketplace.users().add(seller); marketplace.products().add(book);
        System.out.println(marketplace.processOrder(buyer, seller, book, 1, "STUDENT10"));
        System.out.println(marketplace.report1());
    }
}
