package com.example.cp01_maria_fiori_559149

import android.os.Bundle
import androidx.navigation.compose.composable
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.cp01_maria_fiori_559149.telasapp.telaLogin
import com.example.cp01_maria_fiori_559149.telasapp.telaMenu
import com.example.cp01_maria_fiori_559149.telasapp.telaPedidos
import com.example.cp01_maria_fiori_559149.telasapp.telaPerfil
import com.example.cp01_maria_fiori_559149.ui.theme.Cp01_maria_fiori_559149Theme

class MainActivity : ComponentActivity() {

    // Método executado quando a activity principal é criada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Faz com que a interface possa ocupar toda a tela,
        // incluindo as áreas próximas à barra de status e navegação
        enableEdgeToEdge()

        // Define o conteúdo visual da aplicação usando Jetpack Compose
        setContent {

            // Aplica o tema visual do aplicativo
            Cp01_maria_fiori_559149Theme() {

                // Scaffold é uma estrutura base para organizar a interface
                // e controlar áreas como padding interno da tela
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    // Cria e lembra o controlador de navegação do app
                    val navController = rememberNavController()

                    // NavHost é responsável por gerenciar as rotas
                    // e definir qual tela será exibida
                    NavHost(
                        navController = navController,
                        startDestination = "login",
                    ) {

                        // Define a rota da tela de login
                        composable(route = "login") {
                            telaLogin(modifier = Modifier.padding(innerPadding), navController)
                        }

                        // Define a rota da tela de menu
                        composable(route = "menu") {
                            telaMenu(modifier = Modifier.padding(innerPadding), navController)
                        }

                        // Define a rota da tela de pedidos
                        composable(route = "pedidos") {
                            telaPedidos(modifier = Modifier.padding(innerPadding), navController)
                        }

                        // Define a rota da tela de perfil
                        composable(route = "perfil") {
                            telaPerfil(modifier = Modifier.padding(innerPadding), navController)
                        }
                    }
                }
            }
        }
    }
}
