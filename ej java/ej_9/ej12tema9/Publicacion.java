public abstract class Publicacion {
  
  //atributos
  public String ISBN;
  public String titulo;
  public int anoPublicacion;

  public Publicacion(String ISBN, String tit, int ano) {
    this.ISBN = ISBN;
    this.titulo = tit;
    this.anoPublicacion = ano;
  }


}
