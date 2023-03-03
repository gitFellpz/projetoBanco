package br.com.Itau;

public class Executor {
	public static void main(String[] args) {
		
		Conta Felipe = new Conta();
		
		Felipe.setDonoConta("Felipe");
		Felipe.setNumConta(1111);
		
		Felipe.estadoAtual();
		Felipe.abrirConta("CP");
		Felipe.estadoAtual();
		Felipe.depositar(100);
		Felipe.estadoAtual();
		Felipe.sacar(10);
		Felipe.estadoAtual();
		Felipe.pagarMensal();
		Felipe.estadoAtual();
		Felipe.fecharConta();
		Felipe.estadoAtual();
	}
}
