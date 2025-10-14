# ✅ Pattern Composite

## ✅ O que é
O padrão Composite permite tratar objetos individuais e composições de objetos de maneira uniforme através de uma interface comum.

## ✨ Benefícios
- Estrutura hierárquica flexível (árvore)
- Facilita adicionar novos tipos de componentes
- Código cliente simplificado: trata folhas e composições da mesma forma
- Alta reutilização e manutenibilidade

## 💡 Exemplo
Um sistema de futebol onde jogadores individuais (Item) e grupos de jogadores (Grupo) implementam a mesma interface Componente, permitindo criar hierarquias como: Time Titular → Ataque → Jogadores.