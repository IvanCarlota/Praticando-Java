import java.util.Scanner;

public class DesafioInverterDigitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        
        int invertido = 0;

        while (numero != 0) {
            int ultimoDigito = numero % 10; // Obtém o último dígito
            invertido = invertido * 10 + ultimoDigito; // Constrói o número invertido
            numero /= 10; // Remove o último dígito do número original
        }

        System.out.println("Número com os dígitos invertidos: " + invertido);
        entrada.close();
    }
}
