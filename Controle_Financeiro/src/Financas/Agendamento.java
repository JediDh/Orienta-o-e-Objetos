package Financas;

import java.util.Date;

public class Agendamento {
	
	private Date vencimento;
	private double valor_conta;
	
	public Agendamento(Date ve, double v) {
	
		vencimento=ve;
		valor_conta=v;
		
	}
	
	public double getValor_conta() {
		return valor_conta;
	}


	public void setValor_conta(double valor_conta) {
		this.valor_conta = valor_conta;
	}
	
	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	
	
	
}
