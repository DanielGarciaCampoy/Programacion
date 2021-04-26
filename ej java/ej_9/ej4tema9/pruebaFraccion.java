/**
 * Ej4tema9: Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los
  métodos pueden ser invierte, simplifica, multiplica, divide, etc.
 */

public class pruebaFraccion {

  public static void main(String[] args) {
  
    Fraccion a = new Fraccion(4, 2);
    a.invierte();
    a.multiplica(4);
    a.divide(2);
    a.simplifica();

    Fraccion b = new Fraccion (1,0);

    Fraccion c = new Fraccion (9, 4);
    c.simplifica();
    c.multiplica(-1);
    c.divide(0);

  }

}