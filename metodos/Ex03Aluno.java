//  Exercício 03 - Escreva uma classe para representar um Aluno. Adicione atributos relacionados às características
//  de um Aluno, como nome,matricula, curso que está matriculado, nome de 3 disciplinas que está cursando
//  e as notas dessas 3 disciplinas. Desenvolva um método para verificar se o aluno está aprovado
//  (nota maior ou igual a 7) em uma determinada disciplina. Escreva um programa para testar essa aula,
//  que pede as informações do aluno ao usuário e ao final informal o nome das disciplinas mostra como notas
//  e mostra se o aluno foi aprovado ou não.

package metodos;

class Ex03Aluno {
    String nome;
    int matricula;
    String curso;
    String disciplina1;
    String disciplina2;
    String disciplina3;
    float nota1;
    float nota2;
    float nota3;
    boolean aprovado;

    void verificarSituacao(float nota1, float nota2, float nota3){
        float soma = nota1 + nota2 + nota3;
        float media = soma / 3;

        if (media >= 7){
            System.out.println("Aprovado");
            aprovado = true;
        } else if (media >= 4 && media < 7) {
            System.out.println("Média final");
            aprovado = false;
        } else {
            System.out.println("Reprovado");
            aprovado = false;
        }
    }
}