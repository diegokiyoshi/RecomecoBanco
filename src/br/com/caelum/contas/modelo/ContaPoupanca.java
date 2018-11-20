package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta{
	
	@Override
	public void saca(double valor) {
		if(valor < saldo) {
			try {
				saldo -= valor + 20;
			}catch (RuntimeException e){
				System.out.println("Ocorreu um erro: " + e);
			}
		}
	}

}
