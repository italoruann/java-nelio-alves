package models.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

    private LocalDate manufacuDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufacuDate) {
        super(name, price);
        this.manufacuDate = manufacuDate;
    }

    public LocalDate getManufacuDate() {
        return manufacuDate;
    }

    public void setManufacuDate(LocalDate manufacuDate) {
        this.manufacuDate = manufacuDate;
    }

    @Override
    public final String priceTag() {
        return getName() + " (used) $ " + String.format("%.2f", getPrice()) + " (Manufacture date: " + manufacuDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
    }

}
