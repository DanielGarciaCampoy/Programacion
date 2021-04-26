public class Revista extends Publicacion {
  
  //atrubutos
  public int nRevista;
  
  public Revista (String ISBN, String tit, int ano, int n) {
    super(ISBN, tit, ano);
    this.nRevista = n;
  }

  //get y to
  public String toString() {
    return "ISBN: " + this.ISBN + ", titulo: " + this.titulo + " , ano de publicacion: " + anoPublicacion;
  }

}
