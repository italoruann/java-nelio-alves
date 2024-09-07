package exercicios.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExEstruturaSequencial4 {
    public static void main(String[] args) {
        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        // hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        // decimais.
        byte IdFuncionario;
        int horasTrabalhadas;
        double valorPorHora, salarioMensal;

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        IdFuncionario = input.nextByte();
        horasTrabalhadas = input.nextInt();
        valorPorHora = input.nextDouble();

        salarioMensal = horasTrabalhadas * valorPorHora;
        System.out.printf("NUMBER = %d\n", IdFuncionario);
        System.out.printf("SALARY = U$%.2f", salarioMensal);

        input.close();

    }
}
