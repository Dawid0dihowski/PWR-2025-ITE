package pl.edu.pwr.dkocyla.np;

public class Product {
    // ===== ZADANIE 5: model pojedynczego produktu do deserializacji JSON-a =====
    // Reprezentuje pojedynczą pozycję zamówienia odczytaną z pliku JSON.
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private String code;
    private int quantity;
    private String unit;
}
