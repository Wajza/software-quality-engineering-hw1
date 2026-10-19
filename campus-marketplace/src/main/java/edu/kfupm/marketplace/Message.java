package edu.kfupm.marketplace;

public class Message {
    private String id;
    private String senderId;
    private String receiverId;
    private String subject;
    private String body;
    private String sentAt;
    private boolean read;
    private boolean archived;
    private String priority;
    private String attachment;

    public Message() {}

    public String getId() { return id; }
    public void setId(String value) { this.id = value; }
    public String getSenderId() { return senderId; }
    public void setSenderId(String value) { this.senderId = value; }
    public String getReceiverId() { return receiverId; }
    public void setReceiverId(String value) { this.receiverId = value; }
    public String getSubject() { return subject; }
    public void setSubject(String value) { this.subject = value; }
    public String getBody() { return body; }
    public void setBody(String value) { this.body = value; }
    public String getSentAt() { return sentAt; }
    public void setSentAt(String value) { this.sentAt = value; }
    public boolean getRead() { return read; }
    public void setRead(boolean value) { this.read = value; }
    public boolean getArchived() { return archived; }
    public void setArchived(boolean value) { this.archived = value; }
    public String getPriority() { return priority; }
    public void setPriority(String value) { this.priority = value; }
    public String getAttachment() { return attachment; }
    public void setAttachment(String value) { this.attachment = value; }

    public String describe() {
        return "Message:" + String.valueOf(id);
    }
}
