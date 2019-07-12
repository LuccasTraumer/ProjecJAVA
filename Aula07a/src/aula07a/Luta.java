package aula07a;
import java.util.Random;
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    // Metodos Internos
    public void marcarLuta(Lutador l1,Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria())){
            if(l1 != l2){
                this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("Luta Aprovada!");
            }
        }
        else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        if(this.getAprovada() == true){
            System.out.println("### DESAFIADO###");
            this.getDesafiado().apresentar();
            System.out.println("#### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            Random rand = new Random();
            int aleatorio = rand.nextInt(3);
            switch(aleatorio){
                case 0: // Empate
                    System.out.println("Empate entre: "+this.getDesafiado().getNome() + " e "+ this.getDesafiante().getNome());
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1: // Deseafiado Ganhou
                    System.out.println("Vencendor é :"+ this.getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2:// Desafiante ganhou
                    System.out.println("Vencedor é: " + this.getDesafiante().getNome());
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
            }
        }
        else{
            System.out.println("Luta não Pode acontecer");
        }
    }
    
    // Metodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    
    public int getRounds(){
        return rounds;
    }
    public void setRounds(int rounds){
        this.rounds = rounds;
    }
    
    public boolean getAprovada(){
        return aprovada;
    }
    public void setAprovada(boolean aprov){
        this.aprovada = aprov;
    }
}
