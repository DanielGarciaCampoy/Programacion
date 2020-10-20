/**
*ej6 relacion 2.6
* 
*DGC
*/
public class ej6 {
  public static void main(String[]args) {
    double sinIVA;
    sinIVA = (double) 100;
    double division;
    division = (double) 21 / (double) 100;
    double conIVA;
    conIVA = (double) sinIVA + (double) (sinIVA * division);

  System.out.println("Precio con IVA incluido: " + conIVA);
  }
}
