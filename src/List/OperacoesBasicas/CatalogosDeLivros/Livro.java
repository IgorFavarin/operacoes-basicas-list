package List.OperacoesBasicas.CatalogosDeLivros;

public class Livro {
    //atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //construtor
    public Livro(String Titulo, String Autor, int AnoPublicacao){
        this.titulo = Titulo;
        this.autor = Autor;
        this.anoPublicacao = AnoPublicacao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Produto [Titulo=" + titulo + ", Autor=" + autor + ", Ano de publicação=" + anoPublicacao + "]\n";
    }

    
}
