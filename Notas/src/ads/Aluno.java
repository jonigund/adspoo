package ads;

public class Aluno {
	
	String nome;
	String curso;
	Avaliacao notas;
	
	public Aluno() {
		
	}
	
	
	
	public Aluno(String nome, String curso, Avaliacao notas) {
		this.nome = nome;
		this.curso = curso;
		this.notas = notas;
	}



	void info() {
		System.out.println("Nome: "+nome);
		System.out.println("Curso: "+curso);
		System.out.println("M�dia A: "+notas.mediaAritmetica());
		System.out.println("M�dia P: "+notas.mediaPonderada());
	}

}
