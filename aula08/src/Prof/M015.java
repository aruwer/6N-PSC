package Prof;

import java.util.Random;

/*M015 Faça um algorítmo que armazene em um vetor a temperatura média de
todos os dias de um mês escolhido.
Calcular e escrever:
a) Menor temperatura do mês
b) Maior temperatura do mês
c) Temperatura média mensal
d) O número de dias no mês em que a temperatura foi inferior
a média mensal*/
public class M015 {
    public static void main(String[] args) {
        int [] temperaturas = new int[30];

        temperaturas = getTemperaturas(temperaturas.length);

        int menorTemperaturaDoMes = getMenorTemperaturaDoMes(temperaturas);
        int maiorTemperaturaDoMes = getMaiorTemperaturaDoMes(temperaturas);
        int temperaturaMediaMensal = getTemperaturaMediaMensal(temperaturas);
        int diasMesTemperturaInferioarAMediaMensal = getDiasMesTemperturaInferioarAMediaMensal(temperaturas, temperaturaMediaMensal);

        System.out.printf("a) Menor temperatura do mês: %d\n" +
                "b) Maior temperatura do mês: %d\n" +
                "c) Temperatura média mensal: %d\n" +
                "d) O número de dias no mês em que a temperatura foi inferior a média mensal: %d", menorTemperaturaDoMes,
                maiorTemperaturaDoMes, temperaturaMediaMensal, diasMesTemperturaInferioarAMediaMensal);
    }

    private static int getDiasMesTemperturaInferioarAMediaMensal(int[] temperaturas, int temperaturaMediaMensal) {
        int diasMesTemperturaInferioarAMediaMensal = 0;
        for (int temperatura: temperaturas){
            if (temperatura < temperaturaMediaMensal){
                diasMesTemperturaInferioarAMediaMensal++;
            }
        }
        return diasMesTemperturaInferioarAMediaMensal;
    }

    private static int getTemperaturaMediaMensal(int[] temperaturas) {
        int totalTemperaturasMes = 0;
        for (int temperatura: temperaturas){
            totalTemperaturasMes += temperatura;
        }
        return totalTemperaturasMes / temperaturas.length;
    }

    private static int getMaiorTemperaturaDoMes(int[] temperaturas) {
        int maiorTemperatura =  temperaturas[0];

        for (int dia = 1; dia < temperaturas.length; dia++){
            if (maiorTemperatura < temperaturas[0]){
                maiorTemperatura = temperaturas[dia];
            }
        }
        return maiorTemperatura;
    }

    private static int getMenorTemperaturaDoMes(int[] temperaturas) {
        int menorTemperatura = temperaturas[0];

        int dia = temperaturas.length - 1;

        while (dia > 0){
            if (menorTemperatura > temperaturas[dia]){
                menorTemperatura = temperaturas[dia];
            }
            dia--;
        }
        return menorTemperatura;
    }

    private static int[] getTemperaturas(int qtdeDias) {
        Random random = new Random();
        int temperaturaMin = 10, temperaturaMax = 50;

        int [] temperaturas = new int[qtdeDias];

        for (int dia = 0; dia < qtdeDias; dia++){
            temperaturas[dia] = random.nextInt(
                    temperaturaMax - temperaturaMin) + temperaturaMin;
        }
        return temperaturas;
    }
}
