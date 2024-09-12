import java.util.Scanner;

public class ControlePesoAeronaveComWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso máximo da aeronave: ");
        int pesoMaximo = entrada.nextInt();

        int pesoTotalPassageiros = 0;

        while (true) {
            System.out.print("Peso do passageiro: ");
            int pesoPassageiro = entrada.nextInt();

            if (pesoTotalPassageiros + pesoPassageiro > pesoMaximo) {
                System.out.println("Não foi possível incluir o " +
                "passageiro, pois o peso excederia o máximo suportado pela aeronave.");
                continue;
            }

            pesoTotalPassageiros += pesoPassageiro;

            System.out.print("Incluir novo passageiro? true or false ");

            if(!entrada.nextBoolean()){
            break;
            }
        }

        System.out.printf("\nPeso máximo da aeronave: %d kg%n", pesoMaximo);
        System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);
        System.out.printf("Situação da aeronave: %s%n",
                            pesoTotalPassageiros > pesoMaximo ? "Peso excedido" : "Liberada");

        entrada.close();

    }

}
