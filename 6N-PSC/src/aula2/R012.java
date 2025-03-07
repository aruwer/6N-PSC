package aula2;

import java.util.Scanner;

public class R012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.println("Número: ");
        numero = scanner.nextInt();


        float media = media(numero);

        System.out.printf("Média do número %d é %f", numero, media);
    }
    private static float media(int numero) {
        float soma = 0;
        int contador = 0;
        for (int seq = 1; seq <= numero; seq++){
            if (seq % 2 != 0){
                soma += seq;
                contador++;
            }
        }
        return soma / contador;
    }
}
