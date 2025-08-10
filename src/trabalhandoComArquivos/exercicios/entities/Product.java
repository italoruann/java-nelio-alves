package trabalhandoComArquivos.exercicios.entities;

import java.util.Objects;

public record Product(String name, Double price, Integer quantity) {

    // Exigir que os parâmetros NÃO sejam nulos
    public Product {
        Objects.requireNonNull(name, "O nome do produto não pode ser nulo");
        Objects.requireNonNull(price, "O preço do produto não pode ser nulo");
        Objects.requireNonNull(quantity, "A quantidade do produto não pode ser nulo");
    }

    public Double totalValue() {
        return price * quantity;
    }
}
