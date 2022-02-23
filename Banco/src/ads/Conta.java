package ads;

public class Conta {
	int numero;
	String titular;
	double saldo;
	double limite;
	double transferir;
	
	
	
	public Conta(int numero, String titular, double saldo, double limite, double transferir) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
		this.transferir = transferir;
	}

	boolean saque(double valor) {
		if(valor>limite || valor>saldo || valor <=0) {
			return false;
		}
		saldo -= valor;
			return true;
	}
	
	boolean deposito(double valor) {
		if(valor<=0) {
			return false;
		}
		saldo += valor;
			return true;
	}
	
	boolean transferir(double valor) {
		if(valor>limite || valor>saldo || valor <=0) {
			return false;
		}
		saldo -= valor;
			return true;
	}
	
	void info() {
		System.out.println("Nome: "+titular);
		System.out.println("Número: "+numero);
		System.out.println("Saldo: "+saldo);
		System.out.println("Limite: "+limite);
	}

}
