package com.jacrosdevs.componentskit.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDownCircle
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
fun DropdownScreen(navController: NavHostController, modifier: Modifier = Modifier) {
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
                colors = TopAppBarDefaults.topAppBarColors(
                    Color.Yellow
                ),
                title = {
                    Text(text = "Dropdown Screen")
                }
            )
        }
    ) { innerPadding ->
        Column(modifier = modifier.padding(innerPadding)) {

            var valueField by remember { mutableStateOf("") }
            var expandedDropdown by remember { mutableStateOf(false) }

            Box (modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)) {

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = valueField,
                    onValueChange = {
                    },
                    label = { Text(text = "Selecciona un serie") },
                    trailingIcon = {
                        IconButton(onClick = { expandedDropdown = true }) {

                            Icon(
                                imageVector = Icons.Default.ArrowDropDownCircle,
                                contentDescription = "Expandir opciones"
                            )

                        }
                    }

                )

                DropdownMenu(
                    modifier = Modifier.fillMaxWidth(fraction = 0.91F),
                    expanded = expandedDropdown, onDismissRequest = {}
                ) {
                    DropdownMenuItem(
                        text = { Text(text = "The Walkind Dead") },
                        onClick = {
                            valueField = "The Walkind Dead"
                            expandedDropdown = false
                        })
                    DropdownMenuItem(
                        text = { Text(text = "Game of Thrones") },
                        onClick = {
                            valueField = "Game of Thrones"
                            expandedDropdown = false
                        })
                    DropdownMenuItem(
                        text = { Text(text = "The Boys") },
                        onClick = {
                            valueField = "The Boys"
                            expandedDropdown = false
                        })
                }
            }

        }

    }

}

@Preview
@Composable
fun PreviewDropdownScreen(modifier: Modifier = Modifier) {
    DropdownScreen(navController = rememberNavController())
}