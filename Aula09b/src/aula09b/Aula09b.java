package aula09b;
public class Aula09b {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Lucas",20,"M");
        p[1] = new Pessoa("Maria",18,"F");
        
        l[0] = new Livro("Aprendendo JAVA","Gustavo Guanabara",32,p[0]);
        l[1] = new Livro("Aprendendo Python","Gustavo G",100,p[0]);
        l[2] = new Livro("A Culpa é das Estrelas","John Green",232,p[1]);
        
        System.out.println(l[0].detalhes());
    }
    
}
