package aula02;

public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "BIC Cristal";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.carga = 90;
        Caneta c2 = new Caneta();
        c2.cor = "Vermelha";
        c2.modelo = "BIC";
        c2.ponta = 1.0f;
        c2.tampada = true;
        c2.carga = 50;
        
        c1.rabiscar();
        
        
    }
    
}
