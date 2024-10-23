package com.example.superherobook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superherobook.ui.theme.SuperHeroBookTheme

class MainActivity : ComponentActivity() {

    private val superheroList = ArrayList<Superhero>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SuperHeroBookTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)){

                    }
                }
            }
        }
    }

    private fun getData(){
        val superman = Superhero("Superman","DC",R.drawable.superman)
        val batman = Superhero("Batman","DC",R.drawable.batman)
        val aquaman = Superhero("Aquaman","DC",R.drawable.aquaman)
        val ironman = Superhero("Ironman","Marvel",R.drawable.ironman)
        val deadpool = Superhero("Deadpool","Marvel",R.drawable.deadpool)

        superheroList.add(superman)
        superheroList.add(batman)
        superheroList.add(aquaman)
        superheroList.add(ironman)
        superheroList.add(deadpool)

    }
}





@Preview(showBackground = true)
@Composable
fun SuperheroPreview() {
    SuperHeroBookTheme {

    }
}