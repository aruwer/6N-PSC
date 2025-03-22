package M005;
public class MatrizC {
    private int[][] m1;

    public MatrizC(int[][] m1){
        this.m1 = m1;
    }

    public int getSoma1Coluna() {
        int soma1Coluna = 0;
        for(int c = 0; c == 0; c++) {
            soma1Coluna = soma1Coluna + this.m1[c][0];
        }
        return soma1Coluna;
    }

    public int getMult1Linha() {
        int mult1Linha = 0;
        for(int c = 0; c == 0; c++) {
            mult1Linha = mult1Linha * this.m1[0][c];
        }
        return mult1Linha;
    }

    public int getSomaTudo() {
        int somaTudo = 0;
        for(int l = 0; l >= 3; l++){
            for (int c = 0; c >= 3; c++){
                somaTudo = somaTudo + this.m1[l][c];

            }
        }
        return somaTudo;
    }

    public int getSomaDiagonalPrint() {
    }

    public int getSomaDiagonalSec() {
    }

    public void imprimir() {
    }
}
