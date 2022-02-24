package ads;

public class Notas {
	private double nota1;
	private double nota2;
	private int faltas;
	
	//-------------------------------------------------
	
	public Notas() {
		
	}
	
	public Notas(double nota1, double nota2, int faltas) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.faltas = faltas;
	}	
	
	
	//-------------------------------------------------
	
	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	
	//-------------------------------------------------


	public void setNota1(double nota) {
		if(nota<0 || nota >10) {
			System.out.println("Nota invalida!");
		}
		nota1 = nota;
		}
	
	
	public void setNota2(double nota) {
		if(nota <0 || nota >10) {
			System.out.println("Nota invalida!");
		}
		nota2 = nota;
		}
	
	//-------------------------------------------------

		
	public double getNota1() {
		return nota1;
	}
	public double getNota2() {
		return nota2;
	}
	
	//-------------------------------------------------

		
	public void resultado() {
		double media = (nota1 + nota2)/2;
		
		if(faltas >7) {
			System.out.println("Reprovado por faltas");
		}
		
		else if(media <4) {
			System.out.println("Reprovado por nota");
			
		}
		else if(media <7) {
			System.out.println("Exame final");

		}
		else {
			System.out.println("Aprovado");

		}
		System.out.println(media);
		
	}

}
