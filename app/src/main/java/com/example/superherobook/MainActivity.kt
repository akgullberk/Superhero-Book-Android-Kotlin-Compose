package com.example.superherobook

import android.os.Bundle
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
import com.example.superherobook.ui.theme.SuperHeroBookTheme

class MainActivity : ComponentActivity() {

    private val superheroList = ArrayList<Superhero>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SuperHeroBookTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
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

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SuperHeroBookTheme {
        Greeting("Android")
    }
}