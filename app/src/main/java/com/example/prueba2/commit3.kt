package com.example.prueba2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.prueba2.ui.theme.Prueba2Theme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prueba2Theme {
                SwitchScreen() // Cambié el nombre a SwitchScreen
            }
        }
    }
}

@Composable
fun SwitchScreen() {
    var switchState by remember { mutableStateOf(false) } // Estado del Switch

    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Estado del Switch: ${if (switchState) "Activado" else "Desactivado"}")
            Spacer(modifier = Modifier.height(16.dp))
            Switch(
                checked = switchState,
                onCheckedChange = { switchState = it }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SwitchScreenPreview() {
    Prueba2Theme {
        SwitchScreen()
    }
}