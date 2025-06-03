package br.ufrn.imd.view;

//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.ufrn.imd.DTO.EmprestimoRequisicaoDTO;
import br.ufrn.imd.model.Biblioteca;
import br.ufrn.imd.model.Livro;
import br.ufrn.imd.service.BibliotecaService;

public class SistemaBiblioteca {

	// Biblioteca "global"
    public static List<Livro> livros = new ArrayList<>();
    public static Biblioteca biblioteca = new Biblioteca();
	public static void main(String[] args) {
	    // Criando livros usando o builder
        Livro livro1 = Livro.builder()
                .setTitulo("Refactoring")
                .setAutor("Martin Fowler")
                .setDisponivel(true)
                .build();

        Livro livro2 = Livro.builder()
                .setTitulo("Clean Code")
                .setAutor("Robert C. Martin")
                .setDisponivel(true)
                .build();

        Livro livro3 = Livro.builder()
                .setTitulo("Effective Java")
                .setAutor("Joshua Bloch")
                .setDisponivel(true)
                .build();

        // Adicionando livros à biblioteca
        biblioteca.addLivro(livro1);
        biblioteca.addLivro(livro2);
        biblioteca.addLivro(livro3);

        // Criando serviço da biblioteca
        BibliotecaService servico = new BibliotecaService(biblioteca);

        // Empréstimo
        EmprestimoRequisicaoDTO requisicao = new EmprestimoRequisicaoDTO(
                "Clean Code",
                "João",
                "20/05/2025",
                14,
                true,
				"Biblioteca Central"
        );

        servico.emprestarLivro(requisicao);

        // Devolução
        servico.devolverLivro("Refactoring");

        // Relatório
        servico.imprimirRelatorioEmprestimos();
	}
}
