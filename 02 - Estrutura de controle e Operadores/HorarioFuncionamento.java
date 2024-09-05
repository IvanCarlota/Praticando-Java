import java.util.Scanner;

public class HorarioFuncionamento {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um dia da semana (Ex: seg, ter, qua, qui, sex): ");
        String diaSemana = entrada.nextLine();
        
        /* Ex: Utilizando switch expressions*/
        
        String horarioFuncionamento = switch (diaSemana) {
            case "seg" -> "Fechado";
            case "ter", "qua", "qui", "sex" -> "08:00 às 18:00";
            case "sab", "dom" ->  "08:00 às 12:00";
            default -> "Dia inválido";
        };

        /* 
        Ex: Utilizando switch case com arrow label

        switch (diaSemana) {
            case "seg" -> horarioFuncionamento = "Fechado";
            case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00 às 18:00";
            case "sab", "dom" -> {
                horarioFuncionamento = "08:00 às 12:00";
        }
            default -> horarioFuncionamento = "Dia inválido";
        }
        */
        System.out.printf("Horário de funcionamento: - %s%n", horarioFuncionamento);

        entrada.close();

    }

}
