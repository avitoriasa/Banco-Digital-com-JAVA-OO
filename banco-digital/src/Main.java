import javax.swing.JOptionPane;

public abstract class Main {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Ol?, cliente! Digite o seu nome:");
		
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		
		Conta conta1 = new ContaCorrente(cliente);
		Conta conta2 = new ContaPoupanca(cliente);
		Object[] optionsConta = {conta1, conta2};
		JOptionPane.showOptionDialog(null, "Selecione conta1 para Conta Corrente e conta2 para Conta Poupan?a",
				null, JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, optionsConta, optionsConta[0]);
		
		cliente.boasVindas();
		
		conta1.depositar(100);
		conta2.depositar(500);
		conta2.transferir(100, conta1);
		
		conta1.imprimirExtrato();
		conta2.imprimirExtrato();
	}
}
