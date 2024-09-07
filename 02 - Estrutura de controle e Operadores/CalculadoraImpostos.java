public class CalculadoraImpostos {

    public static void main(String[] args) {

        char tipoNotaFiscal = 'S';
        double totalFaturado = 1200.30;

        /* Utilizando o ternário para realizar o mesmo trecho de código acima.*/

        double taxaImpostos = tipoNotaFiscal == 'S' ? 0.16 : 0.35;
        double valorImpostos = totalFaturado * taxaImpostos;

        System.out.printf("Total faturado: R$%.2f%n", totalFaturado);
        System.out.printf("Valor dos impostos: R$%.2f%n", valorImpostos);
    }

}
