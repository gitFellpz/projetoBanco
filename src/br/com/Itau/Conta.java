package br.com.Itau;

import java.util.Scanner;

public class Conta {
	Scanner input = new Scanner(System.in);
	
	//Atributos
	public int numConta;
	protected int tipoConta;
	private String donoConta;
	private double saldo;
	private boolean status;
	
	
	//Construtor
	public Conta(int numConta, int tipoConta, String donoConta, double saldo, boolean status) {
		this.numConta = numConta;
		this.tipoConta = tipoConta;
		this.donoConta = donoConta;
		this.saldo = 0;
		this.status = false;
	}
	
	
	//Métodos
	public void abrirConta(int tipoConta) {		
		if((this.tipoConta == 1) || (this.tipoConta == 2)) {
			switch(this.tipoConta) {
				case 1:
					this.saldo =+ 150;
					//setSaldo(150)
					break;
				case 2:
					this.saldo =+ 50;
					//setSaldo(50)
					break;
			}
			this.status = true;
			//setStatus(true)
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
				//setStatus(false)
			}
		}
	}
	
	public void depositar(double valor) {
		if(this.status == true) {
			if(valor > 0) {
				saldo =+ valor;
				//setSaldo(getSaldo + valor)
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
				if(valor >= saldo) {
					saldo =- valor;
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
			if((this.saldo > mensalCP1) || (this.saldo > mensalCC2)) {
				switch(this.tipoConta) {
					case 1:
						saldo =- mensalCP1;
						System.out.println("\nSua mensalidade de "+ mensalCP1 +" reais foi paga!");
						break;
					case 2:
						saldo =- mensalCC2;
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
}
