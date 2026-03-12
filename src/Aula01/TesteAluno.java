package Aula01;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Godinho";
        aluno1.curso = "Engenharia de Software";
        aluno1.idade = 20;

        aluno1.apresentar();
    }
}
