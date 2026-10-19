package edu.kfupm.marketplace;

public class Order {
    private String id;
    private String buyerId;
    private String sellerId;
    private String productId;
    private int quantity;
    private double subtotal;
    private double discount;
    private double tax;
    private double total;
    private String status;

    public Order() {}

    public String getId() { return id; }
    public void setId(String value) { this.id = value; }
    public String getBuyerId() { return buyerId; }
    public void setBuyerId(String value) { this.buyerId = value; }
    public String getSellerId() { return sellerId; }
    public void setSellerId(String value) { this.sellerId = value; }
    public String getProductId() { return productId; }
    public void setProductId(String value) { this.productId = value; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int value) { this.quantity = value; }
    public double getSubtotal() { return subtotal; }
    public void setSubtotal(double value) { this.subtotal = value; }
    public double getDiscount() { return discount; }
    public void setDiscount(double value) { this.discount = value; }
    public double getTax() { return tax; }
    public void setTax(double value) { this.tax = value; }
    public double getTotal() { return total; }
    public void setTotal(double value) { this.total = value; }
    public String getStatus() { return status; }
    public void setStatus(String value) { this.status = value; }

    public String describe() {
        return "Order:" + String.valueOf(id);
    }
}
