import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setCargaHoraria(10);
		curso1.setTitulo("Estrutura de Repetição");
		curso1.setDescricao("ForEach, do while...");
		
		Curso curso2 = new Curso();
		curso1.setCargaHoraria(5);
		curso1.setTitulo("Condicionais");
		curso1.setDescricao("IF else");
		
		Mentoria ment = new Mentoria();
		ment.setData(LocalDate.now());
		ment.setDescricao("Ajuda com github");
		ment.setTitulo("Pull request git ");
		
		Bootcamp boot = new Bootcamp();
		boot.setNome("Bootcamp Java developer");
		boot.setDescricao("Descrição java developer");
		boot.getConteudos().add(curso1);
		boot.getConteudos().add(curso2);
		boot.getConteudos().add(ment);
		
		Dev inacio = new Dev();
		inacio.setNome("Inacio Ribeiro");
		inacio.inscreverBootcamp(boot);
		
		System.out.print(inacio.getConteudosInscritos());
		
	}
	
}
