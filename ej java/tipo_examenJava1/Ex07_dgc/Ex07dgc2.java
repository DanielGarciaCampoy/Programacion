import java.util.Scanner;
/**
 * Daniel Garcia Campoy
 * 11/11/20
 * 1DAM
**/
public class Ex07dgc2 {
  public static void main(String []args) {
    Scanner s = new Scanner(System.in);
    
    double precio = 0;
    double unidadPolo = 0;
    
    //cantidad de polos
    double polos;

    do {
      System.out.print("Numero de polos a pedir (pedido min. 20u): ");
      polos = Integer.parseInt(System.console().readLine());

      if (polos < 20) {
        System.out.println("El pedido min. es de 20 polos, intentalo de nuevo");
      }
    } while (polos < 20);

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
    
    //blanco o color
    String color;

    do {
      System.out.println("En blanco o en color?"); 
      System.out.print("Introduzca blanco o color: ");
      color = s.next();
      if (!(color.equals("blanco") || color.equals("color"))) {
        System.out.println("Error, introduzca blanco o color");
      }
    } while (!(color.equals("blanco") || color.equals("color"))); // != significa "contrario a:"

      if (color.equals("color")) {
        precio = precio * 1.2;
      }

    //serigrafia o bordado
    String tecnica;

    do {
      System.out.print("Serigrafia o bordado?: ");
      tecnica = s.next();
      if (!(tecnica.equals("serigrafia") || tecnica.equals("bordado"))) {
        System.out.println("Dato incorrecto, introduzca serigrafia o bordado");
      }
    } while (!(tecnica.equals("serigrafia") || tecnica.equals("bordado")));

    if (tecnica.equals("serigrafia")) {
      if (polos < 50) {
        precio = precio + (polos * 2);
      }
      if (polos >= 50) {
        precio = precio + (polos * 1.5);
      }
      }
    if (tecnica.equals("bordado")) {
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
    if (color.equals("blanco")) { //si polo blanco
      System.out.println("Polo blanco (unidades): " + polos);
    }
    if (color.equals("color")) { //si polo en color
      System.out.println("Polo en color (unidades): " + polos);
    }
    
    System.out.println("Precio unitario: " + unidadPolo + " euros"); //unidadPolo
    double totalTextil = unidadPolo * polos;
    System.out.println("Total textil: " + totalTextil + " euros"); //totalTextil
    
    double tecnicaUnidad = 0;
    if (tecnica.equals("serigrafia") && polos < 50) { 
      tecnicaUnidad = 2;
      System.out.println("Serigrafia (c.unidad): " + tecnicaUnidad + " euros"); //Serigrafia unidad
    }
    if (tecnica.equals("serigrafia") && polos >= 50) {
      tecnicaUnidad = 1.5;
      System.out.println("Serigrafia (c.unidad): " + tecnicaUnidad + " euros");
    }
    
    if (tecnica.equals("bordado") && polos < 50) { 
      tecnicaUnidad = 3;
      System.out.println("Bordado (c.unidad): " + tecnicaUnidad + " euros"); //Bordado unidad
    }
    if (tecnica.equals("bordado") && polos >= 50) { 
      tecnicaUnidad = 2.5;
      System.out.println("Bordado (c.unidad): " + tecnicaUnidad + " euros");
    }
    
    double precioTecnica = tecnicaUnidad * polos; //tecnicaTotal
    if (tecnica.equals("serigrafia")) {
    System.out.println("Total serigrafia: " + precioTecnica + " euros");
    }
    if (tecnica.equals("bordado")) {
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
