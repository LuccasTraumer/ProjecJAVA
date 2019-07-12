package aula5a;
import java.util.Scanner;
public class Aula5a {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("------- Criando Conta ----------");
        
        
        System.out.println("Numero da Conta: ");
        int numeroConta = teclado.nextInt();
        
        System.out.println("-----------------");
        System.out.println("Nome: ");
        String nome = teclado.next();
        
        System.out.println("-----------------");
        System.out.println("Saldo conta: ");
        double saldo = teclado.nextDouble();
        
        System.out.println("-----------------");
        System.out.println("CC = Conta Corrente - CP = Conta Poupança");
        System.out.println("Tipo da Conta: ");
        String tipoConta = teclado.next().toLowerCase();
        /*
        System.out.println("------ Criando Conta ------");
        int numeroC;
        String tipoConta;
        String nome;
        double saldo;
        */
        ContaBanco lucas;
        lucas = new ContaBanco();
        
        lucas.setDonoConta(nome);
        lucas.setNumConta(numeroConta);
        
        lucas.setTipoConta(tipoConta);
        lucas.abrirConta();
        lucas.depositar(saldo);
        
        
        System.out.println("O Estado da conta é: "+lucas.getStatusConta());
        System.out.println("O Saldo da Conta é: "+lucas.getSaldoConta());
        System.out.println("O Dono é: "+lucas.getDonoConta());
        System.out.println("Numero da Conta: "+lucas.getNumConta());
        System.out.println("Tipo da Conta: "+lucas.getTipoConta());
        
    }
    
}
