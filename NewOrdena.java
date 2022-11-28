public class NewOrdena {

  // Método para imprimir o vetor
  public static void impressao(int[] f) {
    for (int i = 0; i < f.length; i++) {
      System.out.print(f[i] + " ");
    }
  }

  // buble sort
  public static void BubleSort(int[] h) {
    for (int i = 0; i < h.length; i++) {
      for (int j = i + 1; j < h.length; j++) {

        if (h[i] > h[j]) {
          int d = h[i];
          h[i] = h[j];
          h[j] = d;
        }
      }
    }
  }

  // selection
  public static void SelectionSort(int[] d) {
    for (int i = 0; i < d.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < d.length; j++) {
        if (d[j] < d[min]) {
          min = j;
        }
          int x = d[min];
          d[min] = d[i];
          d[i] = x;
      }
    }
  }

  // insertion
  public static void InsertionSort(int array[]) {  
    int n = array.length;  
   for (int j = 1; j < n; j++) {
     int key = array[j];  
     int i = j-1;  
     while ( (i > -1) && ( array [i] > key ) ) {  
     array [i+1] = array [i];  
        i--;  
     }  
      array[i+1] = key;  
   }  
  }  

  // Shell
  public static void ShellSort(int[] vet){
      int i, j, temp, size = vet.length;
      int incremento = 1;
    while(incremento < size) {
    incremento = 3 * incremento + 1;
    }
       while (incremento > 1) {
	        incremento /= 3;
	    for(i = incremento; i < size; i++) {
	       temp = vet[i];
	       j = i - incremento;
	      while (j >= 0 && temp < vet[j]) {
	        vet[j + incremento] = vet[j];
	        j -= incremento;
              }
	       vet [j + incremento] = temp;
	    }
       }	    
   }

  //Merge
  public static void MergeSort(int[] vetor){
    int elementos = 1;
    int inicio, meio, fim;
    
    while(elementos < vetor.length) {
      inicio = 0;
    
      while(inicio + elementos < vetor.length) {
        meio = inicio + elementos;
        fim = inicio + 2 * elementos;
        
        if(fim > vetor.length)
          fim = vetor.length;
        
        intercala(vetor, inicio, meio, fim);
        inicio = fim;
      }
      elementos = elementos * 2;
    }
  }

//Método para intercalar os valores ordenados do vetor
  private static void intercala(int[] vetor, int inicio, int meio, int fim){
    
    int novoVetor[] = new int[fim - inicio];
    
    int i = inicio;
    int m = meio;
    int pos = 0;
    
    while(i < meio && m < fim) {
      if(vetor[i] <= vetor[m]) {
        novoVetor[pos] = vetor[i];
        pos = pos + 1;
        i = i + 1;
      } 
      else {
        novoVetor[pos] = vetor[m];
        pos = pos + 1;
        m = m + 1;
      }
    }
    while(i < meio) {
      novoVetor[pos] = vetor[i];
      pos = pos + 1;
      i = i + 1;
    }
    while(m < fim) {
      novoVetor[pos] = vetor[m];
      pos = pos + 1;
      m = m + 1;
    }
    for(pos = 0, i = inicio; i < fim; i++, pos++) {
      vetor[i] = novoVetor[pos];
    }
  }

//Quick
  public static void QuickSort(int[] vetor, int inicio, int fim){
     
    if (inicio < fim) {
    int posiPivo = separar(vetor, inicio, fim);  
    QuickSort(vetor, inicio, posiPivo);
    QuickSort(vetor, posiPivo + 1, fim);
    }

  }

  //Método para separar as listas até retornar pivô
  private static int separar (int a[], int inicio, int fim){

    int meio = (inicio+fim)/2;
    int pivo = a[meio];
    int i = inicio - 1;
    int j = fim + 1;

    while (true){
      do{
        i++;
      } while(a[i] < pivo);
      do{
        j--;
      } while(a[j] > pivo);
     if (i >= j){
       return j;
     }
      trocar(a, i, j);
    }
  }

//Método para trocar posições no vetor
  private static void trocar(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  //Método para imprimir o tempo em segundos
  public static void status(long tempo){
    Double v = tempo / Math.pow(10,9);
    System.out.println("\nO tempo total da ordenação foi de: " + v + " segundos.");
  }
  
}
