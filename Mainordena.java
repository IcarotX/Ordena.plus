import java.util.Random;

public class MainOrdena {
  
  public static void main(String[] args) {
    
    int[] vetor = new int[6];
    Random ds = new Random();

    ds.setSeed(65596);
    
    for(int i=0;i<vetor.length;i++){
     vetor[i] = ds.nextInt(100);
     }
    ordena.impressao(vetor);

    System.out.println();

    long inicio = System.nanoTime();
 /* 
  Método Ordenação (apenas mudar o nome do método).
  Ao usar um algoritmo, entrar apenas com o vetor (exceto Quicksort).
  Caso seja Quick sort, será necessário entrar com o vetor a ser ordenado, sua posição inicial e final,
  por exemplo:(ordena.QuickSort(vetor, 0, vetor.length - 1)).
 */
    ordena.MergeSort(vetor);
    long fim = System.nanoTime();
    long intervalo = fim - inicio;

    ordena.impressao(vetor);
    ordena.status(intervalo);
  }
}
