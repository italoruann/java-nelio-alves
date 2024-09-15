package construtoresThisSobrecargaEncapsulamento.encapsulamento.entities;

// Encapsulamento é uma forma de proteger nossos atributos e acessar eles pelos metodos getters e setters
public class Product {
    private String productName;
    private double priceProduct;
    private int quantityProduct;

    // Construtor
    public Product(String productName, double priceProduct) {
        this.productName = productName;
        this.priceProduct = priceProduct;
    }

    // Getters e setters -> productName
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getters e setters -> priceProduct
    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    // Getters -> quantityProduct (Não pode ter set na quantidade do produto para evitar problemas. Iremos adicionar e remover pelos metodos addProduct e removeProducts
    public int getQuantityProduct() {
        return quantityProduct;
    }

    // Metodos
    public double totalValueInStock() {
        return priceProduct * quantityProduct;
    }

    public void addProducts(int quantityProduct) {
        this.quantityProduct += quantityProduct;
    }
    public void removeProducts(int quantityProduct) {
        this.quantityProduct -= quantityProduct;
    }

    // To String
    public String toString() {
        return productName + " " + String.format("R$ %.2f", priceProduct) + " " + quantityProduct + " unidades" + " " + String.format("Total R$ %.2f", totalValueInStock());
    }

}
