package Financas;

import java.util.Date;

public abstract class Entradareceita {
	protected Date data;
	protected double valor;
	


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	

}
