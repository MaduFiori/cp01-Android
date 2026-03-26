# CP01 - App de Navegação com Jetpack Compose

Este aplicativo Android foi feito com Jetpack Compose e implementa navegação entre telas de Login, Menu, Pedidos e Perfil.

## Funcionalidades

- Tela de Login com botão de acesso ao Menu
- Tela de Menu com navegação para Pedidos e Perfil
- Tela de Pedidos para visualização e gerenciamento
- Tela de Perfil com informações do usuário

# Checkpoint 1 - Documentação do Projeto

## Descrição do projeto

Este projeto é um aplicativo Android desenvolvido com Jetpack Compose que apresenta navegação entre quatro telas principais: Login, Menu, Pedidos e Perfil. O app demonstra o uso do NavHost e rotas com `composable` para gerenciar a navegação interna.

## Objetivo da prova

O objetivo desta prova é avaliar a capacidade de desenvolver um aplicativo Android moderno usando Jetpack Compose, implementando navegação funcional entre telas, uso correto de temas e componentes visuais, além de organização de código em pacotes e arquivos separados para telas.

## Explicação de cada commit

1. Passagem de múltiplos parâmetros

Este commit implementa o envio de mais de uma informação entre telas do aplicativo. Em vez de passar apenas um dado, a aplicação passa a suportar múltiplos parâmetros simultaneamente, permitindo uma comunicação mais completa entre as Activities.

2. Inserindo valor ao parâmetro opcional na tela de Pedidos

Neste commit, é definido um valor para um parâmetro opcional na tela de pedidos. Isso significa que, mesmo não sendo obrigatório, o parâmetro pode ser preenchido para alterar o comportamento da tela, como aplicar um desconto ou configurar alguma informação adicional.

3. Passagem de parâmetros opcionais na tela de Pedidos

Este commit implementa o tratamento de parâmetros opcionais, permitindo que a tela funcione corretamente mesmo quando certos dados não são enviados. Dessa forma, a aplicação se torna mais flexível e evita erros causados pela ausência de informações não essenciais.

4. Passagem de parâmetros obrigatórios na tela de Perfil


## Telas do Aplicativo

### Tela de Login
![Tela Login](app/src/imagens/login.png)

### Tela de Menu
![Tela Menu](app//srcimagens/menu.png)

### Tela de Pedidos
![Tela Pedidos](app/src/imagens/pedidos.png)

### Tela de Perfil
![Tela Perfil](app/src/imagens/perfil.png)

## Tecnologias

- Kotlin
- Jetpack Compose
- Navigation Compose
