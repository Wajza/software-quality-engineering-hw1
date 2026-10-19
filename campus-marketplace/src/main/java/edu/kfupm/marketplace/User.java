package edu.kfupm.marketplace;

public class User {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String role;
    private boolean active;
    private String address;
    private String joinedDate;
    private double rating;
    private int warnings;

    public User() {}

    public String getId() { return id; }
    public void setId(String value) { this.id = value; }
    public String getName() { return name; }
    public void setName(String value) { this.name = value; }
    public String getEmail() { return email; }
    public void setEmail(String value) { this.email = value; }
    public String getPhone() { return phone; }
    public void setPhone(String value) { this.phone = value; }
    public String getRole() { return role; }
    public void setRole(String value) { this.role = value; }
    public boolean getActive() { return active; }
    public void setActive(boolean value) { this.active = value; }
    public String getAddress() { return address; }
    public void setAddress(String value) { this.address = value; }
    public String getJoinedDate() { return joinedDate; }
    public void setJoinedDate(String value) { this.joinedDate = value; }
    public double getRating() { return rating; }
    public void setRating(double value) { this.rating = value; }
    public int getWarnings() { return warnings; }
    public void setWarnings(int value) { this.warnings = value; }

    public String describe() {
        return "User:" + String.valueOf(id);
    }
}
