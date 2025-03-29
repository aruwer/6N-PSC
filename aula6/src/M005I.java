public class M005I {
    public static void main(String[] args) {
        int [][] matriz = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        int soma1Coluna = 0,
                mult1Linha = 0,
                somaTudo = 0,
                somaDiagonalP = 0,
                somaDiagonalS = 0;
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz.length; c++){
                if (c == 0) soma1Coluna += matriz[l][c];
                if (l == 0) mult1Linha *= matriz[l][c];
                somaTudo += matriz[l][c];
                if (l == c) somaDiagonalP += matriz[l][c];
                if (l + c == 3) somaDiagonalS += matriz[l][c];
            }
        }

        System.out.println("a) Soma dos elementos da primeira coluna: " +
                soma1Coluna);
        System.out.println("b) Produto dos elementos da primeira linha: " +
                mult1Linha);
        System.out.println("c) Soma de todos os elementos da matriz: " +
                somaTudo);
        System.out.println("d) Soma do diagonal principal: " +
                somaDiagonalP);
        System.out.println("e) Soma da diagonal secundária: " +
                somaDiagonalS);
    }
}
