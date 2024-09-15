import java.util.Scanner;

public class DesafioSomaParesImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int somaPares = 0;
        int somaImpares = 0;
        char continuar;

        do {
            System.out.print("Digite um número inteiro: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                somaPares += numero; // Soma os números pares
            } else {
                somaImpares += numero; // Soma os números ímpares
            }

            System.out.print("Deseja continuar? (S/N): ");
            continuar = entrada.next().charAt(0); // Lê a resposta do usuário

        } while (continuar == 'S' || continuar == 's'); // Continua se o usuário escolher 'S' ou 's'

        System.out.println("\nSoma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);

        entrada.close();
    }
}
