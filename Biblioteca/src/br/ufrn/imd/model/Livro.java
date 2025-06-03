package br.ufrn.imd.model;

/**
 * 
 * perceba que a classe livro tem muitas responsabilidades
 * ela guardas informações sobre o objeto Livro mas também 
 * faz o gerenciamento tanto de emprestimo quanto de renovação.
 * 
 */
public class Livro {
	
	String titulo;
    String autor;
    boolean disponivel = false;
    String nomeDoLeitor;
    String dataEmprestimo;
    int diasEmprestimo;

    public Livro(String t, String a) {
        this.titulo = t;
        this.autor = a;
    }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public String getNomeDoLeitor() {
		return nomeDoLeitor;
	}

	public void setNomeDoLeitor(String nomeDoLeitor) {
		this.nomeDoLeitor = nomeDoLeitor;
	}

	public String getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public int getDiasEmprestimo() {
		return diasEmprestimo;
	}

	public void setDiasEmprestimo(int diasEmprestimo) {
		this.diasEmprestimo = diasEmprestimo;
	}
    
}
