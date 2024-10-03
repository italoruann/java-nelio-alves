package introducaoPoo.entities;

// Classe pode conter membros: atributos e métodos
//  A classe também pode ter outros recursos como: Construtores, sobrecarga, encapsulamento, herança e polimorfismo.
// Exemplos:
// Entidades: Produto, Cliente, Contribuinte
// Serviços: ProdutoService, ClienteService, EmailService, StorageService
// Controladores: ProdutoController, ClienteController
// Utilitarios: Calculadora, Compactador
// Outros: Views, repositórios, gerenciadores e etc.

public class Triangle {
    // Atributos
    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
