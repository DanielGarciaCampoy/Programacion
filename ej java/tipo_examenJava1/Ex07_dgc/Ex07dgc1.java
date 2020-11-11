/**
 * Daniel Garcia Campoy
 * 11/11/20
 * 1DAM
**/
public class Ex07dgc1 {
  public static void main(String []args) {
    
    double precio = 0;
    double unidadPolo = 0;
    
    System.out.print("Numero de polos a pedir (pedido min. 20u): ");
    double polos = Integer.parseInt(System.console().readLine());
    if (polos >= 20 || polos <= 39) {
      precio = 4.9 * polos;
      unidadPolo = 4.9;
    }
    if (polos >= 40 || polos <= 99) {
      precio = 3.9 * polos;
      unidadPolo = 3.9;
    }
    if (polos >= 100) {
      precio = 3.2 * polos;
      unidadPolo = 3.2;
    }
    
    System.out.println("En blanco o en color?"); 
    System.out.print("Introduce 1 para blanco y 2 para color: ");
    int color = Integer.parseInt(System.console().readLine());
    if (color == 2) {
      precio = precio * 1.2;
    }
    
    System.out.print("Serigrafia (1) o bordado (2)?: ");
    int tecnica = Integer.parseInt(System.console().readLine());
    if (tecnica == 1) {
      if (polos < 50) {
        precio = precio + (polos * 2);
      }
      if (polos >= 50) {
        precio = precio + (polos * 1.5);
      }
    }
    if (tecnica == 2) {
      if (polos < 50) {
        precio = precio + (polos * 3);
      }
      if (polos >= 50) {
        precio = precio + (polos * 2.5);
      }
    }
    
    //PRESUPUESTO
    System.out.println("");
    System.out.println("PRESUPUESTO: ");
    System.out.println("");
    if (color == 1) { //si polo blanco
      System.out.println("Polo blanco (unidades): " + polos);
    }
    if (color == 2) { //si polo en color
      System.out.println("Polo en color (unidades): " + polos);
    }
    
    System.out.println("Precio unitario: " + unidadPolo + " euros"); //unidadPolo
    double totalTextil = unidadPolo * polos;
    System.out.println("Total textil: " + totalTextil + " euros"); //totalTextil
    
    double tecnicaUnidad = 0;
    if (tecnica == 1 && polos < 50) { 
      tecnicaUnidad = 2;
      System.out.println("Serigrafia (c.unidad): " + tecnicaUnidad + " euros"); //Serigrafia unidad
    }
    if (tecnica == 1 && polos >= 50) {
      tecnicaUnidad = 1.5;
      System.out.println("Serigrafia (c.unidad): " + tecnicaUnidad + " euros");
    }
    
    if (tecnica == 2 && polos < 50) { 
      tecnicaUnidad = 3;
      System.out.println("Bordado (c.unidad): " + tecnicaUnidad + " euros"); //Bordado unidad
    }
    if (tecnica == 2 && polos >= 50) { 
      tecnicaUnidad = 2.5;
      System.out.println("Bordado (c.unidad): " + tecnicaUnidad + " euros");
    }
    
    double precioTecnica = tecnicaUnidad * polos; //tecnicaTotal
    if (tecnica == 1) {
    System.out.println("Total serigrafia: " + precioTecnica + " euros");
    }
    if (tecnica == 2) {
    System.out.println("Total bordado: " + precioTecnica + " euros");
    }
    
    double poloLogotipo = totalTextil + precioTecnica; //polo con logotipo
    
    double iva = precio * 0.21; //IVA
    System.out.println("IVA: " + iva + " euros");
    
    System.out.println("");
    double total = precio + iva; //total
    System.out.println("TOTAL: " + total + " euros");
  }
}
