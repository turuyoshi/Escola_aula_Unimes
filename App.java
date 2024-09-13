public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Aluno aluno = new Aluno(1, "Arthur Turuyoshi", 10);
        Aluno aluno2 = new Aluno(2, "Pedro Queixada", 0);
        Aluno aluno3 = new Aluno(3, "Jones Piter", 9);
        Aluno aluno4 = new Aluno(4, "Gabi", 1);

        //System.out.println(aluno);
        //System.out.println(aluno2);

        Aluno[] estudantesADS = {aluno,aluno2};
        Turma turma = new Turma("ADS", estudantesADS);

        Aluno[] estudantesFI = {aluno3};
        Turma turma2 = new Turma("Fisioterapia", estudantesFI);

        Aluno[] estudantesSI = {aluno4};
        Turma turma3 = new Turma("Sistema da Informação", estudantesSI);

        //turma.exibirAlunos();
        //turma2.exibirAlunos();
        //turma3.exibirAlunos();

        Turma [] turmas = {turma, turma2, turma3};

        Escola unimes = new Escola("UNIMES", turmas);

        unimes.exibirAlunosPorTurma();
    }
}
