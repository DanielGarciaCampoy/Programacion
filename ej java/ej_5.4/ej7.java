/**
 * ej7 tema5
 * DGC
 */
public class ej7 {
    public static void main(String args[]) {

        System.out.println("Introduzca la combinacion correcta para abrir la caja fuerte");
        int intentos = 4;
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        do {
        
            System.out.print("Intoduce el 1er numero: ");
            numero1 = Integer.parseInt(System.console().readLine());
            System.out.print("Intoduce el 2ndo numero: ");
            numero2 = Integer.parseInt(System.console().readLine());
            System.out.print("Intoduce el 3er numero: ");
            numero3 = Integer.parseInt(System.console().readLine());
            System.out.print("Intoduce el 4o numero: ");
            numero4 = Integer.parseInt(System.console().readLine());
            
            if (!(numero1 == 1 && numero2 == 2 && numero3 == 3 && numero4 == 4)) {
                intentos--;
                System.out.println("Combinación erronea, te quedan " + intentos + " intentos");    
            }

        } while (!((intentos == 0) || (numero1 == 1 && numero2 == 2 && numero3 == 3 && numero4 == 4)));

        if (intentos == 0) {
            System.out.println("Se te acabaron los intentos, no abriste la caja fuerte");
        } else {
            System.out.println("Acertaste, caja fuerte abierta");
        }
    }
}
