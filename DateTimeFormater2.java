// este programa e um exemplo de como usar o DateTimeFormatter para formatar datas e horas

// importando as classes necessarias

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

// criando a classe principal

public class Program2 {

    public static void main(String[] args) {

        // criando as variaveis de data e hora
        LocalDate d04 = LocalDate.parse("2022-07-20"); // ISO 8601
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // ISO 8601
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // ISO 8601

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        
        // criando os formatadores de data e hora
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // criando um formatador de data
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // criando um formatador de data e hora
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // criando um formatador de data e hora com fuso horario do sistema
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // criando um formatador de data e hora no formato ISO 8601
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; // criando um formatador de data e hora no formato ISO 8601 com fuso horario do sistema

        
        // imprimindo as datas e horas formatadas
        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d05 = " + d05.format(fmt4));

        System.out.println("d06 = " + fmt3.format(d06));
        System.out.println("d06 = " + fmt5.format(d06));
        System.out.println("d06 = " + d06.toString());
    }
}
