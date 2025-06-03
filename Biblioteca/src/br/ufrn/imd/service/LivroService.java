package br.ufrn.imd.service;

import br.ufrn.imd.model.Livro;
import br.ufrn.imd.view.SistemaBiblioteca;

public class LivroService {
	// 🚨 Função longa + lista longa de parâmetros + obsessão por primitivos
    public void emprestimoLivro(String bookTitle, String nomeDoLeitor, String date, 
    							int dias, boolean notificacao, String location) 
    {
        for (Livro b : SistemaBiblioteca.biblioteca) {
            if (b.getTitulo().equals(bookTitle) && !b.isDisponivel()) {
            	
                b.setDisponivel(true);
                b.setNomeDoLeitor(nomeDoLeitor);
                b.setDataEmprestimo(date);
                b.setDiasEmprestimo(dias);
                
                if (notificacao) {
                    System.out.println("Notificando " + nomeDoLeitor + " sobre o empréstimo do livro.");
                }
                System.out.println("Livro emprestado: " + bookTitle);
                return;
            }
        }
        System.out.println("Livro não disponível.");
    }

    // 🚨 Nome misterioso
    public void r(String t) {
        for (Livro b : SistemaBiblioteca.biblioteca) {
            if (b.getTitulo().equals(t)) {
            	b.setDisponivel(false);
                b.setNomeDoLeitor(null);
                b.setDataEmprestimo(null);
                b.setDiasEmprestimo(0);
                System.out.println("Livro devolvido: " + t);
                return;
            }
        }
    }

    // 🚨 Função longa
    public void printLoanReport() {
        for (Livro b : SistemaBiblioteca.biblioteca) {
            System.out.println("-----");
            System.out.println("Título: " + b.getTitulo());
            System.out.println("Autor: " + b.getAutor());
            if (b.isDisponivel()) {
                System.out.println("Emprestado para: " + b.getNomeDoLeitor());
                System.out.println("Data do empréstimo: " + b.getDataEmprestimo());
                System.out.println("Dias de empréstimo: " + b.getDiasEmprestimo());
            } else {
                System.out.println("Disponível");
            }
        }
    }
}
