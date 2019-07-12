package aula10b;
public class Aula10b {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Lucas");
        p3.setNome("Maria");
        p4.setNome("Joao");
        
        p1.setIdade(13);
        p2.setIdade(20);
        p3.setIdade(30);
        p4.setIdade(50);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
   
    }
    
}
