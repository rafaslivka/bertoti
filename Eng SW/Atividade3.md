Atividade 3 - Aula de 19/08
Objetivo
Recriar as classes SalaAula e Aluno com um exemplo próprio e realizar testes automatizados.

Teste JUnit:
![image](https://github.com/user-attachments/assets/03d20c15-8f33-4302-9520-dfb9b424bb6c)

____________________________________________________________________________________________________

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
____________________________________________________________________________________________________

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
____________________________________________________________________________________________________

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

