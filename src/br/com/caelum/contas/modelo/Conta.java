package br.com.caelum.contas.modelo;

public class Conta {
	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;
	private Data dataAbertura;
	private static int contabilizadorConta = 0;
	
	public static int getContabilizadorConta() {
		return contabilizadorConta += 1;
	}

	public Conta(String titular){
		this.titular = titular;
	}
	
	public Conta(String titular, int numero){
		this(titular);
		this.numero = numero;
	}
	
	public Conta(){
		
	}
	
	public void saca(double valor) {
		if(this.saldo >= valor) {
			//try {
				this.saldo -= valor;
			}
			//catch (RuntimeException e){
				System.out.println("Seu saldo é insuficiente" );
			
			//}
		}
		
	//}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public double calculaRendimento() {
		return saldo += this.saldo * 0.1;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Data getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public double getSaldo() {
		return saldo;
	}

	public String recuperaDadosParaImpressao() {
		String dados = "Titular " + this.titular;
		dados += "\nNumero " + this.numero;
		dados += "\nAgencia " + this.agencia;
		dados += "\nSaldo " + this.saldo;
		dados += "\nData de abertura: " + this.dataAbertura.formatada();
		 
		return dados;
	}
	
	
}
