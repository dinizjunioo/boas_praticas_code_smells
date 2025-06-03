package br.ufrn.imd.model;

import java.util.ArrayList;
import java.util.Optional;
import java.util.List;

//📚 Responsável por armazenar livros
public class Biblioteca {
	
	private List<Livro> livros = new ArrayList<>();

	public void addBook(Livro livro) {
		livros.add(livro);
	}

	public Optional<Livro> findAvailableBookByTitle(String titulo) {
		return livros.stream()
             .filter(b -> b.verificarTitulo(titulo) && !b.isDisponivel())
             .findFirst();
	}

	public Optional<Livro> findBookByTitle(String title) {
		return livros.stream()
             .filter(b -> b.verificarTitulo(title))
             .findFirst();
	}

	public List<Livro> getAllBooks() {
		return livros;
	}
}