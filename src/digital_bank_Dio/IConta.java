package digital_bank_Dio;


public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void imprimirExtrato();

}