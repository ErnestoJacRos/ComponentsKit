package com.jacrosdevs.componentskit.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.jacrosdevs.componentskit.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IndicatorScreen(navController: NavHostController, modifier: Modifier = Modifier) {

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    Color.Yellow
                ),
                title = {
                    Text(text = "Indicator Screen")
                },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(Screens.HomeScreen.name) }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Go Back"
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(modifier = modifier.padding(innerPadding)) {
            Text(text = "Circular indicator")
            HorizontalDivider(color = Color.Green)
            CircularProgressIndicator(
                modifier = Modifier.padding(16.dp),
                color = Color.Green,
                trackColor = Color.LightGray,
                strokeWidth = 5.dp
            )
            HorizontalDivider(color = Color.Green)

            var progressValue by remember { mutableStateOf(0.1F) }
            Text(text = "Progress Bar indicator", modifier = Modifier.padding(16.dp))
            LinearProgressIndicator(
                color = Color.Yellow,
                modifier = Modifier.fillMaxWidth(),
                progress = { progressValue }
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                ElevatedButton(
                    onClick = {
                        progressValue -= 0.1F
                        if (progressValue <= 0.1F) {
                            progressValue = 1F
                        }
                    },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Disminuir")
                }


                ElevatedButton(
                    onClick = {
                        progressValue += 0.1F
                        if (progressValue >= 1) {
                            progressValue = 0.1F
                        }
                    },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Aumentar")
                }

                
            }


        }
    }

}

@Preview
@Composable
fun PreviewIndicatorScreen(modifier: Modifier = Modifier) {
    IndicatorScreen(navController = rememberNavController())
}