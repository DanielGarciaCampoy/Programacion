/** 
 * ej10 relacion 4.5
 * 
 * DGC
*/
public class ej10 {
    public static void main(String[] args) {

        System.out.print("Mes de nacimiento (en nº): ");
        int mes = Integer.parseInt(System.console().readLine());
        System.out.print("Día de nacimiento: ");
        int dia = Integer.parseInt(System.console().readLine());

        String horoscopo = "";
        switch (mes) {
            case 1: //enero
            if (dia >= 21) {
                horoscopo = "Acuario";
            } else {
                horoscopo = "Capricornio";
            } 
            break;

            case 2: //febrero
            if (dia <= 19) {
                horoscopo = "Acuario";
            } else {
                horoscopo = "Piscis";
            } 
            break;

            case 3: //marzo
            if (dia <= 20) {
                horoscopo = "Piscis";
            } else {
                horoscopo = "Aries";
            } 
            break;

            case 4: //abril
            if (dia < 21) {
                horoscopo = "Aries";
            } else {
                horoscopo = "tauro";
            } 
            break;
        
            case 5: //mayo
            if (dia <= 20) {
                horoscopo = "Tauro";
            } else {
                horoscopo = "Geminis";
            } 
            break;

            case 6: //Junio
            if (dia < 22) {
                horoscopo = "Geminis";
            } else {
                horoscopo = "Cancer";
            } 
            break;

            case 7: //Julio
            if (dia < 23) {
                horoscopo = "Cancer";
            } else {
                horoscopo = "Leo";
            } 
            break;

            case 8: //Agosto
            if (dia < 24) {
                horoscopo = "Leo";
            } else {
                horoscopo = "Virgo";
            } 
            break;

            case 9: //Septiembre
            if (dia < 23) {
                horoscopo = "Virgo";
            } else {
                horoscopo = "Libra";
            } 
            break;

            case 10: //Octubre
            if (dia < 23) {
                horoscopo = "Libra";
            } else {
                horoscopo = "Escorpio";
            } 
            break;

            case 11: //Noviembre
            if (dia < 23) {
                horoscopo = "Escorpio";
            } else {
                horoscopo = "Sagitario";
            } 
            break;

            case 12: //Noviembre
            if (dia < 23) {
                horoscopo = "Sagitario";
            } else {
                horoscopo = "Capricornio";
            } 
            break;

            default:
            System.out.println("Datos incorrectos");
            break;
        }

        System.out.println("Tu horoscopo es: " + horoscopo);
    }
}