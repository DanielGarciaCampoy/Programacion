/**
*ej4 relacion 3.4
*
*DGC
*/
public class ej4 {
	public static void main(String []args) {
    
    String linea;
    
		System.out.print("Introduzca el 1er numero: ");
		linea = System.console().readLine();
    double numero1;
    numero1 = Double.parseDouble(linea);
    
    System.out.print("Introduzca el 2ndo numero: ");
    linea = System.console().readLine();
    double numero2;
    numero2 = Double.parseDouble(linea);
    
    double suma;
    suma = numero1 + numero2;
    System.out.println("La suma de ambos es: " + suma);
    
    double resta;
    resta = numero1 - numero2;
    System.out.println("El 1er numero menos el 2ndo es: " + numero2);
	}
}
