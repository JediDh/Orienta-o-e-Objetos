package Financas;

import java.util.Date;


public class Avista {
	
	private Date data;
	private double valor;
	private String descricao;
	
	public Avista(Date da, double v,String d) {
		data=da;
		valor=v;
		descricao=d;
	}
	
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



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	
	
	

	

}
