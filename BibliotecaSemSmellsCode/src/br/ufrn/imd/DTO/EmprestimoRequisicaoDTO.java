package br.ufrn.imd.DTO;

public class EmprestimoRequisicaoDTO {
    private String tituloLivro;
    private String emprestadoPara;
    private String dataEmprestimo;
    private int diasEmprestimo;
    private boolean notificarUsuario;
    private String localRetirada;

    public EmprestimoRequisicaoDTO(String tituloLivro, String emprestadoPara, String dataEmprestimo, 
    int diasEmprestimo, boolean notificarUsuario, String localRetirada) {
        this.tituloLivro = tituloLivro;
        this.emprestadoPara = emprestadoPara;
        this.dataEmprestimo = dataEmprestimo;
        this.diasEmprestimo = diasEmprestimo;
        this.notificarUsuario = notificarUsuario;
        this.localRetirada = localRetirada;
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public String getEmprestadoPara() {
        return emprestadoPara;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public int getDiasEmprestimo() {
        return diasEmprestimo;
    }

    public boolean deveNotificarUsuario() {
        return notificarUsuario;
    }

    public String getLocalRetirada() {
        return localRetirada;
    }
}