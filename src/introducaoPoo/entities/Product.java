package introducaoPoo.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity; // Nota que, o atributo é igual do parametro, então temos uma ambiguidade.
        // O this significa que eu to chamando o atributo com a palavra reservada this.
    }

    public String toString() { // Converter objeto para String. é um metodo da classe Object que vou sobrescrever os dados e ter minha própria toString()
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
