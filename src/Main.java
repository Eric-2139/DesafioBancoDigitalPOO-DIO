
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		ContaInvestimento investimento = new ContaInvestimento(venilton);

		cc.depositar(11100);
		cc.transferir(100, poupanca);
		cc.transferir(2000, investimento);

		investimento.investirAcao(null, 500);
		investimento.investirFII(null, 500);
		investimento.investirRendaFixa(null, 500);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		investimento.imprimirExtrato();
	}

}
