package com.example.superherobook

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun SuperheroList(superheros : List<Superhero> ){
    LazyColumn(contentPadding = PaddingValues(5.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primaryContainer)


    ) {
        items(superheros){ superhero ->
            SuperheroRow(superhero = superhero)

        }

    }

}

@Composable
fun SuperheroRow(superhero: Superhero){
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(color = MaterialTheme.colorScheme.primaryContainer)
    ) {
        Text(text = superhero.name,
            style = MaterialTheme.typography.displayMedium,
            modifier = Modifier.padding(2.dp),
            fontWeight = FontWeight.Bold
        )

        Text(text = superhero.universe,
            style = MaterialTheme.typography.displaySmall,
            modifier = Modifier.padding(2.dp),
            fontWeight = FontWeight.Normal
        )
    }
}