import java.util.Scanner;

public class CalculoPagamento
 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Quanto você ganha por hora: ");
        double valorHora = entrada.nextDouble();

        System.out.print("Digite o número de horas trabalhadas: ");
        int quantidadeHoras = entrada.nextInt();

        System.out.print("Digite o valor dos descontos: ");
        double porcetagemDescontos  = entrada.nextDouble();
        entrada.nextLine();
        entrada.nextLine();


        double valorBruto = valorHora * quantidadeHoras;
        double descontos = (valorBruto/100) * porcetagemDescontos ;
        double valorLiquido = valorBruto - descontos;

        System.out.printf("Folha de pagamento: %s%n", nome);
        System.out.printf("%d horas x R$%.2f = R$%.2f%n", quantidadeHoras, valorHora, valorBruto);
        System.out.printf("Descontos: %.2f%n", descontos);
        System.out.printf("Total devido: %.2f%n", valorLiquido);

        entrada.close();

    }
}
