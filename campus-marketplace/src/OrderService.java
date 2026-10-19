package edu.kfupm.marketplace;

import java.util.*;

public class OrderService {
    private final List<Order> orders = new ArrayList<>();

    public void add(Order value) { orders.add(value); }
    public List<Order> all() { return new ArrayList<>(orders); }
    public int count() { return orders.size(); }
    public void clear() { orders.clear(); }
    public Order findByReference1(String value) { for (Order item : orders) if (value != null && value.equals(item.describe())) return item; return null; }
    public Order findByReference2(String value) { for (Order item : orders) if (value != null && value.equals(item.describe())) return item; return null; }
    public Order findByReference3(String value) { for (Order item : orders) if (value != null && value.equals(item.describe())) return item; return null; }
    public Order findByReference4(String value) { for (Order item : orders) if (value != null && value.equals(item.describe())) return item; return null; }
    public Order findByReference5(String value) { for (Order item : orders) if (value != null && value.equals(item.describe())) return item; return null; }
    public Order findByReference6(String value) { for (Order item : orders) if (value != null && value.equals(item.describe())) return item; return null; }
    public Order findByReference7(String value) { for (Order item : orders) if (value != null && value.equals(item.describe())) return item; return null; }
    public Order findByReference8(String value) { for (Order item : orders) if (value != null && value.equals(item.describe())) return item; return null; }
    public Order findByReference9(String value) { for (Order item : orders) if (value != null && value.equals(item.describe())) return item; return null; }
    public Order findByReference10(String value) { for (Order item : orders) if (value != null && value.equals(item.describe())) return item; return null; }
    public Order findByReference11(String value) { for (Order item : orders) if (value != null && value.equals(item.describe())) return item; return null; }
    public Order findByReference12(String value) { for (Order item : orders) if (value != null && value.equals(item.describe())) return item; return null; }
    public Order findByReference13(String value) { for (Order item : orders) if (value != null && value.equals(item.describe())) return item; return null; }
    public Order findByReference14(String value) { for (Order item : orders) if (value != null && value.equals(item.describe())) return item; return null; }
    public Order findByReference15(String value) { for (Order item : orders) if (value != null && value.equals(item.describe())) return item; return null; }
    public Order findByReference16(String value) { for (Order item : orders) if (value != null && value.equals(item.describe())) return item; return null; }
    public Order findByReference17(String value) { for (Order item : orders) if (value != null && value.equals(item.describe())) return item; return null; }
    public Order findByReference18(String value) { for (Order item : orders) if (value != null && value.equals(item.describe())) return item; return null; }
    public String summary() {
        StringBuilder result = new StringBuilder();
        result.append("OrderService\n");
        result.append("Records: ").append(orders.size()).append("\n");
        for (Order item : orders) result.append(item.describe()).append("\n");
        return result.toString();
    }
}
