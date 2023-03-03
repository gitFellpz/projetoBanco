package br.com.Itau;

import java.util.Scanner;

public class Conta {
	Scanner input = new Scanner(System.in);
	
	//Atributos
	public int numConta;
	protected String tipoConta;
	private String donoConta;
	private double saldo;
	private boolean status;
	
	
	//Construtor
	public Conta() {
		this.saldo = 0;
		this.status = false;
	}
	
	
	//Métodos
	public void estadoAtual() {
		System.out.println(
				"\n------------------------"
				+ "\nConta: " + this.getNumConta()
				+ "\nTipo: "+ this.getTipoConta()
				+ "\nDono: "+ this.getDonoConta()
				+ "\nStatus: "+ this.isStatus()
				+ "\nSaldo: "+ this.getSaldo());
	}
	
	public void abrirConta(String tipoConta) {
		if((tipoConta == "CP") || (tipoConta == "CC")) {
			switch(tipoConta) {
				case "CP":
					this.saldo =+ 150;
					//this.setSaldo(150)
					break;
				case "CC":
					this.saldo =+ 50;
					//this.setSaldo(50)
					break;
			}
			this.status = true;
			this.tipoConta = tipoConta;
			//this.setStatus(true)
			System.out.println("\nConta de "+this.donoConta+" criada com sucesso!");
		}
		else {
			System.out.println("\nValor incorreto! Digite um valor válido.");
		}
	}
	
	public void fecharConta() {
		if(this.saldo < 0) {
			System.out.println("\nConta em débido!");
		}
		else if(this.saldo >= 0) {
			boolean teste = sacar(this.saldo);
			
			if(teste == true) {
				this.status = false;
				//this.setStatus(false)
				System.out.println("\nConta fechada com sucesso!");
			}
		}
	}
	
	public void depositar(double valor) {
		if(this.status == true) {
			if(valor > 0) {
				this.saldo += valor;
				//this.setSaldo(getSaldo + valor)
				System.out.println("\nDepósito de "+valor+" feito com sucesso!");
			}
			else
				System.out.println("\nDigite um valor maior que 0 para depositar!");
		}
		else
			System.out.println("\nImpossível depositar!");
		
	}
	
	public boolean sacar(double valor) {
		if(this.status == true) {
			if(valor > 0) {
				if(valor <= saldo) {
					this.saldo -= valor;
					//this.setSaldo(this.getSaldo() - v)
					System.out.println("\nSaque de "+valor+" feito com sucesso!");
					return true;
				}
				else
					System.out.println("\nSaldo insuficiente!");
			}
			else
				System.out.println("\nDigite um valor maior que 0 para sacar!");
		}
		else
			System.out.println("\nImpossível sacar!");
		return false;
	}
	
	public void pagarMensal() {
		int mensalCP1 = 20;
		int mensalCC2 = 12;
		
		if(this.status == true) {
			//this.getStatus()
			if((this.saldo > mensalCP1) || (this.saldo > mensalCC2)) {
				switch(this.tipoConta) {
					case "CP":
						saldo -= mensalCP1;
						System.out.println("\nSua mensalidade de "+ mensalCP1 +" reais foi paga!");
						break;
					case "CC":
						saldo -= mensalCC2;
						System.out.println("\nSua mensalidade de "+ mensalCC2 +" reais foi paga!");
						break;
				}
			}
			else
				System.out.println("\nSaldo insuficiente para pagar mensalidade!");

		}
		else
			System.out.println("\nImpossível cobrar a mensalidade!");

	}
	
	
	//Getters e Setters
		public int getNumConta() {
			return numConta;
		}
		
		public void setNumConta(int numConta) {
			this.numConta = numConta;
		}
		
		public String getTipoConta() {
			return tipoConta;
		}
		
		public void setTipoConta(String tipoConta) {
			this.tipoConta = tipoConta;
		}
		
		public String getDonoConta() {
			return donoConta;
		}
		
		public void setDonoConta(String donoConta) {
			this.donoConta = donoConta;
		}
		
		public double getSaldo() {
			return saldo;
		}
		
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		public boolean isStatus() {
			return status;
		}
		
		public void setStatus(boolean status) {
			this.status = status;
		}
}
