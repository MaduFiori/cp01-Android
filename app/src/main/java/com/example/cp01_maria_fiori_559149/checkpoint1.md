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

## Explicação de cada evolução implementada

1. **Configuração do ambiente e dependências**  
   Configuramos o projeto para usar Kotlin, Jetpack Compose e Navigation Compose com as versões corretas das bibliotecas, garantindo compatibilidade e ausência de conflitos.

2. **Implementação da MainActivity com NavHost**  
   Criamos a `MainActivity` que contém o `NavHost` para controlar as rotas das telas, definindo o ponto inicial como a tela de Login.

3. **Criação das telas composable**  
   Desenvolvemos quatro funções composable (`telaLogin`, `telaMenu`, `telaPedidos` e `telaPerfil`) que representam as telas do app, cada uma com sua UI e lógica de navegação.

4. **Configuração da navegação entre telas**  
   Implementamos a navegação usando o `NavController` para mover entre as telas conforme o usuário interage, como o botão "Entrar" na tela de Login que direciona para o Menu.

5. **Aplicação do tema Material 3 e design básico**  
   Aplicamos o tema padrão do Material 3 para garantir uma interface moderna, além de configurar cores e estilos básicos em cada tela.

---

Se quiser, posso ajudar a gerar esse arquivo pronto para você só copiar e colar — é só avisar!

## Telas do Aplicativo

### Tela de Login
![Tela Login](imagens/login.png)

### Tela de Menu
![Tela Menu](imagens/menu.png)

### Tela de Pedidos
![Tela Pedidos](imagens/pedidos.png)

### Tela de Perfil
![Tela Perfil](imagens/perfil.png)

## Tecnologias

- Kotlin
- Jetpack Compose
- Navigation Compose