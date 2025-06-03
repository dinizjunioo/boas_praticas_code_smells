package br.ufrn.imd.service;
import java.util.Optional;

import br.ufrn.imd.model.Biblioteca;
import br.ufrn.imd.model.EmprestimoInfo;
import br.ufrn.imd.model.Livro;
import br.ufrn.imd.DTO.EmprestimoRequisicaoDTO;

public class BibliotecaService {
    private Biblioteca biblioteca;
    
    public BibliotecaService( Biblioteca biblioteca){
        this.biblioteca = biblioteca;
    }

    public void emprestarLivro(EmprestimoRequisicaoDTO requisicao) {
        Optional<Livro> livroOpt = biblioteca.buscarLivroDisponivelPorTitulo(requisicao.getTituloLivro());

        if (livroOpt.isPresent()) {
            Livro livro = livroOpt.get();

            EmprestimoInfo emprestimo = new EmprestimoInfo(
                requisicao.getEmprestadoPara(),
                requisicao.getDataEmprestimo(),
                requisicao.getDiasEmprestimo()
            );

            // Atualiza o livro com info de empréstimo e marca como indisponível
            Livro livroAtualizado = Livro.builder()
                .setTitulo(livro.getTitulo())
                .setAutor(livro.getAutor())
                .setEmprestimoInfo(emprestimo)
                .setDisponivel(false)
                .build();

            biblioteca.obterTodosOsLivros().remove(livro); // Remove o antigo
            biblioteca.addLivro(livroAtualizado);    // Adiciona o atualizado

            if (requisicao.deveNotificarUsuario()) {
                notificarUsuario(requisicao.getEmprestadoPara());
            }

            System.out.println("Livro emprestado: " + livroAtualizado.getTitulo());
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }

    public void devolverLivro(String tituloLivro) {
        Optional<Livro> livroOpt = biblioteca.buscarLivroPorTitulo(tituloLivro);
        if (livroOpt.isPresent()) {
            Livro livro = livroOpt.get();
            livro.LivroDevolvido(); // marca como devolvido
            System.out.println("Livro devolvido: " + livro.getTitulo());
        }
    }

    public void imprimirRelatorioEmprestimos() {
        for (Livro livro : biblioteca.obterTodosOsLivros()) {
            System.out.println("-----");
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            if (!livro.isDisponivel() && livro.getEmprestimoInfo() != null) {
                EmprestimoInfo info = livro.getEmprestimoInfo();
                System.out.println("Emprestado para: " + info.getEmprestadoPara());
                System.out.println("Data do empréstimo: " + info.getDataEmprestimo());
                System.out.println("Dias de empréstimo: " + info.getDuracaoDias());
            } else {
                System.out.println("Disponível");
            }
        }

    }
    
    private void notificarUsuario(String nomeUsuario) {
        System.out.println("Notificando " + nomeUsuario + " sobre o empréstimo do livro.");
    }

}
