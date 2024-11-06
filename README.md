Atividade 1: Comentário sobre o Livro - Diferenças Entre Programação e Engenharia de Software
O livro analisado destaca três diferenças críticas entre programação e engenharia de software: tempo, escala e trade-offs. Abaixo, discutimos essas diferenças e como elas se refletem na prática.

Diferenças Críticas
Tempo

Programação: Foca em resolver problemas específicos e de curto prazo. O desenvolvimento é focado em tarefas imediatas, com um ciclo de vida mais curto.
Engenharia de Software: Exige planejamento a longo prazo, considerando a manutenção e evolução do sistema. A gestão de tempo é crucial para garantir a sustentabilidade do software.
Escala

Programação: Frequentemente lida com projetos menores e menos complexos.
Engenharia de Software: Abrange sistemas grandes e complexos, exigindo considerações sobre escalabilidade e a capacidade da equipe de lidar com projetos em maior escala.
Trade-offs

Programação: Envolve decisões com impactos imediatos, onde os trade-offs são mais simples.
Engenharia de Software: Envolve decisões de alto impacto e complexidade, considerando o longo prazo e a adaptabilidade do sistema.
Comentário Adicional
Programar é essencialmente resolver problemas específicos. Já a engenharia de software requer um planejamento detalhado e uma abordagem holística, assegurando que o sistema e a equipe possam crescer e se adaptar ao longo do tempo.

Atividade 2: Exemplos de Trade-offs em Projetos
Nesta atividade, exploramos trade-offs em projetos de software, onde optar por uma característica geralmente significa comprometer outra. Isso ocorre, especialmente, ao equilibrar requisitos não-funcionais para atender às necessidades do sistema.

Exemplos de Trade-offs
Desempenho x Segurança

Desempenho: Focar na eficiência do sistema, melhorando a velocidade e a resposta.
Segurança: Aumentar a segurança para proteger dados e evitar vulnerabilidades.
Compromisso: Aumentar o desempenho pode tornar o sistema mais vulnerável, enquanto o excesso de segurança pode reduzir a eficiência.
Tempo x Qualidade

Tempo: Reduzir o tempo de desenvolvimento para entrega rápida.
Qualidade: Aumentar o foco na qualidade para um produto mais robusto.
Compromisso: Pressa pode reduzir a qualidade; focar na qualidade pode atrasar a entrega.
Velocidade de Entrega x Qualidade

Velocidade de Entrega: Atende rapidamente as demandas do mercado.
Qualidade: Garante que o produto final atenda aos padrões elevados.
Compromisso: Focar na velocidade pode comprometer a qualidade, enquanto garantir alta qualidade pode estender o tempo de desenvolvimento.
Atividade 3: Aula de 19/08 - Desenvolvimento e Teste das Classes SalaAula e Aluno
Nesta atividade, criamos as classes SalaAula e Aluno com um exemplo próprio, e realizamos testes automatizados utilizando JUnit.

Implementação
Classe Aluno
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
Classe SalaAula
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
Classe de Teste Teste
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
Atividade 4: Diagrama de Classe UML
Abaixo está o diagrama de classe UML para representar a estrutura das classes Aluno, SalaAula e Teste, em um contexto onde alunos são cadastrados em uma sala de aula e podem ser buscados por nome.

Estrutura das Classes
Classe Aluno: Representa os alunos, com atributos para nome e ra, e métodos de acesso.
Classe SalaAula: Gerencia uma lista de alunos, com métodos para cadastrar novos alunos e buscar alunos por nome.
Classe Teste: Contém métodos de teste para validar as operações da classe SalaAula.
Diagrama de Classe UML:

+------------------------------------+          +------------------------------------+          +------------------------------------+
|               Aluno                |          |            SalaAula                |          |              Teste                 |
+------------------------------------+          +------------------------------------+          +------------------------------------+
| - nome: String                     |          | - alunos: List<Aluno>              |          | <<Test>>                           |
| - ra: String                       |          +------------------------------------+          +------------------------------------+
+------------------------------------+          | + cadastrarAluno(aluno: Aluno):    |          | + test(): void                     |
| + Aluno(nome: String, ra: String)  |          |   void                             |          +------------------------------------+
| + getNome(): String                |          | + buscarAlunoPorNome(nome: String):|
| + getRa(): String                  |          |   List<Aluno>                      |
+------------------------------------+          | + getAlunos(): List<Aluno>         |
                                               +------------------------------------+
