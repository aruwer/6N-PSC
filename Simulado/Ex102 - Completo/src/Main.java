import java.util.Scanner;

/* O IAC (Índice de Adiposidade Corporal) é uma fórmula que indica a condição de peso
de um adulto. A fórmula para calcular o IAC é:
Desenvolver um programa que leia a circunferência do quadril (cm), a altura (m) e o sexo.
Calcule o IAC e escreva na tela a condição que o mesmo encontra-se, conforme a tabela abaixo:*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a circunferência do quadril em cm?");
        double circunferencia = scanner.nextDouble();
        System.out.println("Qual é a altura em metros?");
        double altura = scanner.nextDouble();
        System.out.println("Qual o seu sexo? \nDigite 1 - F ou 2 - M");
        int sexo = scanner.nextInt();

        double iac = (circunferencia / (altura * Math.sqrt(altura))) - 18;

        System.out.printf("Índice de Adiposidade Corporal: %.2f", iac);

        System.out.println("\n\nCondição            Homens              Mulheres");
        System.out.println("Abaixo do peso      Menor que 8         Menor que 20");
        System.out.println("Normal              8 a 10              21 a 32");
        System.out.println("Sobrepeso           21 a 25             33 a 38");
        System.out.println("Obesidade           Acima de 25         Acima de 38\n");

        if (1 == sexo){
            if (iac < 20){
                System.out.println("Você está abaixo do peso");
            } else if (iac >= 21 && iac <= 32) {
                System.out.println("Você está com o peso normal");
            } else if (iac >= 33 && iac <= 38) {
                System.out.println("Você está com sobrepeso");
            } else {
                System.out.println("Você está com obesidade");
            }
        }

        if (2 == sexo){
            if (iac < 8){
                System.out.println("Você está abaixo do peso");
            } else if (iac >= 8 && iac <= 20) {
                System.out.println("Você está com o peso normal");
            } else if (iac >= 21 && iac <= 25) {
                System.out.println("Você está com sobrepeso");
            } else {
                System.out.println("Você está com obesidade");
            }
        }
    }
}