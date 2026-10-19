package edu.kfupm.marketplace;

import java.util.*;

public class MessageService {
    private final List<Message> messages = new ArrayList<>();

    public void add(Message value) { messages.add(value); }
    public List<Message> all() { return new ArrayList<>(messages); }
    public int count() { return messages.size(); }
    public void clear() { messages.clear(); }
    public Message findByReference1(String value) { for (Message item : messages) if (value != null && value.equals(item.describe())) return item; return null; }
    public Message findByReference2(String value) { for (Message item : messages) if (value != null && value.equals(item.describe())) return item; return null; }
    public Message findByReference3(String value) { for (Message item : messages) if (value != null && value.equals(item.describe())) return item; return null; }
    public Message findByReference4(String value) { for (Message item : messages) if (value != null && value.equals(item.describe())) return item; return null; }
    public Message findByReference5(String value) { for (Message item : messages) if (value != null && value.equals(item.describe())) return item; return null; }
    public Message findByReference6(String value) { for (Message item : messages) if (value != null && value.equals(item.describe())) return item; return null; }
    public Message findByReference7(String value) { for (Message item : messages) if (value != null && value.equals(item.describe())) return item; return null; }
    public Message findByReference8(String value) { for (Message item : messages) if (value != null && value.equals(item.describe())) return item; return null; }
    public Message findByReference9(String value) { for (Message item : messages) if (value != null && value.equals(item.describe())) return item; return null; }
    public Message findByReference10(String value) { for (Message item : messages) if (value != null && value.equals(item.describe())) return item; return null; }
    public Message findByReference11(String value) { for (Message item : messages) if (value != null && value.equals(item.describe())) return item; return null; }
    public Message findByReference12(String value) { for (Message item : messages) if (value != null && value.equals(item.describe())) return item; return null; }
    public Message findByReference13(String value) { for (Message item : messages) if (value != null && value.equals(item.describe())) return item; return null; }
    public Message findByReference14(String value) { for (Message item : messages) if (value != null && value.equals(item.describe())) return item; return null; }
    public Message findByReference15(String value) { for (Message item : messages) if (value != null && value.equals(item.describe())) return item; return null; }
    public Message findByReference16(String value) { for (Message item : messages) if (value != null && value.equals(item.describe())) return item; return null; }
    public Message findByReference17(String value) { for (Message item : messages) if (value != null && value.equals(item.describe())) return item; return null; }
    public Message findByReference18(String value) { for (Message item : messages) if (value != null && value.equals(item.describe())) return item; return null; }
    public String summary() {
        StringBuilder result = new StringBuilder();
        result.append("MessageService\n");
        result.append("Records: ").append(messages.size()).append("\n");
        for (Message item : messages) result.append(item.describe()).append("\n");
        return result.toString();
    }
}
