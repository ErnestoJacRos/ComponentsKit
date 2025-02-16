package com.jacrosdevs.componentskit.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.jacrosdevs.componentskit.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SwitchScreen(navController: NavHostController, modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(Color.Yellow),
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(Screens.HomeScreen.name) }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Go back"
                        )
                    }
                },
                title = {
                    Text(text = "Switch Screen")
                }
            )
        }
    ) { innerPadding ->
        Column(modifier = modifier.padding(innerPadding)) {
            var checkedValue by remember { mutableStateOf(false) }
            var checkedValueTwo by remember { mutableStateOf(false) }


            Switch(
                thumbContent = {
                    Icon(
                        imageVector = Icons.Filled.Face,
                        contentDescription = "sss",
                        tint = Color.Yellow
                    )
                },
                modifier = Modifier.padding(16.dp),
                colors = SwitchDefaults.colors(
                   checkedThumbColor = Color.Red,
                    checkedTrackColor = Color.Green,
                    uncheckedTrackColor = Color.Red,
                    uncheckedThumbColor = Color.Green

                ),
                checked = checkedValue,
                onCheckedChange = {
                    checkedValue = it
                }
            )

            HorizontalDivider(color =Color.Green)

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Habilitar Notificaciones",
                    modifier  = Modifier.padding(16.dp)
                )
                Switch(
                    modifier = Modifier.padding(16.dp),
                    colors = SwitchDefaults.colors(Color.Green),
                    checked = checkedValueTwo,
                    onCheckedChange = {
                        checkedValueTwo = it
                    }
                )
            }

            HorizontalDivider(color =Color.Green)




        }
    }
}


@Preview
@Composable
fun PreviewSwitchScreen(modifier: Modifier = Modifier) {

    SwitchScreen(navController = rememberNavController())
}