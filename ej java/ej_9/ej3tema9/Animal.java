public abstract class Animal {

  private Sexo sexo;

  public Animal (Sexo s) {
    this.sexo = s;
  }

  public Sexo getSexo() {
    return this.sexo;
  }

  public void duerme() {
    System.out.println("zzz...");
  }

  public void come(String comida) {
    System.out.println("comiendo " + comida);
  }

}
