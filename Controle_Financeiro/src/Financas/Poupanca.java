package Financas;

public class Poupanca {
	
	private String objetivo;
	private double valor_poupar;
	private int quant_temp;
	private double juros_ganho;
	
	public Poupanca(String o,double v,int q, double j) {
		objetivo=o;
		valor_poupar=v;
		quant_temp=q;
		juros_ganho=j;
	}
	

	public String getObjetivo() {
		return objetivo;
	}


	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}


	public double getValor_poupar() {
		return valor_poupar;
	}


	public void setValor_poupar(double valor_poupar) {
		this.valor_poupar = valor_poupar;
	}


	public int getQuant_temp() {
		return quant_temp;
	}


	public void setQuant_temp(int quant_temp) {
		this.quant_temp = quant_temp;
	}


	public double getJuros_ganho() {
		return juros_ganho;
	}


	public void setJuros_ganho(double juros_ganho) {
		this.juros_ganho = juros_ganho;
	}


	public Poupanca() {
		// TODO Auto-generated constructor stub
	}

}
