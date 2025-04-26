public class MatrizC {
    private int[][] m1;

    public MatrizC(int[][] m1){
        this.m1 = m1;
    }

    public int SomaDiagonalPrincipal(int[][] m1, int l, int c){
        int somaDiagonalPrincial = 0;

        for (l = 0; l < m1.length; l++){
            for (c = 0; c < m1.length; c++){
                if (l == c){
                    somaDiagonalPrincial = somaDiagonalPrincial + this.m1[l][c];
                }
            }
        }
        return somaDiagonalPrincial;
    }



    public String Imprimir(int[][] m1, int l, int c){
        String msg = "";
        for (l = 0 ;l < m1.length; l++){
            for (c = 0; c < m1.length; c++){
                msg += m1[l][c] + " | ";
            }
            msg += "\n";
        }
        return msg;
    }
}
