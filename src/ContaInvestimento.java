public class ContaInvestimento extends Conta implements Investimentos {

    private double valorInvestidoAcao;
    private double valorInvestidoFII;
    private double valorInvestidoRendaFixa;

    public ContaInvestimento(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void investirAcao(String acao, double valor) {
       saldo -= valor;
       valor = valorInvestidoAcao;
    }

    @Override
    public void investirFII(String fundoImobiliario, double valor) {
        saldo -= valor;
        valor = valorInvestidoFII;
    }

    @Override
    public void investirRendaFixa(String rendaFixa, double valor) {
        saldo -= valor;
        valor = valorInvestidoRendaFixa;
    }

    public double getValorInvestidoAcao() {
        return valorInvestidoAcao;
    }

    public double getValorInvestidoFII() {
        return valorInvestidoFII;
    }

    public double getValorInvestidoRendaFixa() {
        return valorInvestidoRendaFixa;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Investimento ===");
		super.imprimirInfosComuns();
        System.out.println("Valor em ações: " + valorInvestidoAcao);
        System.out.println("Valor em FIIs: " + valorInvestidoFII);
        System.out.println("Valor em Renda Fixa: " + valorInvestidoRendaFixa);
    }

   
}
