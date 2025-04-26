import java.util.Scanner;

/*Escreva um programa que leia um valor inteiro, calcule e mostre o seu fatorial.
Fatorial de um número natural n, representado por n!, é o produto de todos os
inteiros positivos menores ou iguais a n. Exemplo: 3! = 6, ou seja, 1 x 2 x 3 = 6.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        int fatorial = numero;

        while (fatorial > 1){
            fatorial = fatorial * fatorial;
            fatorial++;
        }

        System.out.println(fatorial + "");
    }
}