public class SelectionSort {
    private int trocas;
    private int repeticoes;
    private int[] vetor;
    private int tamanho;

    public SelectionSort(int[] vetor) {
        trocas = 0;
        repeticoes = 0;
        this.vetor = vetor;
        tamanho = vetor.length;
    }

    public void ordenar() {
        int temp;
        for (int i = 0; i < tamanho; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
                repeticoes++;
            }

            if (indiceMenor != i) {
                temp = vetor[i];
                vetor[i] = vetor[indiceMenor];
                vetor[indiceMenor] = temp;
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
