package digital_bank_Dio;



public class Main {
    public static void main(String[] args) {

        Cliente marcelo = new Cliente();
        marcelo.setNome("Marcelo");

        Conta cc = new ContaCorrente(marcelo);
        Conta cp = new ContaPoupanca(marcelo);
        
        cc.depositar(200);
        cc.imprimirExtrato();

        cc.transferir(100, cp);

        cp.imprimirExtrato();
        cc.imprimirExtrato();
        
        Cliente assis = new Cliente();
        assis.setNome("Assis");
        
        Conta cc1 = new ContaCorrente(assis);
        Conta cp1 = new ContaPoupanca(assis);
        cc1.depositar(500);
        cc1.imprimirExtrato();

        cc1.transferir(200, cp1);

        cp1.imprimirExtrato();
        cc1.imprimirExtrato();
    }
}