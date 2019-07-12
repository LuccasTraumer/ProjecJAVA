
package aula02;


public class Caneta {
    public String cor;
    public String modelo;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void rabiscar()
    {
        if(this.tampada == true || this.carga <= 0){
            System.out.println("ERRO, Não tenho carga ou estou tampada");
        }else{
            System.out.println("Estou Rabiscando!");
        }
    
    }
    public void status()
    {
        System.out.println("A Cor é: "+ this.cor);
        System.out.println("O Modelo é: "+this.modelo);
        System.out.println("Tamanho da Ponta é: "+this.ponta);
        System.out.println("Total de Carga é: "+this.carga+"%");
        System.out.println("Esta tampada?: "+this.tampada);
    }
    protected void tampar()
    {
        this.tampada = true;
    }
    
    protected void destampar()
    {
        this.tampada = false;
        
        
    }
    
}
