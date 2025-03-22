package M013;

/*M013 Ler um vetor A de 15 números. Após, ler mais um número*/
public class M013App {
    public static void main(String[] args) {
        int [] vA = {3, 9, 6, 5, 8};
        int numero = 9;

        M013 vetor = new M013(numero); //numero = paramentro , M013() = construtor

        int [] vM = vetor.getVetorMultiplicado(vA);

        vetor.imprimir(vM);
    }
}
