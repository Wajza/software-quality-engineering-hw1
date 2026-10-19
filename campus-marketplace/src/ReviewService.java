package edu.kfupm.marketplace;

import java.util.*;

public class ReviewService {
    private final List<Review> reviews = new ArrayList<>();

    public void add(Review value) { reviews.add(value); }
    public List<Review> all() { return new ArrayList<>(reviews); }
    public int count() { return reviews.size(); }
    public void clear() { reviews.clear(); }
    public Review findByReference1(String value) { for (Review item : reviews) if (value != null && value.equals(item.describe())) return item; return null; }
    public Review findByReference2(String value) { for (Review item : reviews) if (value != null && value.equals(item.describe())) return item; return null; }
    public Review findByReference3(String value) { for (Review item : reviews) if (value != null && value.equals(item.describe())) return item; return null; }
    public Review findByReference4(String value) { for (Review item : reviews) if (value != null && value.equals(item.describe())) return item; return null; }
    public Review findByReference5(String value) { for (Review item : reviews) if (value != null && value.equals(item.describe())) return item; return null; }
    public Review findByReference6(String value) { for (Review item : reviews) if (value != null && value.equals(item.describe())) return item; return null; }
    public Review findByReference7(String value) { for (Review item : reviews) if (value != null && value.equals(item.describe())) return item; return null; }
    public Review findByReference8(String value) { for (Review item : reviews) if (value != null && value.equals(item.describe())) return item; return null; }
    public Review findByReference9(String value) { for (Review item : reviews) if (value != null && value.equals(item.describe())) return item; return null; }
    public Review findByReference10(String value) { for (Review item : reviews) if (value != null && value.equals(item.describe())) return item; return null; }
    public Review findByReference11(String value) { for (Review item : reviews) if (value != null && value.equals(item.describe())) return item; return null; }
    public Review findByReference12(String value) { for (Review item : reviews) if (value != null && value.equals(item.describe())) return item; return null; }
    public Review findByReference13(String value) { for (Review item : reviews) if (value != null && value.equals(item.describe())) return item; return null; }
    public Review findByReference14(String value) { for (Review item : reviews) if (value != null && value.equals(item.describe())) return item; return null; }
    public Review findByReference15(String value) { for (Review item : reviews) if (value != null && value.equals(item.describe())) return item; return null; }
    public Review findByReference16(String value) { for (Review item : reviews) if (value != null && value.equals(item.describe())) return item; return null; }
    public Review findByReference17(String value) { for (Review item : reviews) if (value != null && value.equals(item.describe())) return item; return null; }
    public Review findByReference18(String value) { for (Review item : reviews) if (value != null && value.equals(item.describe())) return item; return null; }
    public String summary() {
        StringBuilder result = new StringBuilder();
        result.append("ReviewService\n");
        result.append("Records: ").append(reviews.size()).append("\n");
        for (Review item : reviews) result.append(item.describe()).append("\n");
        return result.toString();
    }
}
