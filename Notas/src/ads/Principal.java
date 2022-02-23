package ads;

public class Principal {

	public static void main(String[] args) {
		
		
		//jeito com instancia vazia
		Avaliacao zeca = new Avaliacao();
		zeca.n1 = 8;
		zeca.n2 = 3;
		zeca.n3 = 7.5;
		System.out.println("Zeca:");
		System.out.println("Media Aritmética: " + zeca.mediaAritmetica());
		System.out.println("Media Ponderada: " + zeca.mediaPonderada());
		
		Avaliacao mario = new Avaliacao(7,4,10);
		System.out.println("Mario:");
		System.out.println("Media Aritmética:" + mario.mediaAritmetica());
		System.out.println("Media Ponderada:" + mario.mediaPonderada());
		
		Aluno a1 = new Aluno("Mario","Encanador", new Avaliacao(9,10,3));
		Aluno a2 = new Aluno("Luigi","Encanador", new Avaliacao(4,1,10));
		
		a1.info();
		a2.info();
	}

}
