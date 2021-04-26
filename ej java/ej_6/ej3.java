public class ej3 {
  public static void main(String[] args) {
    
    //carta
    int carta = (int) (Math.random() * 11);

    switch (carta) {
      case 1:
        System.out.print("As de ");
      break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
        System.out.print(carta + " de ");
      break;
      case 8:
        System.out.print("Sota de ");
      break;
      case 9:
        System.out.print("Caballo de ");
      break;
      case 10:
        System.out.print("Rey de ");
      break;
    }

    //palo
    int palo = (int) (Math.random() * 4);

    switch (palo) {
      case 0:
        System.out.println("palos");
      break;
      case 1:
        System.out.println("oros");
      break;
      case 2:
        System.out.println("espadas");
      break;
      case 3:
        System.out.println("copas");
      break;
    }

  }
}
