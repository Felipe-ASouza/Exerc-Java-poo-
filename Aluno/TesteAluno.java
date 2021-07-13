public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("00238","Pedrinho","Desenvolvimento web");
        System.out.println("Nome do aluno: " + aluno.nome+"\n" + "R.A do aluno: " + aluno.ra+"\n" + "Curso que está matriculado: " + aluno.curso);
    }
}
