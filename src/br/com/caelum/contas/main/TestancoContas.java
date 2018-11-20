package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestancoContas {
	
	public static void main(String[] args) {
		ContaPoupanca poup = new ContaPoupanca();
		poup.deposita(1000);
		poup.saca(2000);
		
		System.out.println(poup.getSaldo());
	}
}
