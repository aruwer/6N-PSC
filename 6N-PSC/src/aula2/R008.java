package aula2;

import java.util.Scanner;

public class R008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Número: ");
        numero = scanner.nextInt();

        int fatorial = 1;
        for (int multiplicador = 1; multiplicador <= numero; multiplicador++){
            fatorial = fatorial*multiplicador;
        }
        System.out.println("Fatorial= " +fatorial);
    }
}
