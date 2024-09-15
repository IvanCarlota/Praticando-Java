import java.util.Scanner;

public class DesafioSomaNumerosAteCemComWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;

        while (soma < 100) { // Continua enquanto a soma for menor que 100
            System.out.print("\nDigite um número inteiro: ");
            int numero = entrada.nextInt();
            soma += numero; // Adiciona o número à soma
            System.out.println("Soma atual: " + soma); // Exibe a soma parcial
        }

        System.out.println("A soma total dos números é: " + soma); // Exibe a soma final
        entrada.close();
    }
}
