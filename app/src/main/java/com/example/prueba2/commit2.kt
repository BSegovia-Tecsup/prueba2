package com.example.prueba2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.prueba2.ui.theme.Prueba2Theme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prueba2Theme {
                MainScreen() // Cambié el nombre a MainScreen para evitar conflictos
            }
        }
    }
}

@Composable
fun MainScreen() {
    Scaffold(
        floatingActionButton = { FloatingActionButtonComponent() } // Cambié el nombre a FloatingActionButtonComponent
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Pantalla Principal", style = MaterialTheme.typography.titleLarge)
        }
    }
}

@Composable
fun FloatingActionButtonComponent() {
    FloatingActionButton(onClick = { /* Acción al hacer clic */ }) {
        Icon(
            painter = painterResource(id = R.drawable.dominio_gojo_vs_sukuna), // Asegúrate de que este ícono exista
            contentDescription = "Agregar"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    Prueba2Theme {
        MainScreen()
    }
}