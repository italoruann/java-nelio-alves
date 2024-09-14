package construtoresThisSobrecargaEncapsulamento.construtores.entities;

public class Product {
    public String name; // padrão: null
    public double price; // padrão: 0.0
    public int quantity; // padrão: 0

    // Por padrão, instanciamos a classe Product com valores padrões como mencionados nos atributos
    // Criando um construtor, isso irá mudar, pois, estamos obrigando ao desenvolvedor preencher os parametros do construtor

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity-= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}