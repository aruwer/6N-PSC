public class Matriz {
    private int [][] matriz;
    public Matriz(int linha, int coluna) {
        this.matriz = new int[linha][coluna];
        this.preencherMatriz();
    }

    private void preencherMatriz() {
        int numero = 1;
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                this.matriz[linha][coluna] = numero;
                numero++;
            }
        }
    }

    public void imprimir() {
        System.out.printf("%8s %6d %6d %6d %6d", "Matriz", 0, 1, 2, 3 );
        for (int linha = 0; linha < matriz.length; linha++){
            System.out.printf("\n%8d", linha);
            for (int coluna = 0; coluna < matriz.length; coluna++){
                System.out.printf(" %6d", this.matriz[linha][coluna]);
            }
        }
    }

    public void imprimirEstatisticas() {
        System.out.println("\n\na) Soma dos elementos da primeira coluna: " +
                this.getSoma1Coluna());
        System.out.println("b) Produto dos elementos da primeira linha: " +
                this.getMult1Linha());
        System.out.println("c) Soma de todos os elementos da matriz: " +
                this.getSomaTudo());
        System.out.println("d) Soma do diagonal principal: " +
                this.getSomaDiagonalP());
        System.out.println("e) Soma da diagonal secundária: " +
                this.getSomaDiagonalS());
    }

    private int getSoma1Coluna() {
        int soma1Coluna = 0;

        for (int linha = 0; linha < this.matriz.length; linha++){
            soma1Coluna += this.matriz[linha][0];
        }

        return soma1Coluna;
    }

    private int getMult1Linha() {
        int mult1Linha = 1;

        for (int coluna = 0; coluna < this.matriz.length; coluna++){
            mult1Linha *= this.matriz[0][coluna];
        }

        return mult1Linha;
    }

    private int getSomaTudo() {
        int somaTudo = 0;

        int linha = 0;
        while (linha < this.matriz.length){
            int coluna = 0;
            while (coluna < this.matriz.length){
                somaTudo += this.matriz[linha][coluna];
                coluna++;
            }
            linha++;
        }
        return somaTudo;
    }

    private int getSomaDiagonalP() {
        int somaDiagonalP = 0;
        for (int linha = 0; linha < this.matriz.length; linha++){
            somaDiagonalP += this.matriz[linha][linha];
        }
        return somaDiagonalP;
    }

    private int getSomaDiagonalS() {
        int somaDiagonalS = 0;
        for (int linha = 0; linha < this.matriz.length; linha++){
            for (int coluna = 0; coluna < this.matriz.length; coluna++){
                if (linha + coluna == 3){
                    somaDiagonalS += this.matriz[linha][coluna];
                }
            }
        }
        return somaDiagonalS;
    }
}
