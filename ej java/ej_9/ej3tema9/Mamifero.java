public class Mamifero extends Animal {
  
  public Mamifero (Sexo s) {
    super(s);
  }

  public void amamantar() {
    if (this.getSexo() == Sexo.macho) {
      System.out.println("no puedo, soy macho");
    } else {
      System.out.println("amamantando crias...");
    }
  }

  public void alimentarCria() {
    System.out.println("alimentando crias...");
  }

  public void andar() {
    System.out.println("andando");
  }

}
