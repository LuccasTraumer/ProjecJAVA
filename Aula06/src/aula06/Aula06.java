package aula06;
public class Aula06 {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        for(int i= 0; i < 5;i++)
            c.maisVolume();
        c.ligarMudo();
        c.abrirMenu();
        c.fecharMenu();
    }
    
}
