public class coche extends vehiculo {

  private int caballos;

  public coche(int c) {
    super();
    this.caballos = c;
  }

  public void quemarRueda() {
    System.out.println("quemando rueda...");
  }

}
