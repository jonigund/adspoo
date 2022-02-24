package ads;

public class Principal {

	public static void main(String[] args) {
		
		Notas mario = new Notas();
		mario.setNota1(9);
		mario.setNota2(10);
		mario.setFaltas(5);

		mario.resultado();
		
		mario.setNota1(2);
		mario.setFaltas(9);
		
		mario.resultado();


	}

}
