package aula10b;
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    // Metodo Interno
    public void fazerAniversario(){
        this.setIdade(this.getIdade()+1);
    }
    
    // Construtor
    /*public Pessoa(String nome,int idade,String sex){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sex);
    }
    */
    // Metodos Especiais
    
    public String getNome()
    {
        return this.nome;
    }
    public void setNome(String no)
    {
        this.nome = no;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sex){
        this.sexo = sex;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
     
}
