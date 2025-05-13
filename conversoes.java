// programa didatico para o topico especial de programacao sobre DATA e HORA
// convertendo data e hora de um formato para outro

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    
    public static void main(String[] args) {

        // for (String s : ZoneId.getAvailableZoneIds())
        // System.out.println(s);
        
        LocalDate d04 = LocalDate.parse("2022-07-20"); // data
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // data e hora
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // data e hora em formato UTC

               LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // convertendo para o fuso horario do sistema
               LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); // indicando o fuso horario
               LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault()); // convertendo para o fuso horario do sistema
               LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal")); //  indicando o fuso horario

              System.out.println("r1 = " + r1); 
              System.out.println("r2 = " + r2);
              System.out.println("r3 = " + r3);    
              System.out.println("r4 = " + r4); // imprimindo a data e hora em formato UTC

             System.out.println("d04 dia = " + d04.getDayOfMonth()); // imprimindo o dia em formato UTC
             System.out.println("d04 mes = " + d04.getMonthValue()); // imprimindo o mes em formato UTC
             System.out.println("d04 ano = " + d04.getYear());        // imprimindo o ano em formato UTC
             System.out.println("d05 hora = " + d05.getHour());        // imprimindo a hora em formato UTC   
             System.out.println("d05 minutos = " + d05.getMinute());     // imprimindo os minutos em formato UTC
        
    }
    
}
