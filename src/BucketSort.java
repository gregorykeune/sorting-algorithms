import javax.swing.undo.AbstractUndoableEdit;
import java.util.ArrayList;

public class BucketSort {

    private int trocas;
    private int repeticoes;
    private int[] vetor;
    private int tamanho;

    public BucketSort(int[] vetor) {
        trocas = 0;
        repeticoes = 0;
        this.vetor = vetor;
        tamanho = vetor.length;
    }

    public void ordenar() {
        int min = vetor[0];
        int max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < min) min = vetor[i];
            if (vetor[i] > max) max = vetor[i];
            repeticoes++;
        }

        ArrayList<Integer>[] buckets = new ArrayList[tamanho];
        for (int i = 0; i < tamanho; i++) {
            buckets[i] = new ArrayList<>();
            repeticoes++;
        }

        for (int i = 0; i < tamanho; i++) {
            int indice = (int)((vetor[i] - min) / (double)(max - min + 1) * tamanho);
            buckets[indice].add((vetor[i]));
            trocas++;
            repeticoes++;
        }

        for (int i = 0; i < tamanho; i++) {
            selectionSort(buckets[i]);
            repeticoes++;
        }

        int k = 0;
        for (int i = 0; i < tamanho; i++) {
            for (int valor : buckets[i]) {
                vetor[k] = valor;
                k++;
                trocas++;
                repeticoes++;
            }
            repeticoes++;
        }
    }


    public void selectionSort(ArrayList<Integer> vetor) {
        int temp;
        int tamanho = vetor.size();
        for (int i = 0; i < tamanho; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < tamanho; j++) {
                if (vetor.get(j) < vetor.get(indiceMenor)) {
                    indiceMenor = j;
                }
                repeticoes++;
            }

            if (indiceMenor != i) {
                temp = vetor.get(i);
                vetor.set(i, vetor.get(indiceMenor));
                vetor.set(indiceMenor, temp);
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

