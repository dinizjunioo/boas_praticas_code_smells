package br.ufrn.imd.model;

public class Livro 
{
    private String titulo;
    private String autor;
    private boolean disponivel;
    private EmprestimoInfo emprestimoInfo;

    public Livro (String titulo, String autor) 
    {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = false;
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

	public EmprestimoInfo getEmprestimoInfo() {
		return emprestimoInfo;
	}
	
	public void LivroDevolvido() {
        this.disponivel = false;
        this.emprestimoInfo = null;
    }

	public boolean verificarTitulo(String procurarTitulo) {
        return this.titulo.equalsIgnoreCase(procurarTitulo);
    }
	
	public void setEmprestimoInfo(EmprestimoInfo emprestimoInfo) {
		this.emprestimoInfo = emprestimoInfo;
		this.disponivel = true;
	}
}