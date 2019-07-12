package aula10b;
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    
    

    
    public void cancelarMatricula(){
        
    }
    
    // Metodos Especiais
    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int mat){
        this.matricula = mat;
    }
    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String curs){
        this.curso = curs;
    }
}
