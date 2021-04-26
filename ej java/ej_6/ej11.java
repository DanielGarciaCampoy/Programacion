public class ej11 {
  public static void main(String[] args) {

    //variables
    int suspenso = 0;
    int aprobado = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;

    //generar notas
    int nota = 0;
    for (int i = 0; i < 20; i++) {

      nota = (int) (Math.random() * 11);
      System.out.print(nota);

      switch (nota) {
        case 1: case 2: case 3: case 4:
        suspenso++;
        System.out.print(" (suspenso) ");
        break;

        case 5:
        aprobado++;
        System.out.print(" (aprobado) ");
        break;

        case 6:
        bien++;
        System.out.print(" (bien) ");
        break;

        case 7: case 8:
        notable++;
        System.out.print(" (notable) ");
        break;

        case 9: case 10:
        sobresaliente++;
        System.out.print(" (sobresaliente) ");
        break;
      }
    }

    //recuento
    System.out.println("");
    System.out.println("Suspensos: " + suspenso);
    System.out.println("Aprobado: " + aprobado);
    System.out.println("Bien: " + bien);
    System.out.println("Notables: " + notable);
    System.out.println("Sobresalientes: " + sobresaliente);


  }
}
