package br.ufrn.imd.model;

import java.util.ArrayList;
import java.util.Optional;
import java.util.List;

//📚 Responsável por armazenar livros
public class Biblioteca {
	
	private List<Livro> livros = new ArrayList<>();

	public void addLivro(Livro livro) {
		livros.add(livro);
	}

	public Optional<Livro> buscarLivroDisponivelPorTitulo(String titulo) {
        return livros.stream()
                .filter(l -> l.verificarTitulo(titulo) && l.isDisponivel())
                .findFirst();
    }

    public Optional<Livro> buscarLivroPorTitulo(String titulo) {
        return livros.stream()
                .filter(l -> l.verificarTitulo(titulo))
                .findFirst();
    }

    public List<Livro> obterTodosOsLivros() {
        return livros;
    }
}