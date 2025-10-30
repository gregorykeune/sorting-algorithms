public class CombSort {
    private int trocas;
    private int repeticoes;
    private int[] vetor;
    private int tamanho;

    public CombSort(int[] vetor) {
        trocas = 0;
        repeticoes = 0;
        this.vetor = vetor;
        tamanho = vetor.length;
    }

    public void ordenar() {
        int temp;
        int gap = tamanho - 1;
        while (gap >= 1) {
            gap = (int)(gap / 1.3);
            for (int j = 0; j + gap < tamanho; j++) {
                if (vetor[j] > vetor[j + gap]) {
                    temp = vetor[j + gap];
                    vetor[j + gap] = vetor[j];
                    vetor[j] = temp;
                    trocas++;
                }
                repeticoes++;
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
