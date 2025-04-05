package M007;

public class Relatorio {
    private int [][] m1;
    public Relatorio(int [][] m1){
        this.m1 = m1;
    }
    public int getSomaColuna1(){
        int soma1Coluna = 0;
        for (int l = 0; l <= 2; l++) {
            for (int c = 0; c == 0; c++) {
                soma1Coluna = soma1Coluna + this.m1[l][c];
            }
        }
        return soma1Coluna;
    }
    public int getSomaColuna2(){
        int soma2Coluna = 0;
        for (int l = 0; l <= 2; l++) {
            for (int c = 1; c == 1; c++) {
                soma2Coluna = soma2Coluna + this.m1[l][c];
            }
        }
        return soma2Coluna;
    }
    public int getSomaColuna3(){
        int soma3Coluna = 0;
        for (int l = 0; l <= 2; l++) {
            for (int c = 2; c == 2; c++) {
                soma3Coluna = soma3Coluna + this.m1[l][c];
            }
        }
        return soma3Coluna;
    }
    public double getMedia() {
        double soma = 0;
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                soma += this.m1[l][c];
            }
        }
        return soma / 9.0;
    }
    public String getListar() {
        double media = getMedia();
        String lista = "";
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                if (this.m1[l][c] < media) {
                    lista += this.m1[l][c] + " ";
                }
            }
        }
        return lista;
    }
    public int getSomaDiagonalSec() {
        int somaDiagonalS = 0;
        for (int l = 0; l < 3; l++) {
            somaDiagonalS += this.m1[l][2 - l]; // Acessa os elementos da diagonal secundária
        }
        return somaDiagonalS;
    }
    public void imprimir() {
        System.out.println("a)Coluna 1: " + getSomaColuna1() + "\n  Coluna 2: " + getSomaColuna2() + "\n  Coluna 3: " + getSomaColuna3());
        System.out.println("b)Média: " + getMedia() + "\n  lista: " + getListar());
        System.out.println("c)Soma da Diagonal Secundária: " + getSomaDiagonalSec());
    }
}
