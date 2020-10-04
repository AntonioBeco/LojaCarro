package br.com.carros.motos.carros;

public class PropietarioAtualCosignacao extends Veiculos {
	private String nome;
	private double fone;

	public PropietarioAtualCosignacao(String nome, double fone, String modelo, String marca, int ano, double motor) {
		super(modelo, marca, ano, motor);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getFone() {
		return fone;
	}

	public void setFone(double fone) {
		this.fone = fone;
	}

}
