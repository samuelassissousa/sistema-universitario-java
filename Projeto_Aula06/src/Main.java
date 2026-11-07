import classes.aluno.Aluno;
import classes.curso.Curso;
import classes.departamento.Departamento;

public class Main {
    public static void main(String[] args) {
        
        // 1. Criando o Aluno (Independente)
        Aluno aluno1 = new Aluno("Samuel Henrique Assis Sousa", "10203040");

        // 2. Criando o Curso e aplicando a AGREGAÇÃO com o Aluno
        Curso curso1 = new Curso("Análise e Desenvolvimento de Sistemas (ADS)", "ADS2026");
        curso1.setAluno(aluno1);

        // 3. Criando o Departamento e aplicando a COMPOSIÇÃO com o Curso
        Departamento departamento1 = new Departamento("FCI - Faculdade de Computação e Informática", curso1);

        // 4. Imprimindo os dados de todos os objetos associados
        System.out.println("====== ESTRUTURA UNIVERSITÁRIA ======");
        System.out.println(departamento1.toString());
        System.out.println("=====================================");
    }
}
