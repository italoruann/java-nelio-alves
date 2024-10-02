package herancaPolimorfismo.metodosAbstratos.models.entities;

import herancaPolimorfismo.metodosAbstratos.models.entities.enums.Cor;

// Metodos abstros -> metodos precisam ser abstratos quando a classe é generica demais conter sua implementação
// São metodos que não possuem implementação.
// Se uma classe possuir um metodo abstrato, automaticamente ela precisa ser uma classe abstrata, caso contrário ocorrerá erro de sintaxe.
// Notação UML -> Itálico.
public abstract class Forma {

    private Cor cor; // associação

    public Forma(Cor cor) {
        this.cor = cor;
    }


    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    // Aqui é uma iniciação de um metodo abstrato. Ele não precisa ser implementado nada. As subclasses que irão implementar o metodo utilizando polimorfismo(sobescrita)
    public abstract Double area();
}
