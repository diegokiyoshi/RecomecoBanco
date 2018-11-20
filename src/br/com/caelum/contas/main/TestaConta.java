package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;


public class TestaConta {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Data dataAbert = new Data();
		dataAbert.setDia(12);
		dataAbert.setMes(10);
		dataAbert.setAno(2018);
		conta1.setDataAbertura(dataAbert); // sem get e set essa linha ficaria assim (conta1.dataAbertura = dataAbert)
		
		
		
//		conta1.dataAbertura.mes = 12;
//		conta1.dataAbertura.ano = 2018;
		
		conta1.setTitular("Diego");
		conta1.setAgencia("1234");
		conta1.setNumero(4564);
		conta1.deposita(1000.00);
		conta1.saca(1500);
		conta1.calculaRendimento();
		
		
		
		/*conta1.dataAbertura.dia = 16;
		conta1.dataAbertura.mes = 12;
		conta1.dataAbertura.ano = 2018;*/
		
		System.out.println(conta1.recuperaDadosParaImpressao());
		System.out.println(conta1.getContabilizadorConta());
		
		Conta conta2 = new Conta("Diego");
		Data dataAbertura2 = new Data();
		
		conta2.setDataAbertura(dataAbertura2);
		dataAbertura2.setDia(13);
		dataAbertura2.setMes(04);
		dataAbertura2.setAno(2018);
		
		System.out.println(conta2.recuperaDadosParaImpressao());
		System.out.println(conta2.getTitular());
		System.out.println(conta2.getContabilizadorConta());
		
		Conta conta3 = new Conta("Raquel", 345);
		Data dataAbertura3 = new Data();
		
		dataAbertura3.setDia(13);
		dataAbertura3.setMes(04);
		dataAbertura3.setAno(2018);
		
		conta3.setDataAbertura(dataAbertura3);
		
		System.out.println(conta3.recuperaDadosParaImpressao());
		System.out.println(conta3.getTitular());
		System.out.println(conta3.getContabilizadorConta());
		
		Conta conta4 = new Conta();
		Data data4 = new Data();
		
		conta4.setTitular("Rodrigo");
		conta4.setAgencia("1234");
		conta4.setNumero(56789);
		conta4.deposita(1000.00);
		
		conta4.setDataAbertura(data4);
		
		data4.setDia(13);
		data4.setMes(11);
		data4.setAno(2018);
		
		System.out.println(conta4.recuperaDadosParaImpressao());

		
	}

}
