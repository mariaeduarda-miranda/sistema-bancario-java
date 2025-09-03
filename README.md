# 💳 Sistema Bancário - Java POO

Sistema bancário simples desenvolvido em Java como atividade de consolidação dos conceitos de Programação Orientada a Objetos.

## ✨ O que o sistema faz

- Criar contas bancárias (corrente ou poupança)
- Realizar depósitos e saques
- Consultar saldos
- Listar todas as contas

## 🚀 Como usar

1. **Clone o projeto:**
   ```bash
   git clone https://github.com/mariaeduarda-miranda/sistema-bancario-java.git
   ```

2. **Execute:**
   ```bash
   javac *.java
   java Main
   ```

3. **Navegue pelo menu interativo!**

## 📝 Exemplo prático

```
========== MENU PRINCIPAL ==========
1. Criar conta (corrente ou poupança)
2. Depositar em uma conta
3. Sacar de uma conta
4. Listar todas as contas
5. Consultar saldo
6. Sair
```

**Conta Corrente:** Pode ficar no negativo até o limite  
**Conta Poupança:** Só saca se tiver saldo suficiente

## 🎯 Conceitos de POO aplicados

- **Abstração:** Classe abstrata `ContaBancaria`
- **Encapsulamento:** Atributos privados com getters/setters  
- **Herança:** `ContaCorrente` e `ContaPoupanca` herdam de `ContaBancaria`
- **Polimorfismo:** Métodos `sacar()` e `toString()` sobrescritos
- **Interface:** `OperacoesBancarias` define o contrato

## 📂 Estrutura

```
├── OperacoesBancarias.java    # Interface
├── ContaBancaria.java         # Classe abstrata
├── ContaCorrente.java         # Herda de ContaBancaria
├── ContaPoupanca.java         # Herda de ContaBancaria
├── Banco.java                 # Gerencia as contas
└── Main.java                  # Menu principal
```

## 🛠️ Tecnologias

- Java
- Scanner (entrada de dados)
- ArrayList (armazenamento)

---


**Foco:** Aplicação prática de POO em Java