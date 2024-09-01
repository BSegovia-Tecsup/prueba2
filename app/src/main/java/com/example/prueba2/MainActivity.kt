package com.example.prueba2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
<<<<<<< HEAD
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
=======
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
>>>>>>> Upgrading1
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import com.example.prueba2.ui.theme.Prueba2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prueba2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ViewHolaCurso() // Cambié Greeting por ViewHolaCurso
                }
            }
        }
    }
}

class Greeting(name: String, modifier: Modifier) {

}

@Composable
fun ViewHolaCurso() {
    Column(
        modifier = Modifier
            .fillMaxSize()
<<<<<<< HEAD
            .padding(16.dp)
            .background(Color(0xFFE3F2FD)), // Fondo azul claro
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center // Centrar verticalmente
=======
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
>>>>>>> Upgrading1
    ) {
        Text(
            text = "Welcome to the Course!",
            fontSize = 28.sp,
<<<<<<< HEAD
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1976D2) // Color azul
=======
            fontWeight = FontWeight.Bold
>>>>>>> Upgrading1
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Hello, Student!",
<<<<<<< HEAD
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF424242) // Color gris oscuro
=======
            fontSize = 20.sp
>>>>>>> Upgrading1
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewViewHolaCurso() {
<<<<<<< HEAD
    ViewHolaCurso() // Asegúrate de que esta función está definida
=======
    ViewHolaCurso()
>>>>>>> Upgrading1
}