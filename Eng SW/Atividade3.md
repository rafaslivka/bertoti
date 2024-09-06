Projeto de Testes Automatizados em Java
Descrição
Este projeto é uma atividade prática da aula de 19/08, com o objetivo de criar e testar duas classes em Java: Aluno e SalaAula. O projeto inclui a implementação de um sistema simples para gerenciar informações de alunos e realizar testes automatizados utilizando JUnit.

Objetivo
Recriar as classes SalaAula e Aluno com um exemplo próprio.
Realizar testes automatizados para garantir o funcionamento correto das funcionalidades implementadas.
Estrutura do Projeto
Classes
Aluno
Representa um aluno com nome e RA (Registro Acadêmico).

java
Copiar código
public class Aluno {

    private String nome;
    private String ra;

    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }
}
SalaAula
Gerencia uma lista de alunos, com funcionalidades para cadastrar alunos e buscar alunos por nome.

java
Copiar código
import java.util.List;
import java.util.LinkedList;

public class SalaAula {

    private List<Aluno> alunos = new LinkedList<Aluno>();

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> buscarAlunoPorNome(String nome) {
        List<Aluno> alunosEncontrados = new LinkedList<Aluno>();
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) 
                alunosEncontrados.add(aluno);
        }
        return alunosEncontrados;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
Testes Automatizados
Utilizando JUnit para validar as funcionalidades da classe SalaAula.

java
Copiar código
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

class Teste {

    @Test
    void test() {
        SalaAula fatec = new SalaAula();

        Aluno joao = new Aluno("Joao", "54321");
        Aluno jose = new Aluno("Jose", "12345");

        fatec.cadastrarAluno(joao);
        fatec.cadastrarAluno(jose);

        assertEquals(fatec.getAlunos().size(), 2);

        List<Aluno> joseses = fatec.buscarAlunoPorNome("Jose");
        assertEquals(joseses.get(0).getRa(), jose.getRa());
    }
}
