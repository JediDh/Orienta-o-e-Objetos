package Financas;
import java.util.Date;


public class Compra {
	
	private Parcelada parcelada;
	private Avista avista;
	private Poupanca poupanca;
	private Agendamento agendamento;
	private double valor;
	private Date data_compra;
	private String descricao;
	
	
	public Compra() {
		
	}
	
	
	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public Date getData_compra() {
		return data_compra;
	}


	public void setData_compra(Date data_compra) {
		this.data_compra = data_compra;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	
	
	
	public Parcelada getParcelada() {
		return parcelada;
	}


	public void setParcelada(Parcelada parcelada) {
		this.parcelada = parcelada;
	}


	public Avista getAvista() {
		return avista;
	}


	public void setAvista(Avista avista) {
		this.avista = avista;
	}


	public Poupanca getPoupanca() {
		return poupanca;
	}


	public void setPoupanca(Poupanca poupanca) {
		this.poupanca = poupanca;
	}


	public Agendamento getAgendamento() {
		return agendamento;
	}


	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}



	

	

}
