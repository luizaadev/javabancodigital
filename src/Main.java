public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente("Marcos");
        Conta poupanca = new ContaPoupanca("Maria");

        cc.depositar(05);
        cc.transferir(10, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();



    }
}
