
public class Fraccion {

  //atributos
  private int numerador;
  private int denominador;

  public Fraccion (int n, int d) {
    if (d == 0) {
      System.out.println("Una fracción no puede tener 0 de denominador");
    } else {
      if (n < 0 && d < 0) {
        this.numerador = Math.abs(n);
        this.denominador = Math.abs(d);
      } else {
        this.numerador = n;
        this.denominador = d;
      } //if else
    } //if else
  }

  //metodos
  public void invierte() { 
    System.out.println(denominador + "/" + numerador);
  }

  public void simplifica() {

    boolean simplificable = false;
    int s = 9; //simplificador

    do {
      if (numerador % s == 0 && denominador % s == 0) {
        simplificable = true;

        numerador /= s;
        denominador /= s;
      } //if else
      s--;
    } while (!simplificable || s >= 2);

    if (simplificable) {
      System.out.println(numerador + "/" + denominador);
    } else {
      System.out.print("No se pudo simplificar: ");
    }

  }

  public void multiplica(int multiplicador) {

    numerador *= multiplicador;

    System.out.println(numerador + "/" + denominador);

  }

  public void divide(int divisor) {

    if (divisor == 0) {
      System.out.println("No se puede dividir entre 0");
    } else {

      numerador /= divisor;

    } //if else

    System.out.println(numerador + "/" + denominador);

  }

}
