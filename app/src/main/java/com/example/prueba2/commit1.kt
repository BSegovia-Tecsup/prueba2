package com.example.prueba2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.clickable
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.prueba2.ui.theme.Prueba2Theme

class MainActivity1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prueba2Theme {
                MyScreen()
            }
        }
    }
}

@Composable
fun MyScreen() {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            MyImage()
            Spacer(modifier = Modifier.height(16.dp))
            MyButton()
        }
    }
}

@Composable
fun MyImage() {
    Image(
        painter = painterResource(id = R.drawable.dominio_gojo_vs_sukuna), // Cambia "your_image" por el nombre de tu imagen
        contentDescription = "Descripción de la imagen",
        modifier = Modifier
            .size(200.dp) // Ajusta el tamaño según sea necesario
            .clickable { /* Acción al hacer clic en la imagen */ }
    )
}

@Composable
fun MyButton() {
    Button(onClick = { /* Acción del botón */ }) {
        Text(text = "Haz clic aquí")
    }
}

@Preview(showBackground = true)
@Composable
fun MyScreenPreview() {
    Prueba2Theme {
        MyScreen()
    }
}