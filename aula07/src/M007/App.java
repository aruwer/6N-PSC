package M007;
/*Dado uma matriz quadrada de ordem 3 de valores reais faça um algoritmo que faça a
leitura destes valores e ao final da leitura de todos, imprimirem os seguintes relatórios:
a) Qual a Soma dos valores de cada coluna da matriz;
b) Listar os valores que são menores que a média dos valores;
c) Qual a soma dos elementos da diagonal secundária;*/
public class App {
    public static void main(String[] args) {
        int [][] m1 = {{1,2,3}, {4,5,6}, {7,8,9}};

        Relatorio matriz = new Relatorio(m1);

        matriz.imprimir();

    }
}
