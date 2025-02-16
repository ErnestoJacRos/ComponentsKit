package com.jacrosdevs.componentskit.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.jacrosdevs.componentskit.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {

    Scaffold(

        topBar = {

            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(Color.Yellow),
                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigate(Screens.HomeScreen.name)
                    }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBackIosNew,
                            contentDescription = "Go Back"
                        )
                    }
                },
                title = {
                    Text(text = "TextField Screen")
                }
            )
        }
    ) { innerPaddig ->
        Column(modifier = modifier.padding(innerPaddig)) {
            var value by rememberSaveable { mutableStateOf("") }
            var valueTwo by remember { mutableStateOf("") }
            var valueThree by remember { mutableStateOf("") }
            var valueFour by remember { mutableStateOf("") }
            var valueFive by remember { mutableStateOf("") }
            var showPassword by remember { mutableStateOf(false) }

            TextField(
                modifier = Modifier.padding(16.dp),
                value = value,
                onValueChange = { newValue ->
                    value = newValue
                }
            )
            HorizontalDivider(
                color = Color.Green,
                thickness = 4.dp,
                modifier = Modifier.padding(8.dp)
            )

            TextField(

                modifier = Modifier.padding(16.dp),
                label = {
                    Text(text = "Enter your name")
                },
                value = valueTwo,
                onValueChange = { newValue ->
                    valueTwo = newValue

                }
            )

            HorizontalDivider(
                color = Color.Green,
                thickness = 4.dp,
                modifier = Modifier.padding(8.dp)
            )

            OutlinedTextField(
                modifier = Modifier.padding(16.dp),
                label = { Text(text = "Enter your Text") },
                value = valueThree,
                onValueChange = { newValue ->
                    valueThree = newValue
                }
            )
            HorizontalDivider(
                color = Color.Green,
                thickness = 4.dp,
                modifier = Modifier.padding(8.dp)
            )

            OutlinedTextField(
                modifier = Modifier.padding(16.dp),
                value = valueFour,
                onValueChange = { newValue ->
                    valueFour = newValue

                },
                singleLine = true,//para que se auna solo linea y no se expanda
                maxLines = 1
            )


            HorizontalDivider(
                color = Color.Green,
                thickness = 4.dp,
                modifier = Modifier.padding(8.dp)
            )

            OutlinedTextField(
                trailingIcon = {
                    IconButton(onClick = { showPassword = !showPassword }) {
                        Icon(
                            imageVector =
                            if (showPassword) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                            contentDescription = "Visibility of the password"
                        )
                    }
                },
                modifier = Modifier.padding(16.dp),
                label = { Text(text = "Password") },
                value = valueFive,
                onValueChange = { newValue ->
                    valueFive = newValue
                },
                singleLine = true,
                maxLines = 1,
                visualTransformation =
                    if (showPassword) VisualTransformation.None else PasswordVisualTransformation()

            )


            HorizontalDivider(
                color = Color.Green,
                thickness = 4.dp,
                modifier = Modifier.padding(8.dp)
            )

        }
    }

}

@Preview
@Composable
fun PreviewTextField(modifier: Modifier = Modifier) {
    TextFieldScreen(navController = rememberNavController())
}