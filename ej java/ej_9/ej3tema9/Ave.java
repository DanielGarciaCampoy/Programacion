
public class Ave extends Animal {
  
  private Sexo sexo;

  public Ave (Sexo s) {
    super(s);
  }

  //metodos
  public void ponerHuevo() {
    if (this.getSexo() == Sexo.macho) {
      System.out.println("no puedo, soy macho");
    } else {
      System.out.println("poniendo huevos...");
    }
  }

  public void volar() {
    System.out.println("volando...");
  }

  public void aterrizar() {
    System.out.println("aterrizando...");
  }

}
