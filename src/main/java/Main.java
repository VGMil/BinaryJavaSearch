import java.util.Scanner;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    int arreglo[];
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de elementos del arreglo");
    int n = leer.nextInt();
    arreglo = new int[n];
    for (int i = 0; i < n; i++) {
      arreglo[i] = (int) (Math.random() * n) + 1;
    }
    BusquedaBinaria binaria = new BusquedaBinaria();
    binaria.ImprimeArreglo(arreglo);
    arreglo = binaria.Sort(arreglo);
    binaria.ImprimeArreglo(arreglo);
    System.out.println("Ingrese numero a buscar");
    n = leer.nextInt();
    System.out.println("La posicion de " + n + " es: "
        + binaria.busquedaSecuencial(arreglo, n, 0, arreglo.length - 1));
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}