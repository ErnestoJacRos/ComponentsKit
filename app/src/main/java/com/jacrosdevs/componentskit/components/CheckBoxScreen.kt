package com.jacrosdevs.componentskit.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.jacrosdevs.componentskit.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheckBoxScreen(navController: NavHostController, modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {

            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(Color.Yellow),
                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigate(Screens.HomeScreen.name)
                    }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Go Back"
                        )
                    }
                },
                title = { Text(text = "CheckBox Screen") }
            )
        }
    ) { innerPadding ->
        Column(modifier = modifier.padding(innerPadding)) {
            var checkedValue by remember { mutableStateOf(false) }

            var checkedValueTwo by remember { mutableStateOf(false) }


            Checkbox(
                checked = checkedValue,
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Yellow,
                    uncheckedColor = Color.Green,
                    checkmarkColor = Color.Blue
                ),
                //para cambiar el tamanha del checkbox debes usar las propiedades de modifier
                // , scale y size
                modifier = Modifier
                    .scale(4F)
                    .size(100.dp),
                onCheckedChange = {
                    checkedValue = it
                }
            )

            HorizontalDivider(
                modifier = Modifier.padding(vertical  = 80.dp),
                color = Color.Yellow,
                thickness = 3.dp
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                //.clickable { checkedValueTwo = !checkedValueTwo },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = checkedValueTwo,
                    colors = CheckboxDefaults.colors(
                        checkedColor = Color.Yellow, uncheckedColor = Color.Green,
                        checkmarkColor = Color.Blue
                    ),
                    //para cambiar el tamanha del checkbox debes usar las propiedades de modifier
                    // , scale y size
                    modifier = Modifier
                        .scale(4F)
                        .size(100.dp),
                    onCheckedChange = {
                        checkedValueTwo = it
                    }
                )

                Text(
                    text = "CheckBox Two",
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
            HorizontalDivider(color = Color.Yellow, thickness = 3.dp)

        }

    }
}

@Preview
@Composable
fun PreviewCheckBoxScreen(modifier: Modifier = Modifier) {
    CheckBoxScreen(navController = rememberNavController())
}