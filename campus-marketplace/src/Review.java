package edu.kfupm.marketplace;

public class Review {
    private String id;
    private String productId;
    private String reviewerId;
    private String comment;
    private int stars;
    private boolean verified;
    private String date;
    private int helpfulVotes;
    private boolean reported;
    private String reply;

    public Review() {}

    public String getId() { return id; }
    public void setId(String value) { this.id = value; }
    public String getProductId() { return productId; }
    public void setProductId(String value) { this.productId = value; }
    public String getReviewerId() { return reviewerId; }
    public void setReviewerId(String value) { this.reviewerId = value; }
    public String getComment() { return comment; }
    public void setComment(String value) { this.comment = value; }
    public int getStars() { return stars; }
    public void setStars(int value) { this.stars = value; }
    public boolean getVerified() { return verified; }
    public void setVerified(boolean value) { this.verified = value; }
    public String getDate() { return date; }
    public void setDate(String value) { this.date = value; }
    public int getHelpfulVotes() { return helpfulVotes; }
    public void setHelpfulVotes(int value) { this.helpfulVotes = value; }
    public boolean getReported() { return reported; }
    public void setReported(boolean value) { this.reported = value; }
    public String getReply() { return reply; }
    public void setReply(String value) { this.reply = value; }

    public String describe() {
        return "Review:" + String.valueOf(id);
    }
}
