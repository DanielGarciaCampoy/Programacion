/** 
 * ej11 relacion 4.6
 * DGC
*/
public class ej11 {
    public static void main(String[] args) {
        
        System.out.println("Calcula los segundos que quedan hasta la medianoche:");
        System.out.println("");

        System.out.print("Hora (formato 24h): ");
        int hora = Integer.parseInt(System.console().readLine());
        System.out.print("Minutos: ");
        int minuto = Integer.parseInt(System.console().readLine());

        int segundos = (24 * 3600) - (hora * 3600 + minuto * 60);
        System.out.println("Segundos que quedan hasta la medianoche: " + segundos);
    }
}
