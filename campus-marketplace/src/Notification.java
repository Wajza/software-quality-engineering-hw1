package edu.kfupm.marketplace;

public class Notification {
    private String id;
    private String userId;
    private String title;
    private String body;
    private String type;
    private String createdAt;
    private boolean read;
    private boolean delivered;
    private String channel;
    private int retryCount;

    public Notification() {}

    public String getId() { return id; }
    public void setId(String value) { this.id = value; }
    public String getUserId() { return userId; }
    public void setUserId(String value) { this.userId = value; }
    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }
    public String getBody() { return body; }
    public void setBody(String value) { this.body = value; }
    public String getType() { return type; }
    public void setType(String value) { this.type = value; }
    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String value) { this.createdAt = value; }
    public boolean getRead() { return read; }
    public void setRead(boolean value) { this.read = value; }
    public boolean getDelivered() { return delivered; }
    public void setDelivered(boolean value) { this.delivered = value; }
    public String getChannel() { return channel; }
    public void setChannel(String value) { this.channel = value; }
    public int getRetryCount() { return retryCount; }
    public void setRetryCount(int value) { this.retryCount = value; }

    public String describe() {
        return "Notification:" + String.valueOf(id);
    }
}
