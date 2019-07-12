package aula09b;
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    
    public Livro(String titulo,String autor,int totPag,Pessoa leito){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPag);
        this.setPagAtual(0);
        this.setLeitor(leito);
    }

    public String detalhes() {
        return "Livro{" + "\n titulo=" + titulo + "\n autor=" + autor + "\n totPaginas=" + 
                totPaginas + "\n pagAtual=" + pagAtual + "\n aberto=" 
                + aberto + "\n leitor=" + leitor.getNome() + '}';
    }
    
    
    
    
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
      if(this.getAberto() == false)
          this.setAberto(true);
    }

    @Override
    public void fechar() {
        if(this.getAberto() == true)
            this.setAberto(false);

    }

    @Override
    public void folhear() {
        for(int pag =0;pag < this.getTotPaginas();pag++){
            
        }

    }

    @Override
    public void avancarPag() {
        if(this.getAberto() == true && this.getPagAtual() < this.getTotPaginas()){
            this.setPagAtual(this.getPagAtual()+1);
        }
    }

    @Override
    public void voltarPag() {
        if(this.aberto == true){
            if(this.getPagAtual() > 0){
                this.setPagAtual(this.getPagAtual() -1);
            }
            else{
                System.out.println("Está na Primeira Pagina");
            }
        }
    }
    
    
}
