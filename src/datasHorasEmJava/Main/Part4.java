package datasHorasEmJava.Main;

import java.time.*;
import java.time.temporal.ChronoUnit;


public class Part4 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:30");
        Instant d06 = Instant.parse("2022-07-20T01:30:30Z");

        // Calculos com data hora
        LocalDate menosDiasLocalDate = d04.minusDays(7); // Vai diminuir 7 dias
        LocalDate maisDiasLocalDate = d04.plusDays(7); // Vai acrescentar 7 dias

        LocalDateTime menosDiasEHorasLocalDateTime = d05.minusDays(7);
        LocalDateTime maisDiasEHorasLocalDateTime = d05.plusDays(7);

        Instant menosDiasLocalDateTime = d06.minus(7, ChronoUnit.DAYS);
        Instant maisDiasLocalDateTime = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("Dias");
        System.out.println("menosDiasLocalDate = " + menosDiasLocalDate);
        System.out.println("maisDiasLocalDate = " + maisDiasLocalDate);
        System.out.println();

        System.out.println("Dias e Horas");
        System.out.println("menosDiasEHorasLocalDate = " + menosDiasEHorasLocalDateTime);
        System.out.println("maisDiasEHorasLocalDate = " + maisDiasEHorasLocalDateTime);
        System.out.println();

        System.out.println("Dias e horas global");
        System.out.println("menosDiasLocalDateTime = " + menosDiasLocalDateTime);
        System.out.println("maisDiasLocalDateTime = " + maisDiasLocalDateTime);
        System.out.println();

        // Calcular a duração entre duas datas
        // Obs: o Duration nao aceita LocalDate, ou seja, precisa converter pqra LocalDateTime
        // Para isso, utiliza o metodo atTime para colocar o valor padrão do LocalDate
        // Você pode utilizar o atTime com valores de hours e minute em 0 ou usar atStartOfDay que coloca o padrão meia noite(00:00)
        Duration t1 = Duration.between(menosDiasLocalDate.atTime(0, 0), d04.atStartOfDay());
        Duration t2 = Duration.between(menosDiasEHorasLocalDateTime, d05);
        Duration t3 = Duration.between(menosDiasLocalDateTime, d06);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays()); // Entre o dia 13 para o dia 20(d05), é 7 dias.
        System.out.println("t3 dias = " + t3.toDays());

    }
}
