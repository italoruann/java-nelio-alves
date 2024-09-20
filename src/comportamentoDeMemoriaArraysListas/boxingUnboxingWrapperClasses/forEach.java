package comportamentoDeMemoriaArraysListas.boxingUnboxingWrapperClasses;

public class forEach {
    public static void main(String[] args) {
        // Sintaxe opcinal e bastante usada para percorrer coleções

        // Por padrão estavamos utilizando o for tradicional
        String[] clubes = new String[] {"Flamengo", "Botafogo", "Atletico MG"};

        for (int i = 0; i < clubes.length; i++) {
            System.out.println(clubes[i]);
        }

        System.out.println("-----------------");
        // para cada objeto contido no array/vetor/lista, faça:
        // for (tipo apelido : array/lista/vetor)
        for (String clube : clubes) {
            System.out.println(clube);
        }
    }
}
