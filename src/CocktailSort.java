public class CocktailSort {
    private int trocas;
    private int repeticoes;
    private int[] vetor;
    private int tamanho;

    public CocktailSort(int[] vetor) {
        trocas = 0;
        repeticoes = 0;
        this.vetor = vetor;
        tamanho = vetor.length;
    }

    public void ordenar() {
        int temp;
        boolean trocou = true;
        int fim = tamanho - 1;
        int inicio = 0;

        while (trocou) {
            trocou = false;

            for (int i = inicio; i < fim; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    temp = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = temp;
                    trocas++;
                }
                repeticoes++;
            }

            fim--;

            for (int i = fim; i > inicio; i--) {
                if (vetor[i] < vetor[i - 1]) {
                    temp = vetor[i];
                    vetor[i] = vetor[i-1];
                    vetor[i-1] = temp;
                    trocou = true;
                    trocas++;
                }
                repeticoes++;
            }

            inicio++;
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
