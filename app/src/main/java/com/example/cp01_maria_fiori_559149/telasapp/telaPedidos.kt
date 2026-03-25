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
fun telaPedidos(modifier: Modifier = Modifier, navController: NavController) {

    // Box principal que ocupa toda a tela.
    // Define a cor de fundo e um espaçamento interno de 32dp.
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFA9A9A9))
            .padding(32.dp)
    ) {

        // Texto de título exibindo "PEDIDOS"
        // com tamanho 24sp, negrito e cor branca.
        Text(
            text = "PEDIDOS",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        // Botão centralizado na tela.
        // Ao clicar, o usuário volta para a tela de menu.
        Button(
            onClick = { navController.navigate("menu") },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.align(Alignment.Center)
        ) {

            // Texto dentro do botão
            Text(
                text = "Voltar",
                fontSize = 20.sp,
                color = Color.Blue
            )
        }
    }
}
