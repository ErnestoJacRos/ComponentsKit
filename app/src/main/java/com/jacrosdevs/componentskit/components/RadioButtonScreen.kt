package com.jacrosdevs.componentskit.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.jacrosdevs.componentskit.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RadioButtonScreen(navController: NavHostController, modifier: Modifier = Modifier) {

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
                    Text(text = "Radio Button")
                }
            )
        }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            var selectedOption by remember { mutableStateOf(false) }
            var selectedOptionTwo by remember { mutableStateOf(false) }
            var selectedOptionThree by remember { mutableStateOf(false) }
            var optionSelected by remember { mutableStateOf(1) }

            Row(verticalAlignment = Alignment.CenterVertically) {
                //option One
                RadioButton(
                    selected = selectedOption ,
                    onClick = { selectedOption = !selectedOption }
                )

                Text(text = "Option 1")
            }
            HorizontalDivider(color = Color.Green)

            //option two
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = (optionSelected == 2),
                    onClick = { optionSelected = 2 }
                )
                Text(
                    text = "Option 2",
                    modifier = Modifier.clickable { }
                )
            }

            HorizontalDivider(color = Color.Green)

            Row(verticalAlignment = Alignment.CenterVertically) {
                //option three
                RadioButton(
                    selected = (optionSelected == 3),
                    onClick = { optionSelected = 3 }
                )
                Text(
                    text = "Option 3",
                    modifier = Modifier.clickable { }
                )
            }
            HorizontalDivider(color = Color.Green)

            Row(verticalAlignment = Alignment.CenterVertically) {
                //option four
                RadioButton(
                    selected = (optionSelected == 4),
                    onClick = { optionSelected = 4 }
                )
                Text(
                    text = "Option 4",
                    modifier = Modifier.clickable { }
                )
            }
            HorizontalDivider(color = Color.Green)
            Row(verticalAlignment = Alignment.CenterVertically) {
                //option five
                RadioButton(
                    selected = (optionSelected == 5) ,
                    onClick = { optionSelected = 5 }
                )
                Text(
                    text = "Option 5",
                    modifier = Modifier.clickable { }
                )
            }
            HorizontalDivider(color = Color.Green)
            Row(verticalAlignment = Alignment.CenterVertically) {
                //option six
                RadioButton(
                    selected = (optionSelected == 6),
                    onClick = { optionSelected = 6 }
                )
                Text(
                    text = "Option 6",
                    modifier = Modifier.clickable { }
                )
            }
            HorizontalDivider(color = Color.Green)


            Text(
                text = optionSelected.toString(),
                fontSize = 50.sp,
                modifier = Modifier.padding(16.dp)
            )
            HorizontalDivider(color = Color.Green)

            RadioButton(
                colors = RadioButtonDefaults.colors(
                    selectedColor = Color.Red,
                    unselectedColor = Color.Green
                ),
                selected = false,
                onClick = {}
            )


        }

    }

}

@Preview
@Composable
fun PreviewRadioButtonScreen(modifier: Modifier = Modifier) {
    RadioButtonScreen(navController = rememberNavController())
}