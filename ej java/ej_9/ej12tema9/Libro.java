public class Libro extends Publicacion {

  //atributos
  private boolean estaPrestado;

  public Libro (String ISBN, String tit, int ano) {
    super(ISBN, tit, ano);
    this.estaPrestado = false;
  }

  //get y to
  public String toString() {
    if (estaPrestado) {
      return "ISBN: " + this.ISBN + ", titulo: " + this.titulo + " , ano de publicacion: " + this.anoPublicacion + "(prestado)";
    } else {
      return "ISBN: " + this.ISBN + ", titulo: " + this.titulo + " , ano de publicacion: " + this.anoPublicacion + "(no prestado)";
    } //if else
  }

  //metodos
  public boolean estaPrestado() {
    return this.estaPrestado;
  }

  public void presta() {
    if (this.estaPrestado) {
      System.out.println("lo siento, el libro ya esta prestado");
    }

    this.estaPrestado = true;
  }

  public void devuelve() {
    this.estaPrestado = false;
  }

}
