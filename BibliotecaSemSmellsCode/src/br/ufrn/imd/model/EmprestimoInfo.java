package br.ufrn.imd.model;

public class EmprestimoInfo {

    private String emprestadoPara;
    private String dataEmprestimo;
    private int duracaoDias;

    public EmprestimoInfo(String emprestadoPara, String dataEmprestimo, int duracaoDias) {
        this.emprestadoPara = emprestadoPara;
        this.dataEmprestimo = dataEmprestimo;
        this.duracaoDias = duracaoDias;
    }

    public String getEmprestadoPara() {
        return emprestadoPara;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public int getDuracaoDias() {
        return duracaoDias;
    }
}