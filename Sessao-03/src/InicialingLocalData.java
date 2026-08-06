package src;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class InicialingLocalData {
    public static void main(String[] args){

        LocalDate d01 = LocalDate.now(); // Criando e iniciando na data atual
        LocalDateTime d02 = LocalDateTime.now(); // Criando e iniciando a data e horario atual
        LocalTime d03 = LocalTime.now(); // Criando e iniciando o horario atial, ja com os milisegundos

        LocalDate d04 = LocalDate.parse("2022-07-20"); //Setando uma data fixa
        LocalTime d05 = LocalTime.parse("22:55:49.442432432"); // setando um tempo fixo
        Instant d06 = Instant.parse("2022-07-20T02:32:10Z"); // Setando uma data e tempo fixo

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault()); // Dessa forma acabo formatando e deixando o horario ajustado para o meu fuso horario, que no caso e Brasil.

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println("========================================");
        System.out.println("D04 = " + d04.format(fmt1));
        System.out.println("D05 = " + d05.format(fmt2));
        System.out.println(fmt3.format(d06)); // Brasil
    }
}
