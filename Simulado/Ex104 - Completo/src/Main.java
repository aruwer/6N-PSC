/*Escreva um algoritmo que leia uma matriz quadrada de sétima ordem M(7,7), 7 linhas
e 7 colunas, e efetue a soma dos elementos da diagonal principal (canto superior
esquerdo ao canto inferior direito). Depois de calculado mostre a soma na tela.
*/
public class Main {
    public static void main(String[] args) {
        int[][] m1 = {{1, 2, 3, 4, 5, 6, 7}, {1, 2, 3, 4, 5, 6, 7}, {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 3, 4, 5, 6, 7}, {1, 2, 3, 4, 5, 6, 7}, {1, 2, 3, 4, 5, 6, 7}, {1, 2, 3, 4, 5, 6, 7}};

        MatrizC matriz = new MatrizC(m1);

        System.out.println("Matriz\n" + matriz.Imprimir(m1, 7, 7) + "\n Soma diagonal Principal: " + matriz.SomaDiagonalPrincipal(m1, 7,7));
    }
}