public class ej11 {
  public static void main(String[] args) {
    
    int[] valor = new int[20];
    int i;
    
    System.out.println("Introduzca 10 numeros:");

    //introducir numeros
    for (i = 0; i < 10; i++) {
      valor[i] = Integer.parseInt(System.console().readLine());
    }

    System.out.println(" ");

    //filtrar primos
    for (int v :valor) {

      if (!(v % 2 == 0 || v % 3 == 0 || v % 5 == 0 || v % 7 == 0 || v % 11 == 0) || v == 2 || v == 3 || v == 5 || v == 7 || v == 11) {
        System.out.print(v + "(nPrimo) ");
      } else {
        System.out.print(v +" ");
      }

    }


  }
}
