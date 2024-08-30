import java.util.Scanner;

public class CalculadoraDeIMC {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual o seu Peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Qual a sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal.");
        }

        if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso ideal.");
        }

        if (imc >= 25 && imc < 30) {
            System.out.println("Acima do peso.");
        }

        if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade grau 1.");
        }

        if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade grau 2.");
        }

        if (imc >= 40) {
            System.out.println("Obesidade grau 3.");
        }

        entrada.close();

    }
}
