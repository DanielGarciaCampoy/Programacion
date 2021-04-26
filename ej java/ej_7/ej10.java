public class ej10 {
  public static void main(String[] args) {

    int[] numeros = new int[20];
    int[] pares = new int[20];
    int[] impares = new int[20];

    int cuentaPares = 0;
    int cuentaImpares = 0;

    //generacion numeros
    for (int i = 0; i < 20; i++) {
      numeros[i] = (int) (Math.random() * 101);
    }

    //filtrado de pares
    for (int i = 0; i < 20; i++) {
      if (numeros[i] % 2 == 0) {
        pares[cuentaPares] = numeros[i];
        cuentaPares++;
      } else {
        impares[cuentaImpares] = numeros[i];
        cuentaImpares++;
      }
    }

    //array original
    System.out.println(" ");
    for (int n : numeros) {
      System.out.print(n + " ");
    }
    System.out.println(" ");

    //pares
    for (int i = 0; i < cuentaPares; i++) {
      System.out.print(pares[i] + " ");
    }
    //impares
    for (int i = 0; i < cuentaImpares; i++) {
      System.out.print(impares[i] + " ");
    }

  }
}
