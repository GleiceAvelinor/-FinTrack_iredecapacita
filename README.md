---

# FinTrack

O **FinTrack** é um sistema de controle de finanças pessoais desenvolvido para ser executado via console. O foco deste projeto é aplicar os conceitos de Orientação a Objetos (POO) e estruturas de dados básicas em Java, oferecendo uma solução simples e eficiente para o gerenciamento do seu orçamento.

## 🚀 Funcionalidades no Módulo Inicial

O sistema permite ao usuário realizar as seguintes operações:

* **Cadastrar entradas e saídas:** Adicione novas receitas ou despesas com facilidade.
* **Listar transações:** Visualize todas as movimentações financeiras registradas.
* **Exibir saldo atual:** Consulte o saldo consolidado de forma rápida.
* **Remover transação:** Exclua movimentações cadastradas incorretamente.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (Puro)
* **Conceitos:** Programação Orientada a Objetos (POO), coleções e tratamento de exceções.

## 🔮 Planos de Expansão

O FinTrack foi projetado para ser um sistema escalável. Futuramente, pretendemos implementar:

* Relatórios gráficos para melhor visualização dos gastos.
* Persistência de dados em banco de dados.
* Integração com APIs externas para automação.

## 📂 Estrutura do Projeto

O projeto está organizado para facilitar a manutenção e a legibilidade:

* `app`: Contém a classe principal (`Main`) para execução no console.
* `controller`: Gerencia a lógica de negócios e o fluxo das transações (`FinTracker`).
* `model`: Define a estrutura dos objetos de transação (`Transacao`).
* `exceptions`: Lida com tratamentos de erros personalizados (`EntradaInvalidaException`).

---

*Desenvolvido com dedicação por Gleice Avelino.*
