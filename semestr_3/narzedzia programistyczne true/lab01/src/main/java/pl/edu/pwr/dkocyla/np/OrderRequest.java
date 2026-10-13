package pl.edu.pwr.dkocyla.np;

import java.util.List;

public class OrderRequest {
    // ===== ZADANIE 5: model kompletnego żądania złożenia zamówienia =====
    // Reprezentuje całe żądanie: dane klienta oraz listę zamawianych produktów.
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    private Customer customer;
    private List<Product> products;
}
