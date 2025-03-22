package M013;

public class M013 {
    private int numero; //propriedade, campo, atributo, variavel da classe
    public M013(int numero) {
        this.numero = numero;
    }

    public int[] getVetorMultiplicado(int [] vetor) {
        int [] novoVetor = new int[vetor.length];
        for(int pos = 0; pos < vetor.length; pos++){
            novoVetor[pos] = vetor[pos] * this.numero;
        }
        return novoVetor;
    }

    public void imprimir(int[] vetor) {
        int pos = 0;
        while (pos < vetor.length){
            System.out.println(vetor[pos] + " ");
            pos++;
        }

    }
}
