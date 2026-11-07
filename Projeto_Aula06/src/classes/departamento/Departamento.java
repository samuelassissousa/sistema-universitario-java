package classes.departamento;

import classes.curso.Curso;

public class Departamento {
    private String nome;
    private Curso curso;

    public Departamento() {}

    public Departamento(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    @Override
    public String toString() {
        String infoCurso = (curso != null) ? curso.toString() : "Nenhum curso associado.";
        return "Departamento: " + nome + "\n" + infoCurso;
    }
}