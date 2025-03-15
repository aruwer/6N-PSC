public class M006App {
    public static void main(String[] args) {
        int[][] m1 = {{1,4,9}, {4,3,8},{9,8,6}};
        int[][] m2 = {{1,2,3},{4,5,6},{7,8,9}};

        M006 matriz = new M006();

        System.out.printf("M1 %s simétrica\n",
                matriz.ehSimetrica(m1) ? "é":"não é"); //if ternário
        System.out.printf("M2 %s simétrica\n",
                matriz.ehSimetrica(m2) ? "é":"não é");
    }
}
