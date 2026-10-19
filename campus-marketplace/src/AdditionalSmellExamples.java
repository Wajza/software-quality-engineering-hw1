package edu.kfupm.marketplace;

import java.util.ArrayList;
import java.util.List;

/** Additional intentionally smelly examples for the SWE 439 experiment. */
public class AdditionalSmellExamples {
    private final List<String> audit = new ArrayList<>();

    // LONG PARAMETER LIST and DATA CLUMPS: address data is repeatedly passed separately.
    public User registerStudent(String id, String name, String email, String phone,
                                String street, String city, String postcode,
                                String college, String major, String year,
                                String emergencyName, String emergencyPhone) {
        User user = new User();
        user.setId(id); user.setName(name); user.setEmail(email); user.setPhone(phone);
        user.setAddress(street + ", " + city + ", " + postcode);
        audit.add(college + " " + major + " " + year + " emergency=" + emergencyName + emergencyPhone);
        return user;
    }

    // PRIMITIVE OBSESSION: currency, status, category, and delivery state are raw strings.
    public double calculateFee(double amount, String currency, String category,
                               String deliveryStatus, String paymentStatus) {
        double fee = amount * 0.02;
        if ("SAR".equals(currency)) fee += 1.0;
        if ("ELECTRONICS".equals(category)) fee += 10.0;
        if ("EXPRESS".equals(deliveryStatus)) fee += 15.0;
        if ("PENDING".equals(paymentStatus)) fee += 2.0;
        return fee;
    }

    // FEATURE ENVY: this method uses another object's data repeatedly and little of its own.
    public String describeProductForBuyer(Product product, User buyer) {
        String result = product.getTitle() + " - " + product.getDescription();
        result += " category=" + product.getCategory();
        result += " condition=" + product.getCondition();
        result += " price=" + product.getPrice();
        result += " quantity=" + product.getQuantity();
        result += " buyer=" + buyer.getName() + " email=" + buyer.getEmail();
        return result;
    }

    // MESSAGE CHAIN: the caller must navigate through several objects to obtain information.
    public String sellerEmail(MarketplaceManager manager, String productId) {
        Product product = manager.products().findByReference1(productId);
        if (product == null) return "";
        User seller = manager.users().findByReference1(product.getSellerId());
        return seller == null ? "" : seller.getEmail().trim().toLowerCase();
    }

    // MIDDLE MAN: these methods add no meaningful behavior and only delegate.
    public void addUser(MarketplaceManager manager, User user) { manager.users().add(user); }
    public void addProduct(MarketplaceManager manager, Product product) { manager.products().add(product); }
    public void addOrder(MarketplaceManager manager, Order order) { manager.orders().add(order); }
    public String userSummary(MarketplaceManager manager) { return manager.users().summary(); }
    public String productSummary(MarketplaceManager manager) { return manager.products().summary(); }

    // SHOTGUN SURGERY: one tax-rate change is duplicated in several methods.
    public double orderTax(double subtotal) { return subtotal * 0.15; }
    public double invoiceTax(double subtotal) { return subtotal * 0.15; }
    public double refundTax(double subtotal) { return subtotal * 0.15; }
    public String taxLabel() { return "VAT 15%"; }
    public String taxReportLine() { return "Tax rate used by report: 15%"; }

    // DIVERGENT CHANGE: this class mixes unrelated reasons to change.
    public void updatePassword(User user, String password) { audit.add("password changed for " + user.getId() + password.length()); }
    public void updateProductPrice(Product product, double price) { product.setPrice(price); audit.add("price changed"); }
    public void sendPromotion(User user, String message) { audit.add("promotion to " + user.getEmail() + message); }
    public String formatFinancialReport(double total) { return "FINANCIAL REPORT: " + total; }

    // LAZY CLASS: this wrapper has no meaningful responsibility of its own.
    public static class ProductCounter {
        private final ProductService products;
        public ProductCounter(ProductService products) { this.products = products; }
        public int count() { return products.count(); }
    }

    // DATA CLASS: the object only carries values and exposes no domain behavior.
    public static class SearchCriteria {
        private String keyword; private String category; private double minimumPrice;
        private double maximumPrice; private String condition; private String sellerId;
        public String getKeyword() { return keyword; } public void setKeyword(String v) { keyword = v; }
        public String getCategory() { return category; } public void setCategory(String v) { category = v; }
        public double getMinimumPrice() { return minimumPrice; } public void setMinimumPrice(double v) { minimumPrice = v; }
        public double getMaximumPrice() { return maximumPrice; } public void setMaximumPrice(double v) { maximumPrice = v; }
        public String getCondition() { return condition; } public void setCondition(String v) { condition = v; }
        public String getSellerId() { return sellerId; } public void setSellerId(String v) { sellerId = v; }
    }

    // INAPPROPRIATE INTIMACY: the method reaches into another object instead of using a domain operation.
    public boolean canBuy(User buyer, Product product) {
        return buyer.getActive() && product.getAvailable() && product.getQuantity() > 0 && product.getPrice() >= 0;
    }

    // SPECULATIVE GENERALITY: unused generic workflow adds abstraction without a current need.
    public <T> T convertForFutureIntegration(T value, String format, String destination, String version) {
        audit.add("conversion=" + format + " destination=" + destination + " version=" + version);
        return value;
    }
}
