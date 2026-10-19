package edu.kfupm.marketplace;

public class Product {
    private String id;
    private String sellerId;
    private String title;
    private String description;
    private String category;
    private String condition;
    private double price;
    private int quantity;
    private boolean available;
    private String createdDate;

    public Product() {}

    public String getId() { return id; }
    public void setId(String value) { this.id = value; }
    public String getSellerId() { return sellerId; }
    public void setSellerId(String value) { this.sellerId = value; }
    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }
    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }
    public String getCategory() { return category; }
    public void setCategory(String value) { this.category = value; }
    public String getCondition() { return condition; }
    public void setCondition(String value) { this.condition = value; }
    public double getPrice() { return price; }
    public void setPrice(double value) { this.price = value; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int value) { this.quantity = value; }
    public boolean getAvailable() { return available; }
    public void setAvailable(boolean value) { this.available = value; }
    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String value) { this.createdDate = value; }

    public String describe() {
        return "Product:" + String.valueOf(id);
    }
}
