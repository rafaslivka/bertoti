# 🚫 Composite Anti-Pattern

Este exemplo mostra **como *não* implementar o padrão Composite**.  
Ele destaca os principais erros que ocorrem quando não se utiliza uma interface ou classe base comum para os componentes, comprometendo a flexibilidade e a manutenção do código.

---

## ⚠️ Problemas Identificados

- 🔁 **Métodos redundantes:** múltiplas versões de `addMember`, uma para cada tipo de objeto.  
- 🔍 **Uso de `instanceof` e casting:** reduz a legibilidade e a segurança do código.  
- 📦 **Lista de `Object`:** ausência de uma interface comum dificulta o gerenciamento dos elementos.  
- 🚧 **Dificuldade de extensão:** novos tipos exigem alteração direta no código existente.  
- ❌ **Violação do Princípio Open/Closed:** o sistema não está aberto para extensão sem modificação.

---

## 💡 Observação

O uso incorreto do padrão Composite leva a um código rígido e frágil.  
A solução adequada é **definir uma interface comum** para todos os componentes e fazer com que os objetos concretos (folhas e composições) a implementem, eliminando duplicações e casts desnecessários.
