public class Main {
    public static void main(String[] args) {

        int[] vetor1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};

        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};

        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        BubbleSort bsv1 = new BubbleSort(vetor1.clone());
        BubbleSort bsv2 = new BubbleSort(vetor2.clone());
        BubbleSort bsv3 = new BubbleSort(vetor3.clone());

        SelectionSort ssv1 = new SelectionSort(vetor1.clone());
        SelectionSort ssv2 = new SelectionSort(vetor2.clone());
        SelectionSort ssv3 = new SelectionSort(vetor3.clone());

        CocktailSort csv1 = new CocktailSort(vetor1.clone());
        CocktailSort csv2 = new CocktailSort(vetor2.clone());
        CocktailSort csv3 = new CocktailSort(vetor3.clone());

        CombSort cbsv1 = new CombSort(vetor1.clone());
        CombSort cbsv2 = new CombSort(vetor2.clone());
        CombSort cbsv3 = new CombSort(vetor3.clone());

        GnomeSort gsv1 = new GnomeSort(vetor1.clone());
        GnomeSort gsv2 = new GnomeSort(vetor2.clone());
        GnomeSort gsv3 = new GnomeSort(vetor3.clone());

        BucketSort bcsv1 = new BucketSort(vetor1.clone());
        BucketSort bcsv2 = new BucketSort(vetor2.clone());
        BucketSort bcsv3 = new BucketSort(vetor3.clone());


        bsv1.ordenar();
        bsv2.ordenar();
        bsv3.ordenar();

        ssv1.ordenar();
        ssv2.ordenar();
        ssv3.ordenar();

        csv1.ordenar();
        csv2.ordenar();
        csv3.ordenar();

        cbsv1.ordenar();
        cbsv2.ordenar();
        cbsv3.ordenar();

        gsv1.ordenar();
        gsv2.ordenar();
        gsv3.ordenar();

        bcsv1.ordenar();
        bcsv2.ordenar();
        bcsv3.ordenar();

        System.out.println("\n------------------------ BubbleSort ------------------------\n");

        Display.display(bsv1.getVetor());
        System.out.println("BubbleSort v1:  Trocas = " + bsv1.getTrocas() + "; Repeticoes = " + bsv1.getRepeticoes());

        Display.display(bsv2.getVetor());
        System.out.println("BubbleSort v2:  Trocas = " + bsv2.getTrocas() + "; Repeticoes = " + bsv2.getRepeticoes());

        Display.display(bsv3.getVetor());
        System.out.println("BubbleSort v3:  Trocas = " + bsv3.getTrocas() + "; Repeticoes = " + bsv3.getRepeticoes());


        System.out.println("\n------------------------ SelectionSort ------------------------\n");


        Display.display(ssv1.getVetor());
        System.out.println("SelectionSort v1:  Trocas = " + ssv1.getTrocas() + "; Repeticoes = " + ssv1.getRepeticoes());

        Display.display(ssv2.getVetor());
        System.out.println("SelectionSort v2:  Trocas = " + ssv2.getTrocas() + "; Repeticoes = " + ssv2.getRepeticoes());

        Display.display(ssv3.getVetor());
        System.out.println("SelectionSort v3:  Trocas = " + ssv3.getTrocas() + "; Repeticoes = " + ssv3.getRepeticoes());


        System.out.println("\n------------------------ CocktailSort ------------------------\n");


        Display.display(csv1.getVetor());
        System.out.println("CocktailSort v1:  Trocas = " + csv1.getTrocas() + "; Repeticoes = " + csv1.getRepeticoes());

        Display.display(csv2.getVetor());
        System.out.println("CocktailSort v2:  Trocas = " + csv2.getTrocas() + "; Repeticoes = " + csv2.getRepeticoes());

        Display.display(csv3.getVetor());
        System.out.println("CocktailSort v3:  Trocas = " + csv3.getTrocas() + "; Repeticoes = " + csv3.getRepeticoes());


        System.out.println("\n------------------------ CombSort ------------------------\n");


        Display.display(cbsv1.getVetor());
        System.out.println("CombSort v1:  Trocas = " + cbsv1.getTrocas() + "; Repeticoes = " + cbsv1.getRepeticoes());

        Display.display(cbsv2.getVetor());
        System.out.println("CombSort v2:  Trocas = " + cbsv2.getTrocas() + "; Repeticoes = " + cbsv2.getRepeticoes());

        Display.display(cbsv3.getVetor());
        System.out.println("CombSort v3:  Trocas = " + cbsv3.getTrocas() + "; Repeticoes = " + cbsv3.getRepeticoes());


        System.out.println("\n------------------------ GnomeSort ------------------------\n");


        Display.display(gsv1.getVetor());
        System.out.println("GnomeSort v1:  Trocas = " + gsv1.getTrocas() + "; Repeticoes = " + gsv1.getRepeticoes());

        Display.display(gsv2.getVetor());
        System.out.println("GnomeSort v2:  Trocas = " + gsv2.getTrocas() + "; Repeticoes = " + gsv2.getRepeticoes());

        Display.display(gsv3.getVetor());
        System.out.println("GnomeSort v3:  Trocas = " + gsv3.getTrocas() + "; Repeticoes = " + gsv3.getRepeticoes());


        System.out.println("\n------------------------ BucketSort ------------------------\n");


        Display.display(bcsv1.getVetor());
        System.out.println("BucketSort v1:  Trocas = " + bcsv1.getTrocas() + "; Repeticoes = " + bcsv1.getRepeticoes());

        Display.display(bcsv2.getVetor());
        System.out.println("BucketSort v2:  Trocas = " + bcsv2.getTrocas() + "; Repeticoes = " + bcsv2.getRepeticoes());

        Display.display(bcsv3.getVetor());
        System.out.println("BucketSort v3:  Trocas = " + bcsv3.getTrocas() + "; Repeticoes = " + bcsv3.getRepeticoes());
    }
}