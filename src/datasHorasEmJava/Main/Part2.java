package datasHorasEmJava.Main;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Part2 {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2024-09-22");
        LocalDateTime d05 = LocalDateTime.parse("2024-09-22T05:47:00");
        Instant d06 = Instant.parse("2024-09-22T05:47:00Z");

        // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        // Por padrão a classe data hora global Instant não aceita o format. Pra isso, precisamos especificar usando o metodo withZone.
        // withZone -  qual fuso horario vou usar.
        // ZoneId é um metodo estático que contém várias funções. Dentre elas, o systemDefault para pegar o fuso horáriodo computador do usuario.
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        // Por padrão, se especificar o objeto d04, irá imprimir no padrão normal do toString()
        // Se usar o metodo format e especificar o objeto, o padrão será do texto formatado no DateTimeFormatter.
        System.out.println("d04 normal = " + d04);
        System.out.println("d04 format = " + d04.format(fmt1));
        System.out.println("d04 format = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // Também tem como iniciar a classe dentro do format, a diferença é que ela vai ser instanciada no momento da execução e depois desalocada.

        System.out.println("d05 = " + d05.format(fmt2)); // saida: 22/09/2024 05:47

        System.out.println("d06 = " + fmt3.format(d06)); // Como o Instant d06 não tem o metodo format, eu vou chamar o fmt3 que contém o format e especificar o proprio d06.
        System.out.println("d06 = " + fmt3.format(d06));
        System.out.println("d06 = " + fmt5.format(d06));
    }
}
