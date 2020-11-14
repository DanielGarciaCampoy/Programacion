package ej;
/**
 * ej 6 relacion 4.5
 * 
 * DGC
 */
public class ej6 {
  public static void main(String []args) {
    
    System.out.println("Formula que calcula el tiempo que tarda en caer un objeto desde una altura h");
    
    System.out.print("Valor de h: ");
    double h;
    h = Integer.parseInt(System.console().readLine());
    
    double t;
    t = ( 2 * h / 9.81 ) * Math. pow(1, 2);
    System.out.println("t(s)= " + t);
  }
}
