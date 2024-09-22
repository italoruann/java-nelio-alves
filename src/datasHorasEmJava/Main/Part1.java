package datasHorasEmJava.Main;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Part1 {
    public static void main(String[] args) {

        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // padrão brasileiro
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        LocalDate d01 = LocalDate.now(); // Data de agora
        LocalDateTime d02 = LocalDateTime.now(); // Data e hora de agora
        Instant d03 = Instant.now(); // Data e hora global de agora

        LocalDate d04 = LocalDate.parse("2024-09-22"); // Padrão ISO 8601
        LocalDateTime d05 = LocalDateTime.parse("2024-09-22T05:11:30");
        Instant d06 = Instant.parse("2024-09-22T05:11:30Z"); // Gerando Data e hora no padrão UTC (Z) horário de londres
        Instant d07 = Instant.parse("2024-09-22T05:11:30-03:00");

        LocalDate d08 = LocalDate.parse("22/09/2024", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("22/09/2024 05:30", fmt2);

        // Instanciando data e hora a partir de dados isolados (sobrecargas)
        LocalDate d10 = LocalDate.of(2022, 7, 22);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 22, 5, 42);

        System.out.println("d01 " + d01);
        System.out.println("d02: " + d02);
        System.out.println("d03 " + d03); // Quando contém Z no final, significa que é padrão GMT, ou seja, horário de londres.
        System.out.println("d04 " + d04);
        System.out.println("d05 " + d05);
        System.out.println("d06 " + d06);
        System.out.println("d07 " + d07);
        System.out.println("d08 " + d08);
        System.out.println("d09 " + d09);
        System.out.println("d10 " + d10);
        System.out.println("d11 " + d11);
    }
}
