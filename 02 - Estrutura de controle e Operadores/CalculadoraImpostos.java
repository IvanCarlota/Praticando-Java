public class CalculadoraImpostos {

    public static void main(String[] args) {

        char tipoNotaFiscal = 'S';
        double totalFaturado = 1200.30;

        /*
        double valorImpostos;

          Utilizando o If comum

        if (tipoNotaFiscal == 'S') {
            valorImpostos = totalFaturado * 0.16;
        } else{
            valorImpostos = totalFaturado * 0.35;
        }
        */


        /* Utilizando o ternário para realizar o mesmo trecho de código acima.*/

        double valorImpostos = tipoNotaFiscal == 'S' ? totalFaturado * 0.16 : totalFaturado * 0.35;

        System.out.printf("Total faturado: R$%.2f%n", totalFaturado);
        System.out.printf("Valor dos impostos: R$%.2f%n", valorImpostos);
    }

}
