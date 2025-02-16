package com.jacrosdevs.componentskit.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.jacrosdevs.componentskit.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardsScreen(navController: NavHostController, modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(Color.Yellow),
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(Screens.HomeScreen.name) }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Go Back"
                        )
                    }
                },
                title = {
                    Text(text = "Cards Screen")
                }
            )
        }
    ) { innerPadding ->
        Column(modifier = modifier.padding(innerPadding)) {

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(state = rememberScrollState())
            ) {
                Card(
                    border = BorderStroke(3.dp, Color.Red),
                    colors = CardDefaults.cardColors(Color.Green),
                    elevation = CardDefaults. cardElevation(100.dp),
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                    // .height(200.dp)
                ) {
                    AsyncImage(
                        model = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Victoria_Justice_2013.jpg/640px-Victoria_Justice_2013.jpg",
                        contentDescription = "Victoria Justice"
                    )
                    Text(
                        textAlign = TextAlign.Center,
                        text = "Hola Cards....!",
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    )
                }

                //Second
                Card(
                    elevation = CardDefaults. cardElevation(25.dp),
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                    // .height(200.dp)
                ) {
                    AsyncImage(
                        model = "https://hips.hearstapps.com/hmg-prod/images/antman-quantumania-66575155e4d5d.jpg?crop=1xw:1xh;center,top&resize=980:*",
                        contentDescription = "Avengers"
                    )
                    Text(
                        textAlign = TextAlign.Center,
                        text = "Avangers",
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    )
                }


                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                    // .height(200.dp)
                ) {
                    AsyncImage(
                        model = "https://hips.hearstapps.com/hmg-prod/images/antman-quantumania-66575155e4d5d.jpg?crop=1xw:1xh;center,top&resize=980:*",
                        contentDescription = "Avengers"
                    )
                    Text(
                        textAlign = TextAlign.Center,
                        text = "Avangers",
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    )
                }


                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                    // .height(200.dp)
                ) {
                    AsyncImage(
                        model = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Victoria_Justice_2013.jpg/640px-Victoria_Justice_2013.jpg",
                        contentDescription = "Victoria Justice"
                    )
                    Text(
                        textAlign = TextAlign.Center,
                        text = "Hola Cards....!",
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    )
                }

                //Second
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                    // .height(200.dp)
                ) {
                    AsyncImage(
                        model = "https://hips.hearstapps.com/hmg-prod/images/antman-quantumania-66575155e4d5d.jpg?crop=1xw:1xh;center,top&resize=980:*",
                        contentDescription = "Avengers"
                    )
                    Text(
                        textAlign = TextAlign.Center,
                        text = "Avangers",
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    )
                }


                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                    // .height(200.dp)
                ) {
                    AsyncImage(
                        model = "https://hips.hearstapps.com/hmg-prod/images/antman-quantumania-66575155e4d5d.jpg?crop=1xw:1xh;center,top&resize=980:*",
                        contentDescription = "Avengers"
                    )
                    Text(
                        textAlign = TextAlign.Center,
                        text = "Avangers",
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    )
                }
            }


        }
    }

}


@Preview
@Composable
fun PreviewCardsScreen(modifier: Modifier = Modifier) {
    CardsScreen(navController = rememberNavController())
}