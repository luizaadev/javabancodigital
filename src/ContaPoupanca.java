public class ContaPoupanca extends Conta{
    public ContaPoupanca(String cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("-----Extrato conta Poupanca-----");
        super.imprimirInformacoesConta();

    }

}
