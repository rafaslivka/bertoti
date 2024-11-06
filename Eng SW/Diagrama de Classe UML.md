Diagrama de Classe UML
Este documento apresenta o diagrama de classe UML para representar a estrutura de código das classes Aluno, SalaAula e Teste, em um cenário onde temos uma lista de alunos cadastrados em uma sala de aula e a possibilidade de realizar buscas pelo nome dos alunos.

Estrutura das Classes
Classe Aluno: Representa os alunos com nome e ra como atributos, além de métodos para acessar esses dados.
Classe SalaAula: Gerencia uma lista de alunos, com métodos para cadastrar novos alunos e buscar alunos por nome.
Classe Teste: Contém métodos de teste para validar as operações da classe SalaAula.
Diagrama de Classe UML
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

