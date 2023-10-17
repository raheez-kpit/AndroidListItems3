package com.example.list_tiles

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Composable
fun ListTiles(names: List<String>) {
    LazyColumn() {

        items(names) { a ->
            Text(text = a, fontSize = 20.sp, modifier = Modifier.padding(16.dp))
            Divider()
        }
    }
}