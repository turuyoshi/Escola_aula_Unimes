public class Aluno {
    public int matricula;
    public String nome;
    public double nota;

    public Aluno(int matricula, String nome, double nota){
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno:\n"+
                "Matrícula: "+this.matricula+"\n"+
                "Nome: "+this.nome+"\n"+
                "Nota: "+this.nota;
    }
}
