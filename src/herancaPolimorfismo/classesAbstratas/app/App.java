package herancaPolimorfismo.classesAbstratas.app;

import herancaPolimorfismo.classesAbstratas.models.entities.Conta;
import herancaPolimorfismo.classesAbstratas.models.entities.ContaEmpresarial;
import herancaPolimorfismo.classesAbstratas.models.entities.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Conta> contaList = new ArrayList<>();

        // -> Nota que, a nossa classe Conta é abstrata e não pode ser instanciada, porem, ela pode ser definida como tipo.
        // -> Vale ressaltar que conta poupança e conta empresarial é uma Conta, ou seja, o tipo Conta vai ser subclasses como conta poupança e conta empresarial.
        contaList.add(new ContaPoupanca(1002, "Carlos", 7000.00, 0.01));
        contaList.add(new ContaEmpresarial(1004, "Bruno", 9000.00, 400.00));
        contaList.add(new ContaPoupanca(1005, "Italo", 3000.00, 0.01));
        contaList.add(new ContaEmpresarial(1009, "Thiago", 6000.00, 500.00));

        // Eu posso por exemplo pegar todos os saldos das contas e somar.
        double soma = 0.0;
        for (Conta conta : contaList) {
            soma += conta.getSaldo();
        }
        System.out.printf("Saldo total de todos os bancos: $%.2f\n", soma);


        //-> Outra coisa importante é que eu posso adicionar  um deposito em todas as contas através do meu tipo Conta.
        // E qual a importancia da classe abstrata? Como ressaltei, é importante para melhorar o conceito de herança e encapsular os dados e reutilizar os atributos.
        for (Conta conta : contaList) {
            conta.depositar(1000.00);
        }

        // Depois do deposito, eu quero pegar o numero da conta e mostrar o saldo total de cada conta
        for (Conta conta : contaList) {
            System.out.printf("Saldo atualizado: %d: %.2f\n", conta.getNumeroDaConta(), conta.getSaldo());
        }

    }
}
