public class ej1 {
  public static void main(String[] args) {
    
    int[] n = new int[12];

    System.out.println("Índice:     Valor:");
    for (int i = 0; i < 12; i++) {
      System.out.print(i + "            ");
      n[i] = (int) (Math.random()* 201);
      System.out.println(n[i]);
    }


  }
}
