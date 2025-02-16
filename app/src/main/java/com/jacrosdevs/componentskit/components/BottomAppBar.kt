package com.jacrosdevs.componentskit.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.jacrosdevs.componentskit.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomAppBarScreen(navController: NavHostController, modifier: Modifier = Modifier) {

    var pageSelected by remember { mutableStateOf(0) }
    val pages = listOf("Home", "Search", "Account")
    val colorPages = listOf(Color.Red, Color.Blue, Color.Magenta)


    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(Screens.HomeScreen.name) }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Go Back"
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(Color.Yellow),
                title = {
                    Text(text = "Botton App Bar")
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.Green
            ) {
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    IconButton(onClick = {
                        pageSelected = 0
                    }) {
                        Icon(
                            tint = if (pageSelected == 0) colorPages[pageSelected] else Color.Black,
                            imageVector = Icons.Default.Home,
                            contentDescription = "Home"
                        )
                    }

                    IconButton(onClick = {
                        pageSelected = 1
                    }) {
                        Icon(
                            tint = if (pageSelected == 1) colorPages[pageSelected] else Color.Black,
                            imageVector = Icons.Default.Search,
                            contentDescription = "search"
                        )
                    }

                    IconButton(onClick = {
                        pageSelected = 2
                    }) {
                        Icon(
                            tint = if (pageSelected == 2) colorPages[pageSelected] else Color.Black,
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = "account"
                        )
                    }
                }

            }
        }
    ) { innerPadding ->
        Box(
            contentAlignment = Alignment.Center,
            modifier = modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(colorPages[pageSelected])
        ) {

            Text(
                text = pages[pageSelected],
                fontSize = 60.sp
            )


        }
    }

}

@Preview
@Composable
fun PreviewBottomAppBarScreen(modifier: Modifier = Modifier) {
    BottomAppBarScreen(navController = rememberNavController())
}