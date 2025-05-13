// este programa é um exemplo de como usar o DateTimeFormatter para formatar datas e horas

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;
// instanciando as classes de data e hora

public class Main {

    public static void main(String[] args) {

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        // classe DateTimeFormatter para formatar datas e horas
        
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formato de data
        DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // formato de data e hora

        LocalDate d01 = LocalDate.now(); // data atual
        LocalDateTime d02 = LocalDateTime.now(); // data e hora atual
        Instant d03 = Instant.now(); // data e hora atual em UTC

        LocalDate d04 = LocalDate.parse("2022-07-20"); // data em formato ISO 8601
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // data e hora em formato ISO 8601
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // data e hora em formato ISO 8601 em UTC
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); // data e hora em formato ISO 8601 em UTC-3

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

        // customizando a formatação de data e hora
        
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); // data em formato dd/MM/yyyy
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2); // data e hora em formato dd/MM/yyyy HH:mm

        // criando datas e horas a partir de valores inteiros
        LocalDate d10 = LocalDate.of(2022, 07, 20); 
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);
        // imprimindo as datas e horas formatadas
        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
        System.out.println("d11 = " + d11.toString());
    }
}
