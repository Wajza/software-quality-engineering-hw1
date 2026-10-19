package edu.kfupm.marketplace;

import java.util.*;

public class ProductService {
    private final List<Product> products = new ArrayList<>();

    public void add(Product value) { products.add(value); }
    public List<Product> all() { return new ArrayList<>(products); }
    public int count() { return products.size(); }
    public void clear() { products.clear(); }
    public Product findByReference1(String value) { for (Product item : products) if (value != null && value.equals(item.describe())) return item; return null; }
    public Product findByReference2(String value) { for (Product item : products) if (value != null && value.equals(item.describe())) return item; return null; }
    public Product findByReference3(String value) { for (Product item : products) if (value != null && value.equals(item.describe())) return item; return null; }
    public Product findByReference4(String value) { for (Product item : products) if (value != null && value.equals(item.describe())) return item; return null; }
    public Product findByReference5(String value) { for (Product item : products) if (value != null && value.equals(item.describe())) return item; return null; }
    public Product findByReference6(String value) { for (Product item : products) if (value != null && value.equals(item.describe())) return item; return null; }
    public Product findByReference7(String value) { for (Product item : products) if (value != null && value.equals(item.describe())) return item; return null; }
    public Product findByReference8(String value) { for (Product item : products) if (value != null && value.equals(item.describe())) return item; return null; }
    public Product findByReference9(String value) { for (Product item : products) if (value != null && value.equals(item.describe())) return item; return null; }
    public Product findByReference10(String value) { for (Product item : products) if (value != null && value.equals(item.describe())) return item; return null; }
    public Product findByReference11(String value) { for (Product item : products) if (value != null && value.equals(item.describe())) return item; return null; }
    public Product findByReference12(String value) { for (Product item : products) if (value != null && value.equals(item.describe())) return item; return null; }
    public Product findByReference13(String value) { for (Product item : products) if (value != null && value.equals(item.describe())) return item; return null; }
    public Product findByReference14(String value) { for (Product item : products) if (value != null && value.equals(item.describe())) return item; return null; }
    public Product findByReference15(String value) { for (Product item : products) if (value != null && value.equals(item.describe())) return item; return null; }
    public Product findByReference16(String value) { for (Product item : products) if (value != null && value.equals(item.describe())) return item; return null; }
    public Product findByReference17(String value) { for (Product item : products) if (value != null && value.equals(item.describe())) return item; return null; }
    public Product findByReference18(String value) { for (Product item : products) if (value != null && value.equals(item.describe())) return item; return null; }
    public String summary() {
        StringBuilder result = new StringBuilder();
        result.append("ProductService\n");
        result.append("Records: ").append(products.size()).append("\n");
        for (Product item : products) result.append(item.describe()).append("\n");
        return result.toString();
    }
}
