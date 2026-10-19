package edu.kfupm.marketplace;

import java.util.*;

public class UserService {
    private final List<User> users = new ArrayList<>();

    public void add(User value) { users.add(value); }
    public List<User> all() { return new ArrayList<>(users); }
    public int count() { return users.size(); }
    public void clear() { users.clear(); }
    public User findByReference1(String value) { for (User item : users) if (value != null && value.equals(item.describe())) return item; return null; }
    public User findByReference2(String value) { for (User item : users) if (value != null && value.equals(item.describe())) return item; return null; }
    public User findByReference3(String value) { for (User item : users) if (value != null && value.equals(item.describe())) return item; return null; }
    public User findByReference4(String value) { for (User item : users) if (value != null && value.equals(item.describe())) return item; return null; }
    public User findByReference5(String value) { for (User item : users) if (value != null && value.equals(item.describe())) return item; return null; }
    public User findByReference6(String value) { for (User item : users) if (value != null && value.equals(item.describe())) return item; return null; }
    public User findByReference7(String value) { for (User item : users) if (value != null && value.equals(item.describe())) return item; return null; }
    public User findByReference8(String value) { for (User item : users) if (value != null && value.equals(item.describe())) return item; return null; }
    public User findByReference9(String value) { for (User item : users) if (value != null && value.equals(item.describe())) return item; return null; }
    public User findByReference10(String value) { for (User item : users) if (value != null && value.equals(item.describe())) return item; return null; }
    public User findByReference11(String value) { for (User item : users) if (value != null && value.equals(item.describe())) return item; return null; }
    public User findByReference12(String value) { for (User item : users) if (value != null && value.equals(item.describe())) return item; return null; }
    public User findByReference13(String value) { for (User item : users) if (value != null && value.equals(item.describe())) return item; return null; }
    public User findByReference14(String value) { for (User item : users) if (value != null && value.equals(item.describe())) return item; return null; }
    public User findByReference15(String value) { for (User item : users) if (value != null && value.equals(item.describe())) return item; return null; }
    public User findByReference16(String value) { for (User item : users) if (value != null && value.equals(item.describe())) return item; return null; }
    public User findByReference17(String value) { for (User item : users) if (value != null && value.equals(item.describe())) return item; return null; }
    public User findByReference18(String value) { for (User item : users) if (value != null && value.equals(item.describe())) return item; return null; }
    public String summary() {
        StringBuilder result = new StringBuilder();
        result.append("UserService\n");
        result.append("Records: ").append(users.size()).append("\n");
        for (User item : users) result.append(item.describe()).append("\n");
        return result.toString();
    }
}
