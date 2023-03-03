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
}
