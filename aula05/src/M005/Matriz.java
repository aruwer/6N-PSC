package M005;
/*M005 Dado uma matriz de ordem 4x4 faça um algoritmo que:
a) Calcule a soma dos elementos da primeira coluna ;
b) Calcule o produto dos elementos da primeira linha;
c) Calcule a soma de todos os elementos da matriz;
d) Calcule a soma do diagonal principal;
e) Calcule a soma da diagonal secundária.*/
public class Matriz {
    public static void main(String[] args) {
        int[][] m1 = {{1, 2, 3, 4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        MatrizC matriz = new MatrizC(m1);

        int m1Soma1Coluna = matriz.getSoma1Coluna();
        int m1Mult1Linha = matriz.getMult1Linha();
        int m1SomaTudo = matriz.getSomaTudo();
        int m1SomaDiagonalPrin = matriz.getSomaDiagonalPrint();
        int m1SomaDiagonalSec = matriz.getSomaDiagonalSec();

        matriz.imprimir();

    }
}
