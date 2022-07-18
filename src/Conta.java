public abstract class Conta implements IConta {
    private static int agencia_padrao = 1;
    private static int sequencia = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected String nomeCorrentista;

    public Conta(String cliente) {
        this.agencia = Conta.agencia_padrao;
        this.numero = Conta.sequencia++;
        this.nomeCorrentista = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (valor <= saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    protected void imprimirInformacoesConta() {
        System.out.println(String.format("Titular: %s", this.getNomeCorrentista()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %2f", this.saldo));
    }

}
