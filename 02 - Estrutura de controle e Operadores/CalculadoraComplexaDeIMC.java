import java.util.Scanner;

public class CalculadoraComplexaDeIMC {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite M para Masculino ou F para Feminino: ");
        String sexo = entrada.nextLine();

        System.out.print("Qual o seu Peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Qual a sua altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        if (sexo.equalsIgnoreCase("F") && imc < 19.1) {
            System.out.println("Abaixo do peso.");
        } else if (sexo.equalsIgnoreCase("F") && imc < 25.8) {
            System.out.println("No peso ideal.");
        } else if (sexo.equalsIgnoreCase("F") && imc < 27.3) {
            System.out.println("Um pouco acima do peso.");
        } else if (sexo.equalsIgnoreCase("F") && imc < 32.3) {
            System.out.println("Acima do peso ideal.");
        } else if (sexo.equalsIgnoreCase("F") && imc > 32.3){
            System.out.println("Obeso.");
        }else if (sexo.equalsIgnoreCase("M") && imc < 20.7) {
            System.out.println("Abaixo do peso.");
        } else if (sexo.equalsIgnoreCase("M") && imc < 26.4) {
            System.out.println("No peso ideal.");
        } else if (sexo.equalsIgnoreCase("M") && imc < 27.8) {
            System.out.println("Um pouco acima do peso.");
        } else if (sexo.equalsIgnoreCase("M") && imc < 31.1) {
            System.out.println("Acima do peso ideal.");
        } else if(sexo.equalsIgnoreCase("M") && imc > 31.1){
            System.out.println("Obeso.");
        }

        entrada.close();
    }
}
