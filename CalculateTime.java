// como fazer calculos com data e hora

// importando as classes necessarias do pacote java.time

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20"); // data local
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // data e hora local
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // data e hora global

        LocalDate pastWeekDate = d04.minusDays(7); // subtraindo 7 dias da data local
        LocalDate nextWeekDate = d04.plusDays(7); // somando 7 dias

        LocalDateTime pastWeekLocalDate = d05.minusDays(7); // subtraindo 7 dias da data e hora local
        LocalDateTime nextWeekLocalDate = d05.plusDays(7); // somando 7 dias

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); // subtraindo 7 dias da data e hora global
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS); // somando 7 dias

        // imprimindo os resultados
        
        System.out.println("pastWeekDate = " + pastWeekDate);
        System.out.println("nextWeekDate = " + nextWeekDate);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        // calculando a duracao entre duas datas
        // Duration e uma classe que representa uma duracao entre duas datas

        Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay()); // atStartOfDay() retorna a data e hora local com a hora zerada (00:00:00)    
        
        Duration t2 = Duration.between(pastWeekLocalDate, d05); // calculando a duracao entre duas datas e horas locais
        
        Duration t3 = Duration.between(pastWeekInstant, d06); // calculando a duracao entre duas datas e horas globais
        
        Duration t4 = Duration.between(d06, pastWeekInstant); // calculando a duracao entre duas datas e horas globais

        // imprimindo os resultados
        
        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
    }
}
