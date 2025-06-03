package br.ufrn.imd.model;

public class Livro 
{
    private String titulo;
    private String autor;
    private boolean disponivel;
    private EmprestimoInfo emprestimoInfo;

    private Livro (Builder builder) 
    {
        this.titulo = builder.titulo;
        this.autor = builder.autor;
        this.disponivel = builder.disponivel;
		this.emprestimoInfo = builder.emprestimoInfo;
    }

	public String getTitulo() {return titulo;}
	public String getAutor() {return autor;}
	public boolean isDisponivel() {	return disponivel;}
	public EmprestimoInfo getEmprestimoInfo() {	return emprestimoInfo;}
	
	public void LivroDevolvido() {
		this.disponivel = false;
		this.emprestimoInfo = null;
	}

	public boolean verificarTitulo(String procurarTitulo) {
		return this.titulo.equalsIgnoreCase(procurarTitulo);
	}

	public static Builder builder(){
		return new Builder(); 
	}

	public static class Builder
	{
		private String titulo;
    	private String autor;
    	private boolean disponivel;
		private EmprestimoInfo emprestimoInfo;

		public Builder setTitulo(String titulo) {this.titulo = titulo; return this;}

		public Builder setAutor(String autor) {this.autor = autor; return this;}

		public Builder setDisponivel(boolean disponivel) {	this.disponivel = disponivel; return this;}

		public Builder setEmprestimoInfo(EmprestimoInfo emprestimoInfo) {
			this.emprestimoInfo = emprestimoInfo;
			this.disponivel = true;
			return this;
		}

		public Livro build(){ return new Livro(this);}
	}
}