import java.util.Scanner;

public class CalculoAnoBissexto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o ano: ");
        int ano = entrada.nextInt();

        boolean bissextoSim = ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
        System.out.printf("É bissexto: %b%n", bissextoSim);

        boolean bissextoNao = !(bissextoSim);
        System.out.printf("Não é bissexto: %b%n", bissextoNao);

        entrada.close();

    }
}
