// Exercício 04 - Usando o resultado do modelo "Livro" como base, crie uma classe "LivroDeBiblioteca" que representa os dados básicos de um livro de uma biblioteca que pode ser emprestado aos leitores.

package classesObjetos;

class Ex04LivroDeBiblioteca extends Ex02Livro {
    String dataDeEmprestimo;
    String dataDeDevolucao;
    double valorDaMulta;
    int idDoLivro;
    int quantosLivrosEmprestados;
}