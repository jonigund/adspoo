package ads;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu peso:");
				
		float peso = teclado.nextFloat();
		
		System.out.println("Digite a sua altura:");
		
		float altura = teclado.nextFloat();
		
		float imc = peso/(altura*altura);
		
		System.out.println("Seu IMC é de: "+imc);
		

	}

}
