package ads;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu palpite: ");
		
		int palpite = teclado.nextInt();
		
				
		while(palpite!=10000) {
			
						
			if(palpite <10000) {
				System.out.println("um pouco mais!...");
			}
			else {
				System.out.println("um pouco menos!...");
			}
			System.out.println("Digite o proximo palpite: ");
			palpite = teclado.nextInt();
		}
		
			
		System.out.println("Acerto miseravi!");

	}

}
}
