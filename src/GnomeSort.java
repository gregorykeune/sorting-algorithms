public class GnomeSort {

    private int trocas;
    private int repeticoes;
    private int[] vetor;
    private int tamanho;

    public GnomeSort(int[] vetor) {
        trocas = 0;
        repeticoes = 0;
        this.vetor = vetor;
        tamanho = vetor.length;
    }

    public void ordenar() {
        int indice = 0;

        while (indice < tamanho) {
            if (indice == 0) {indice++;}
            if (vetor[indice] >= vetor[indice - 1]) {indice++;}
            else {
                int temp = vetor[indice];
                vetor[indice] = vetor[indice - 1];
                vetor[indice - 1] = temp;
                indice--;
                trocas++;
            }
            repeticoes++;
        }
    }


    public int getTrocas() {
        return trocas;
    }


    public int getRepeticoes() {
        return repeticoes;
    }


    public int[] getVetor() {
        return vetor;
    }


    public int getTamanho() {
        return tamanho;
    }
}
