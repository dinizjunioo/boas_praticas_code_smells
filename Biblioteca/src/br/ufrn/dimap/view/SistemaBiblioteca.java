package br.ufrn.dimap.view;
import br.ufrn.imd.model.Livro;
import br.ufrn.imd.service.LivroService;

import java.util.List;
import java.util.ArrayList;

public class SistemaBiblioteca {

	// 🚨 Dado global - acessível em toda a aplicação, difícil de controlar/modificar
	public static List<Livro> biblioteca = new ArrayList<>(); 
	
	// 🚨 Nome misterioso - nome 'x' não indica propósito
	static int x = 14;

	public static void main(String[] args) {

		// 🚨 Código duplicado - mesmo trecho sendo usado em vários lugares
		biblioteca.add(new Livro("Refactoring", "Martin Fowler"));
		biblioteca.add(new Livro("Clean Code", "Robert C. Martin"));
		biblioteca.add(new Livro("Effective Java", "Joshua Bloch"));

	    LivroService ls = new LivroService();

	    // 🚨 Lista longa de parâmetros
	    ls.emprestimoLivro("Clean Code", "João", "20/05/2025", x, true, "Biblioteca Central");

	    // 🚨 Nome misterioso
	    ls.r("Refactoring");

	    // 🚨 Função longa - faz muita coisa
	    ls.printLoanReport();
	    
	}
}
