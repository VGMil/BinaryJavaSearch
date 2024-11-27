public class BusquedaBinaria {
  private int arreglo[];

  public int[] Sort(int[] arreglo) {
    int n = arreglo.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arreglo[j] > arreglo[j + 1]) {
          int temp = arreglo[j];
          arreglo[j] = arreglo[j + 1];
          arreglo[j + 1] = temp;
        }
      }
    }
    return arreglo;
  }

  public int busquedaSecuencial(int arreglo[], int dato, int limite_inferior, int limite_superior) {
    if (limite_inferior > limite_superior) {
      System.out.printf("No existe el dato %d \n", dato);
      return -1;
    }
    int medio = (limite_inferior + limite_superior) / 2;

    ImprimirCaminos(arreglo, limite_inferior, limite_superior, medio);
    if (dato < arreglo[medio]) {
      medio--;
      System.out.printf("Escogi el Camino de la derecha [%d y %d] \n", limite_inferior, medio);
      return busquedaSecuencial(arreglo, dato, limite_inferior, medio);
    }
    if (dato > arreglo[medio]) {
      medio++;
      System.out.printf("Escogi el Camino de la izquierda [%d y %d] \n", medio, limite_superior);
      return busquedaSecuencial(arreglo, dato, medio, limite_superior);
    }
    return medio;
  }

  private void ImprimirCaminos(int[] arreglo, int limite_inferior, int limite_superior, int medio) {
    if (limite_inferior == medio)
      limite_inferior = medio - 1;
    if (limite_superior == medio)
      limite_superior = medio + 1;
    if (limite_inferior < 0)
      limite_inferior = 0;

    System.out.printf(
        "Dos caminos: \n Derecha: %d a %d \n Izquierda: %d a %d\n Recuerda que medio:%d esta ocupado para la respuesta \n",
        limite_inferior, medio - 1, medio + 1, limite_superior, medio);
  }

  public void ImprimeArreglo(int[] arreglo) {
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print(arreglo[i] + " ");
    }
    System.out.println();
  }

}