package estruturasequencial;

public class Casting {
    public static void main(String[] args) {
        // Ao inves de ja atribuirmos o valor das variaveis, podemos apenas iniciar com o tipo e o nome e dps atribui-las.
        int a, b; // Aqui estou iniciando o tipo e o nome da variavel
        double resultado;
        a = 5;
        b = 2; // Aqui eu estou editando o valor dessa variável que estava vazia.

        resultado = (double)a / b; // Estou fazendo um estruturasequencial.Casting, ou seja, estou convertendo o tipo para double
        // Obs: Se eu n utilizasse o estruturasequencial.Casting, o compilador iria retornar como resultado sempre um numero inteiro.
        System.out.println(resultado);


        double c;
        int d;
        c = 5.0;
        d = (int) c;
        System.out.println(b);
    }
}
