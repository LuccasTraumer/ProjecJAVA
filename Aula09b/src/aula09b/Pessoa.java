package aula09b;
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public Pessoa(String nome,int idade,String sexo){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int ida){
        this.idade = ida;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sex){
        this.sexo = sex;
    }
}
