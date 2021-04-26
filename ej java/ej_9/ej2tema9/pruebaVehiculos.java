/**
 * pruebaVehiculos
 */
public class pruebaVehiculos {

  public static void main(String[] args) {

    //objetos
    bicicleta decathlon = new bicicleta(2);
    coche supra = new coche(200);
  
    //menu
    int r = 0; //nº escogido
    while (r != 8) {

      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      do {
        if (r < 1 || r > 8) {
          System.out.println("Tiene que ser un numero entre 1 y 8");
        }
        System.out.print("Elige una opción (1-8): ");
        r = Integer.parseInt(System.console().readLine());
      } while (r < 1 || r > 8); //do while

      switch (r) {
        case 1:
          System.out.println("Cuantos km quieres andar con la bici?: ");
          int k = Integer.parseInt(System.console().readLine());
          decathlon.recorre(k);
        break;
        case 2:
          decathlon.caballito();
        break;
        case 3:
          System.out.println("Cuantos km quieres andar con el coche?: ");
          int m = Integer.parseInt(System.console().readLine());
          supra.recorre(m);
        break;
        case 4:
          supra.quemarRueda();
        break;
        case 5:
          System.out.println("Se han recorrido con la bici: " + decathlon.getKilometrosRecorridos() + "km");
        break;
        case 6:
          System.out.println("Se han recorrido con el coche: " + supra.getKilometrosRecorridos() + "km");
        break;
        case 7:
          System.out.println("En total se han recorrido: " + vehiculo.getKmTotales() + "km");
        break;
      } //switch

      System.out.println("");
    } //while

  }

}