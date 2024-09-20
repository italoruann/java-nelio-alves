package listas;

public class ListasPart1 {
    public static void main(String[] args) {

        // Listas é uma estrutura de dados que são:
        // Homogênia -> Dados do mesmo tipo
        // Ordenada -> elementos acessados por meios de posições
        // inicia vazia -> diferente dos arrays que precisamos iniciar um tamanho fixo. A lista inicia vazia e alocamos sob demanda.

        // List nao é uma classe e sim uma interface.
        // Mas já que a List é uma interface, como vou usar ela? Ai vem o pulo do gato.
        // Vamos usar uma classe que implementa uma List que são os ArrayList.
        // Vantagens: Tamanho variável, ou seja, vai aumentar ou diminuir dinamicamente, diferente do array tradicional que precisa informar uma posição.
        //            Facilidade para realizar inserções e deleções.
        // Desvantagens: Acesso sequencial aos elementos, porem, com a classe melhorada q implementa uma list chamada de ArrayList, resolve esse problema.

        // aqui são algumas funções que são muitos utilizadas no List que são:
        /* Tamanho da lista: size()
            Obter o elemento de uma posição: get(position)
             Inserir elemento na lista: add(obj), add(int, obj)
             Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
             Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
             Filtrar lista com base em predicado:
             List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
             Encontrar primeira ocorrência com base em predicado:
             Integer result = list.stream().filter(x-> x > 4).findFirst().orElse(null);
         */

    }
}
