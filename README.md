# Sistema Universitário - POO em Java 🎓

## 📝 Sobre o Projeto
Este repositório contém uma aplicação simples em Java desenvolvida para demonstrar a aplicação prática de relacionamentos entre classes na Programação Orientada a Objetos (POO). 

O projeto foi construído como parte dos estudos em Análise e Desenvolvimento de Sistemas, especificamente focado na disciplina de Programação de Sistemas I, e simula a estrutura básica de uma instituição de ensino.

## 🏗️ Conceitos Aplicados
O sistema mapeia o relacionamento entre `Departamento`, `Curso` e `Aluno`, aplicando as seguintes regras de negócio:

* **Composição (Losango Cheio):** Relação entre `Departamento` e `Curso`. Um curso pertence estritamente a um departamento e não existe de forma independente no sistema sem ele.
* **Agregação (Losango Vazio):** Relação entre `Curso` e `Aluno`. Um aluno está associado a um curso, mas ambos existem de forma independente (o aluno pode existir antes de se matricular e o curso existe mesmo sem alunos).

## 💻 Tecnologias e Ferramentas
* **Linguagem:** Java
* **Ambiente:** Visual Studio Code
* **Paradigma:** Programação Orientada a Objetos

## 📂 Estrutura de Diretórios
```text
src/
 ├── classes/
 │    ├── aluno/
 │    │    └── Aluno.java
 │    ├── curso/
 │    │    └── Curso.java
 │    └── departamento/
 │         └── Departamento.java
 └── Main.java
