
public class Main {

	public static void main(String[] args) {
		Cliente kaye = new Cliente();
		kaye.setNome("Kaye");
		
		Conta cc = new ContaCorrente(kaye);
		Conta poupanca = new ContaPoupanca(kaye);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}