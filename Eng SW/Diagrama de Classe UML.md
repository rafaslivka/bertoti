# 📘 Diagrama de Classe UML

Este documento apresenta o diagrama de classe UML para representar a estrutura de código das classes `Aluno`, `SalaAula` e `Teste`. O objetivo é gerenciar uma lista de alunos em uma sala de aula, permitindo buscas pelo nome dos alunos.

---

## 🛠️ Estrutura das Classes

- **🧑‍🎓 Classe Aluno**:
  - Representa os alunos, contendo os atributos `nome` e `ra`.
  - Métodos permitem acessar essas informações.
  
- **🏫 Classe SalaAula**:
  - Gerencia uma lista de alunos.
  - Possui métodos para cadastrar novos alunos e buscar alunos por nome.
  
- **✅ Classe Teste**:
  - Contém métodos de teste para validar as operações realizadas pela classe `SalaAula`.

---

## 📊 Diagrama de Classe UML

```plaintext
+------------------------------------+          +------------------------------------+          +------------------------------------+
|               🧑‍🎓 Aluno            |<>--------|            🏫 SalaAula            |          |              ✅ Teste              |
+------------------------------------+          +------------------------------------+          +------------------------------------+
| - nome: String                     |          | - alunos: List<Aluno>              |          | <<Test>>                           |
| - ra: String                       |          +------------------------------------+          +------------------------------------+
+------------------------------------+          | + cadastrarAluno(aluno: Aluno):    |          | + test(): void                     |
| + Aluno(nome: String, ra: String)  |          |   void                             |          +------------------------------------+
| + getNome(): String                |          | + buscarAlunoPorNome(nome: String):|          
| + getRa(): String                  |          |   List<Aluno>                      |          
+------------------------------------+          | + getAlunos(): List<Aluno>         |          
                                               +------------------------------------+
