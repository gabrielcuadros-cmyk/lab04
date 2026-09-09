package com.example.moviecounter

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun EjemploTextField() {
    OutlinedTextField(value = "", onValueChange = {}, label = { Text("Texto") })
}