package ads;

public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta(111,"Mario",2000,500,0);
		
		c1.info();
		if(!c1.saque(200)) {
			System.out.println("Problema ao sacar!");
		}
		
		c1.deposito(500);
		System.out.println();
		c1.info();
		System.out.println();
		if(c1.transferir(500)) {
			System.out.println("Transferência realizada con sucesso!");
		}
		c1.info();
		
	}

}
