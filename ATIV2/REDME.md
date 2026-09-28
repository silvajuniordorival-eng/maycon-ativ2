Sistema de Gerenciamento de Funcionários (Java)

Este projeto é um exemplo prático em Java demonstrando conceitos fundamentais de Programação Orientada a Objetos (POO), tais como encapsulamento, overloading de construtores, getters/setters e regra de negócio para atualização e cálculo de rendimentos anuais.

📁 Estrutura do Projeto

O projeto é constituído por dois arquivos Java:

Funcionario.java: Classe de modelo que representa a entidade Funcionário.

Atributos privados: nome (String) e salario (double).

Construtores: Vazio e Sobrecarregado (String nome, double salario).

Métodos principais:

aumentarSalario(double porcentagem): Aplica um aumento percentual ao salário mensal.

calcularSalarioAnual(): Retorna o rendimento total de 13 meses de salário (incluindo o 13º).

Main.java: Classe principal para testar o funcionamento das instâncias.

Instancia dois funcionários de formas distintas.

Aplica regras de aumento salarial.

Exibe os salários mensais e anuais no terminal.

🛠️ Pré-requisitos

Para compilar e executar este programa, você precisará de:

JDK (Java Development Kit) instalado (versão 8 ou superior).

🚀 Como Compilar e Executar

Baixe ou salve os arquivos Funcionario.java e Main.java na mesma pasta.

Abra o seu terminal ou prompt de comando no diretório correspondente.

Compile as duas classes com o comando:

javac Funcionario.java Main.java


Execute a aplicação chamando a classe Main:

java Main


💻 Exemplo de Saída Esperada

Ao executar a classe Main, você verá uma saída semelhante a esta no terminal:

=== FUNCIONÁRIO 1 ===
Nome: Carlos Silva
Salário Mensal: R$ 3300.0
Salário Anual (com 13º): R$ 42900.0

=== FUNCIONÁRIO 2 ===
Nome: Ana Souza
Salário Mensal: R$ 4500.0
Salário Anual (com 13º): R$ 58500.0
O arquivo README.md foi gerado com as orientações completas sobre o projeto. Ele ajudará qualquer pessoa que abrir o seu repositório ou pasta a entender rapidamente o funcionamento e como rodar o código.