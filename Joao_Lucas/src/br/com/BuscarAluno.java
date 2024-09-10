package br.com;

public class BuscarAluno {

	public static void main(String[] args) {
		String nome = "Jaiston";
		
		Thread treadAluno1 =new Thread(new TarefaBuscaNome("src/tuma1.txt",nome));
		Thread treadAluno2 =new Thread(new TarefaBuscaNome("src/turma2.txt",nome));
		Thread treadCientistas =new Thread(new TarefaBuscaNome("src/cientistas.txt",nome));

		treadAluno1.start();
		treadAluno2.start();
		treadCientistas.start();

		
		
		
	}

}
