package com.example.moviecounter

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun EjemploLazyColumn() {
    LazyColumn {
        item { Text("Elemento en LazyColumn") }
    }
}