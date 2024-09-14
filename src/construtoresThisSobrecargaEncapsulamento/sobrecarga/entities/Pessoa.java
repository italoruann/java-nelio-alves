package construtoresThisSobrecargaEncapsulamento.sobrecarga.entities;

public class Pessoa {
    public String nome;
    public int idade;
    public double altura;
    public double salario;

    // Vou criar o constructor
    public Pessoa(String nome, int idade, double altura, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.salario = salario;
    }

    // Agora vou fazer uma sobrecarga
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Então o q é sobrecarga? É você criar construtores com mesmo nome so que com parametros diferentes
    // Ou seja, vou estar sobrecarregando o mesmo Constructor

    public void adicionarSalario(double salario) {
        this.salario += salario;
    }

    public String toString() {
        return nome + " " + idade + " " + altura + " " + salario;
    }

}
