package br.com.carros.motos.venda;

import br.com.carros.motos.carros.Carros;
import br.com.carros.motos.carros.Moto;
import br.com.carros.motos.carros.PropietarioAtualCosignacao;

public class Vendas {
	public static void main(String[] args) {
		
		Carros car1 = new Carros("gol", "wv", 2001, 1.0);
		car1.valorminimo = 8.000;
		car1.valorDeVenda(6.500);
		System.out.println();
		
		Moto mo1 = new Moto("CBR", "honda", 2005, 250);
		mo1.valorminimo = 3.000;
		mo1.valorDeVenda(4.500);
		System.out.println();
		
		PropietarioAtualCosignacao car2 = new PropietarioAtualCosignacao ("Rodrigo", 995599559, "renegage", "jeep", 2017, 1.8);
		car2.valorminimo = 39.000;
		car2.valorDeVenda(45.000);
		
	
	}

}
