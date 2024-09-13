/*  

Desafio da estrutura for

Escreva um programa que solicita 10 números para o usuário e imprime na saída a soma
dos números digitados.

Permita que o usuário digite apenas números pares. Caso um número ímpar seja informado,
ignore e solicite um novo número ao usuário
 
 */

import java.util.Scanner;

public class DesafioFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 10; ) { // A condição no laço é garantir que 10 
            // números válidos sejam inseridos

            System.out.print("Digite um número par: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) { // Verifica se o número é par
                soma += numero;
                i++; // Incrementa o contador do loop apenas se o número for par
            } else {
                System.out.println("Número ímpar, tente novamente.");
            }
        }

        System.out.println("A soma dos números pares digitados é: " + soma);
        entrada.close();
    }
}

    

