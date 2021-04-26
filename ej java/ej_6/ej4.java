public class ej4 {
  public static void main(String[] args) {
    
    int[] n = new int[20];

    //generación numeros
    for (int i = 0; i < 20; i++) {
      n[i] = (int) (Math.random() * 11);
      System.out.print(n[i] + " ");
    }

  }
}