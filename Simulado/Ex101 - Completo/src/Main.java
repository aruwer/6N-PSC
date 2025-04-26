import java.util.Scanner;

/* Embrulhar um presente de aniversário custa X reais. O presente de aniversário
custa Y reais a mais que o preço para embrulhá-lo. Quanto custará para comprar e
embrulhar o presente?
Faça um programa que responda automaticamente a questão apresentada. O valor X e
Y do problema devem ser lidos e são valores reais.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double custoY = 0;
        double total = 0;

        System.out.println("Qual é o valor do presente? ");
        custoY = scanner.nextDouble();

        total = custoY/2 + custoY;
        System.out.printf("O valor total é: %f", total);
    }
}