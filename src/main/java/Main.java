
public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Andre");
        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);
        cc.depositar(100.0);
        cc.transferir(100.0,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
