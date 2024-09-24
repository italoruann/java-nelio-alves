package enumeracoesComposicoes;

import enumeracoesComposicoes.entities.Pedido;
import enumeracoesComposicoes.entities.enums.StatusDoPedido;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // É um tipo especial que serve para especificar de forma literal um
        //conjunto de constantes relacionadas

        // A classe é um tipo especial, a interface que vimos em List<tipo> tbm é um tipo especial e vem o Enum que vamos ver agora.
        // Palavra chave em Java: enum
        // •Vantagem: melhor semântica, código mais legível e auxiliado pelo compilador

        Pedido pedido = new Pedido(1000, new Date(), StatusDoPedido.PAGAMENTO_PENDENTE);
        System.out.println(pedido);

        // Obs: É importante o programador converter String para enum, pois, em um sistema real, o usuário vai entrar em forma de String
        StatusDoPedido status1 = StatusDoPedido.ENVIADO;
        StatusDoPedido status2 = StatusDoPedido.valueOf("ENVIADO"); // Convertendo a String ENVIADO para um valor enum e atribuindo a variável
        System.out.println(status1);
        System.out.println(status2);
    }
}
