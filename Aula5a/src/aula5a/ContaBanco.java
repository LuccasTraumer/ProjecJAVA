package aula5a;
public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private double saldoConta;
    private boolean statusConta;
    
    // Construtor 
    public ContaBanco(){
        setStatusConta(false);
        setSaldoConta(0.0);
    }
    
    // Metodos 
    public void abrirConta(){
        setStatusConta(true);
        if(this.getTipoConta().equals("cc")){
            this.setSaldoConta(this.getSaldoConta() + 50.0);
        }
        if(this.getTipoConta().equals("cp"))
            this.setSaldoConta(this.getSaldoConta() + 150.0);
    }
    public void fecharConta(){
        if(this.getSaldoConta() == 0)
            setStatusConta(false);
        if(this.getSaldoConta() > 0)
            System.out.println("Saldo Maior que 0");
        if(this.getSaldoConta() < 0)
            System.out.println("Voce esta em Debito!");
    }
    public void depositar(double depos){
        if(this.getStatusConta() == true)
            this.setSaldoConta(this.getSaldoConta()+ depos);
        else
            System.out.println("Conta Fechada!");
    }
    public void sacar(double sacar){
        if(this.getStatusConta() == true){
        if(sacar <= this.getSaldoConta())
            this.setSaldoConta(this.getSaldoConta() - sacar);
        System.out.println("Valor Além do Saldo!");
        }
    }
    public void pagarMensal(){
        if(this.getTipoConta() == "cc")
            this.setSaldoConta(this.getSaldoConta() - 12);
        if(this.getTipoConta() == "cp")
            this.setSaldoConta(this.getSaldoConta() - 20);
    }
    
    // Propriedades 
    // Propriedades NumeroConta
    public int getNumConta(){
        return numConta;
    }
    public void setNumConta(int num){
        this.numConta = num;
    }
    // Propriedade Tipo da Conta
    public String getTipoConta(){
        return tipoConta;
    }
    public void setTipoConta(String tipo){
        this.tipoConta = tipo;
    }
    // Propriedades Dono Conta
    public String getDonoConta(){
        return donoConta;
    }
    public void setDonoConta(String dono){
        this.donoConta = dono;
    }
    // Propriedades Saldo Conta
    public double getSaldoConta(){
        return saldoConta;
    }
    public void setSaldoConta(double saldo){
        this.saldoConta = saldo;
    }
    // Propriedades status conta
    public boolean getStatusConta(){
        return statusConta;
    }
    public void setStatusConta(boolean status){
        this.statusConta = status;
    }
}
