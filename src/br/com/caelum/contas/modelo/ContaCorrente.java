package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta{
	
	@Override
	public void saca(double valor) {
		if(valor > saldo) {
			System.out.println("Saldo insuficiente");
		}else {
			saldo -= valor + 10;
		}
	}

}
