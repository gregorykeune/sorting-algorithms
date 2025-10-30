public class BubbleSort {
    private int trocas;
    private int repeticoes;
    private int[] vetor;
    private int tamanho;

    public BubbleSort(int[] vetor) {
        trocas = 0;
        repeticoes = 0;
        this.vetor = vetor;
        tamanho = vetor.length;
    }

    public void ordenar() {
        int temp;
        for (int i = 0; i < tamanho; i++) {
            boolean trocou = false;
            for (int j = 1; j < tamanho - i; j++) {
                if (vetor[j - 1] > vetor[j]) {
                    trocou = true;
                    temp = vetor[j -1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = temp;
                    trocas++;
                }
                repeticoes++;
            }
            if (!trocou) {
                return;
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
