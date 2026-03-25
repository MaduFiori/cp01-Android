package com.example.cp01_maria_fiori_559149.telasapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun telaLogin(modifier: Modifier = Modifier, navController: NavController) {

    // Box é um container usado para organizar elementos na tela.
    // Aqui ele ocupa a tela inteira, define a cor de fundo rosa
    // e adiciona um espaçamento interno de 32dp.
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFED145B))
            .padding(32.dp)
    ) {

        // Este texto mostra o título da tela, escrito "LOGIN".
        // Ele aparece com tamanho 24sp, em negrito e na cor branca.
        Text(
            text = "LOGIN",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        // Botão principal da tela.
        // Quando o usuário clicar em "ENTRAR",
        // ele será direcionado para a rota chamada "menu".
        Button(
            onClick = { navController.navigate("menu") },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.align(Alignment.Center)
        ) {

            // Texto exibido dentro do botão.
            // Ele mostra a palavra "ENTRAR" com tamanho 20sp e cor azul.
            Text(
                text = "ENTRAR",
                fontSize = 20.sp,
                color = Color.Blue
            )
        }
    }
}
