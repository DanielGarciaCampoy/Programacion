/**
 * FichaDomino
 */
public class FichaDomino {

  public int n1;
  public int n2;

  public FichaDomino () {
    this.n1 = (int) (Math.random() * 7);
    this.n2 = (int) (Math.random() * 7);
  }

  public String toString() {
    return "[" + n1 + "|" + n2 + "] ";
  }

}