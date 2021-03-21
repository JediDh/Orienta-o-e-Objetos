package Financas;
import java.util.Date;


public class Parcelada {
	
	private int qtd_parcelas;
	private double valor_parcela;
	private double juros;
	private Date datafinal;
	private String descricao;
	
	public Parcelada(int q, double v, double j, Date dt, String d) {
		 qtd_parcelas=q;
		 valor_parcela=v;
		 juros=j;
		 datafinal=dt;
		 descricao=d;
		
	}
	
	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	
	public double getValor_parcela() {
		return valor_parcela;
	}


	public void setValor_parcela(double valor_parcela) {
		this.valor_parcela = valor_parcela;
	}


	

	public int getQtd_parcelas() {
		return qtd_parcelas;
	}


	public void setQtd_parcelas(int qtd_parcelas) {
		this.qtd_parcelas = qtd_parcelas;
	}


	public double getJuros() {
		return juros;
	}


	public void setJuros(double juros) {
		this.juros = juros;
	}


	public Date getDatafinal() {
		return datafinal;
	}


	public void setDatafinal(Date datafinal) {
		this.datafinal = datafinal;
	}


	

}
