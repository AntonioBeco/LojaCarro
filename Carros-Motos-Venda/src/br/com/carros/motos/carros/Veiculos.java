package br.com.carros.motos.carros;

public abstract class Veiculos extends Object {

	public double valorminimo;
	private String modelo;
	private int ano;
	private String marca;
	private double motor;

	public Veiculos(String modelo, String marca, int ano, double motor) {
	}

	public boolean valorDeVenda(double valor) {
		if (this.valorminimo <= valor) {
			 //this.valorminimo -= valor;
			System.out.println("valor permitido para a venda");
			return true;
		} else {
			System.out.println("venda não permitida, valor abaixo do de compra");
			return false;
		}
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}


}
