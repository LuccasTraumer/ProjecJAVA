package aula06;
public class ControleRemoto implements Controlador{
    // Atributos 
    private int volume;
    private boolean ligado;
    private boolean tocando;




    // Contrutor 
    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }
    
    // Propriedades/ Metodos Espreciais
    private int getVolume(){
        return this.volume;
    }
    private void setVolume(int vol){
        this.volume = vol;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    private void setLigado(boolean lig){
        this.ligado = lig;
    }
    private boolean getTocando(){
        return this.tocando;
    }
    private void setTocando(boolean tocand){
        this.tocando = tocand;
    }
    // Metodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("---------Menu-----------");
        System.out.println("Esta Ligado?: "+this.getLigado());
        System.out.println("Esta Tocando?: "+ this.getTocando());
        System.out.print("Volume:"+this.getVolume());
        
        for(int i = 0; i <= this.getVolume();i+=10){
            System.out.print("|");
        }
        
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() == true){
            this.setVolume(this.getVolume() +1);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() == true){
            this.setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() == true && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() == true && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() == true && this.getTocando() == false){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() == true && this.getTocando() == true){
            this.setTocando(false);
        }
    }
}
