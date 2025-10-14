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

Além disso, há exemplos de **antipadrões** (implementações ruins ou equivocadas), para mostrar claramente os problemas que cada padrão resolve.

---

## 📂 Estrutura das pastas  

Cada subpasta contém:  
- `README.md`: explicação do padrão/antipadrão.  
- UML: diagrama ilustrando o modelo.  
- Código em Java: exemplo simples de implementação.  

### 🔹 Strategy  
- `antipattern-strategy/` → implementação rígida, sem flexibilidade.  
- `pattern-strategy/` → implementação correta usando interface e estratégias intercambiáveis.  

### 🔹 Observer  
- `anti-observer/` → notificações feitas de forma acoplada e manual.  
- `pattern-observer/` → uso do padrão Observer com interfaces `Subject` e `Observer`.  

### 🔹 Composite  
- `anti-composite/` → objetos sem interface comum, cliente precisa tratar casos separadamente.  
- `pattern-composite/` → uso do Composite para tratar objetos individuais e compostos da mesma forma.  

### 🔹 Integração  
- `strategy-observer-composite/` → exemplo unindo os três padrões em um cenário único.  

---

## 🌍 Aplicação real  
Esses padrões são muito usados em situações como:  
- **Strategy** → diferentes formas de pagamento em um e-commerce.  
- **Observer** → notificações de eventos (YouTube, redes sociais, sistemas de alerta).  
- **Composite** → estrutura de diretórios (arquivos e pastas) ou menus de aplicativos.  

---

👉 Este material foi construído como apoio didático para visualizar **o problema de não usar padrões (antipadrões)** e **a solução proposta por cada padrão**.  
