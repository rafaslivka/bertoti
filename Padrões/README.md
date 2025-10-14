# 📂 Padrões de Projeto  

## ✅ O que são  
Padrões de projeto são **soluções reutilizáveis para problemas recorrentes de design de software**.  
Eles ajudam a:  
- Reduzir duplicação de código.  
- Melhorar a manutenção.  
- Facilitar a evolução do sistema.  
- Diminuir o acoplamento entre classes.  

Este diretório contém exemplos em **Java** acompanhados de **UMLs** para ilustrar o uso (ou mau uso) de três padrões importantes:  
- **Strategy**  
- **Observer**  
- **Composite**  

Além disso, há exemplos de **antipadrões** (implementações rígidas ou mal estruturadas), e exemplos integrados, mostrando **como os padrões podem ser combinados**.

---

## 📂 Estrutura das pastas  

Cada subpasta contém:  
- `README.md`: explicação do padrão/antipadrão.  
- UML: diagrama ilustrando o modelo.  
- Código em Java: exemplo simples de implementação.  

### 🔹 Strategy  
- `antipattern-strategy/` → implementação rígida, sem flexibilidade.  
- `pattern-strategy/` → implementação correta usando interface e estratégias intercambiáveis, com exemplos de ataques diferentes e PUML seguindo boas práticas de design.  

### 🔹 Observer  
- `antipattern-observer/` → notificações feitas de forma acoplada e manual.  
- `pattern-observer/` → uso do padrão Observer com interfaces `Subject` e `Observer`, permitindo que múltiplos objetos recebam notificações sem acoplamento direto.  

### 🔹 Composite  
- `antipattern-composite/` → objetos sem interface comum, cliente precisa tratar casos separadamente.  
- `pattern-composite/` → uso do Composite para tratar objetos individuais e compostos da mesma forma, com PUML mostrando composição/associação.  

### 🔹 Integração  
- `strategy-observer-composite/` → exemplo unindo **Strategy + Observer + Composite** em um cenário único, mostrando personagens que podem mudar estratégias de ataque e notificar aliados, tudo com PUML atualizado.  

---

## 🌍 Aplicação real  
Esses padrões são muito usados em situações como:  
- **Strategy** → diferentes formas de pagamento em um e-commerce, ataques ou ações intercambiáveis em jogos.  
- **Observer** → notificações de eventos (YouTube, redes sociais, sistemas de alerta) ou atualização de múltiplos objetos dependentes.  
- **Composite** → estrutura de diretórios (arquivos e pastas), menus de aplicativos ou agrupamento hierárquico de objetos.  

---

👉 Este material agora inclui **novos contextos de personagens e ataques**, **PUMLs completos com composição, herança e associação**, e exemplos que **não repetem códigos anteriores**, para reforçar o aprendizado de padrões e antipadrões.
