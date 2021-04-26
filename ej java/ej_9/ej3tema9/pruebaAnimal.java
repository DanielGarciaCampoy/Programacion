
public class pruebaAnimal {
/**
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
  al menos, tres métodos específicos de cada clase y redefne el/los método/s
  cuando sea necesario. Prueba las clases creadas en un programa en el que se
  instancien objetos y se les apliquen métodos.
 */
  public static void main(String[] args) {
    
    Pinguino tux = new Pinguino(Sexo.macho);
    tux.come("palomitas");
    tux.deslizarse();

    Perro a = new Perro(Sexo.hembra);
    a.duerme();
    a.darPata();
    a.amamantar();
    a.sentarse();

    Lagarto godzilla = new Lagarto(Sexo.macho);
    godzilla.tomaElSol();
    godzilla.duerme();


  }

}