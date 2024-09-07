import java.util.Scanner;

public class SimuladorEmprestimo {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Valor do empréstimo: ");
    double valorEmprestimo = entrada.nextDouble();

    System.out.print("Quantidade de parcelas: ");
    int quantidadeParcelas = entrada.nextInt();

    double taxaJuros = switch (quantidadeParcelas) {
        case 1, 2 -> 1.99;
        case 3 -> 2.99;
        default -> 3.99;
    };

    double tarifaFixa = valorEmprestimo >= 100 ? 1.50 : 0;

    double totalJuros = valorEmprestimo * (taxaJuros / 100 * quantidadeParcelas);
    double custoTotal = valorEmprestimo + tarifaFixa + totalJuros;
    double valorParcelas = custoTotal / quantidadeParcelas;

    System.out.printf("Tarifa fixa: R$%.2f%n", tarifaFixa);
    System.out.printf("Total de juros: R$%.2f%n", totalJuros);
    System.out.printf("Custo total: R$%.2f%n", custoTotal);
    System.out.printf("Valor das Parcelas: R$%.2f%n", valorParcelas);
    System.out.printf("Taxa de Juros: %.2f%%%n", taxaJuros); // Corrigido: Adicionado % para indicar porcentagem
    System.out.printf("Quantidade de Parcelas: %d%n", quantidadeParcelas); // Corrigido: Uso de %d para inteiros
      

    entrada.close();
    
    }
}