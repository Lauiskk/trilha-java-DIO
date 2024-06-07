public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Cliente");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(100);
        poupanca.depositar(200);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
