package com.jacrosdevs.componentskit.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SliderScreen(navController: NavHostController, modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(Color.Yellow),
                title = {
                    Text(text = "Slider Screen")
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
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
            var sliderValue by remember { mutableFloatStateOf(0.9f) }

            Slider(
                colors = SliderDefaults.colors(
                    thumbColor = Color.Green,
                    activeTrackColor = Color.Yellow
                ),
                value = sliderValue,
                onValueChange = { sliderValue = it }
            )
            Text(text = sliderValue.toString(), fontSize = 50.sp)

            HorizontalDivider(
                color = Color.Green,
                thickness = 5.dp,
                modifier = Modifier.padding(16.dp)
            )

            var sliderValueTwo by remember { mutableFloatStateOf(0.0F) }

            Slider(
                steps = 5,
                colors = SliderDefaults.colors(
                    thumbColor = Color.Red,
                    activeTrackColor = Color.Blue
                ),
                value = sliderValueTwo,
                onValueChange = { sliderValueTwo = it }
            )

            Text(text = sliderValueTwo.toString(), fontSize = 40.sp)

            HorizontalDivider(
                color = Color.Green,
                thickness = 5.dp,
                modifier = Modifier.padding(16.dp)
            )
                ///Tres
            var sliderValueThree by remember { mutableFloatStateOf(0F) }

            Slider(
                steps = 9,
                valueRange = 0f..50f,
                colors = SliderDefaults.colors(
                    thumbColor = Color.Red,
                    activeTrackColor = Color.Blue
                ),
                value = sliderValueThree,
                onValueChange = { sliderValueThree = it }
            )

            Text(text = sliderValueThree.toString(), fontSize = 40.sp)

        }
    }
}

@Preview
@Composable
fun PreviewSliderScreen(modifier: Modifier = Modifier) {
    SliderScreen(navController = rememberNavController())
}