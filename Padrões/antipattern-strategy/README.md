# ❌ Antipattern Strategy

## ✅ O que é
É quando a lógica de comportamento (ex.: ataque de um personagem) fica **fixa dentro da classe**, sem flexibilidade para mudar ou reaproveitar.

## ❌ Problema
- Código duplicado em várias classes.
- Dificuldade de manutenção: mudar o ataque de um personagem exige editar a classe.
- Pouca reutilização de código.

## 💡 Exemplo
Um jogo onde cada personagem tem seu ataque "hardcoded" dentro da classe, sem poder trocar.
