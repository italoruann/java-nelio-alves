public class VariaveisTiposPrimitivos {
    public static void main(String[] args) {

        // texto/caractere
        String nome = "Italo";

        // inteiros
        byte num = 1; // -128 a 127
        short num2 = 23; // -32768 a 32767
        int num3 = 345; // -2147483648 a 2147483647
        long num4 = 589982959; // -9223372036854770000 a 9223372036854770000

        // ponto flutuante/casa decimal
        float altura = 1.77F; // -1,4024E-37 a 3,4028E+38 Obs: No float, precisa utilizar a sigla F.
        double peso = 73.3; // -4,94E-307 a 1,79E+308

        // caractere único
        char genero = 'f'; // Se utilizarmos aspas duplas, vai dá erro e entende que é String. Aspas simples entende como caractere único.

        // Apenas dois valores, verdadeiro(true) ou falso(false)
        boolean verdadeiro = true;
        boolean falso = false;
    }

}