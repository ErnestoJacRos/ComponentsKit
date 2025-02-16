package com.jacrosdevs.componentskit.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.jacrosdevs.componentskit.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ButtonsScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {

            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(Color.Yellow),
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(Screens.HomeScreen.name) }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Default.ArrowBack,
                            contentDescription = "Go Back"
                        )
                    }
                },

                title = {
                    Text(
                        text = "Buttons Screen"
                    )
                }
            )
        }
    ) { innerPadding ->
        Column(modifier = modifier.padding(innerPadding)) {
            Box(
                modifier = Modifier
                    .background(Color.Cyan)
                    .padding(16.dp)
                    .fillMaxWidth()


            ) {
                Text(text = "IconButton")
            }

            Row {

                IconButton(
                    //se agrego un modifier para que el icon sea mas grande
                    modifier = Modifier.size(90.dp),
                    onClick = { println("Soy un IconButton") }
                ) {
                    Icon(
                        imageVector = Icons.Default.Face,
                        contentDescription = "Icon",
                        //es tamanho del icon depende del iconButton que lo contiene
                        //asi que para que el icon sea mas grande debes agregar
                        //un modifier en el IconButton no solo en el Icon
                        modifier = Modifier.size(90.dp)
                    )
                }

                IconButton(
                    //se agrego un modifier para que el icon sea mas grande
                    modifier = Modifier.size(90.dp),
                    onClick = { println("Soy un IconButton") }
                ) {
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = "Icon",
                        //es tamanho del icon depende del iconButton que lo contiene
                        //asi que para que el icon sea mas grande debes agregar
                        //un modifier en el IconButton no solo en el Icon
                        modifier = Modifier.size(90.dp),
                        tint = Color.Green
                    )
                }

                IconButton(
                    //se agrego un modifier para que el icon sea mas grande
                    modifier = Modifier.size(90.dp),
                    onClick = { println("Soy un IconButton") }
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Icon",
                        //es tamanho del icon depende del iconButton que lo contiene
                        //asi que para que el icon sea mas grande debes agregar
                        //un modifier en el IconButton no solo en el Icon
                        modifier = Modifier.size(90.dp),
                        tint = Color.Red
                    )
                }

            }

            Box(
                modifier = Modifier
                    .background(Color.Cyan)
                    .padding(16.dp)
                    .fillMaxWidth()


            ) {
                Text(text = "ElevatedButton")
            }

            ElevatedButton(
                //al modificar su size el boton se vuelve redondo
                //porque se modifica tanto ancho y alto y como por default
                //las esquinas son redondas se crea un circulo
                modifier = Modifier
                    .padding(horizontal = 50.dp, vertical = 10.dp)
                    .width(200.dp),
                elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 10.dp
                ),
                //colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
                onClick = {}
            ) {
                Text(text = "ElevatedButton")

            }


            ElevatedButton(
                //al modificar su size el boton se vuelve redondo
                //porque se modifica tanto ancho y alto y como por default
                //las esquinas son redondas se crea un circulo
                modifier = Modifier
                    .padding(horizontal = 50.dp, vertical = 10.dp)
                    .width(200.dp),
                elevation = ButtonDefaults.elevatedButtonElevation(
                    defaultElevation = 10.dp
                ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.Yellow

                ),
                onClick = {}
            ) {
                Text(
                    text = "ElevatedButton"
                )

            }

            Box(
                modifier = Modifier
                    .background(Color.Cyan)
                    .padding(16.dp)
                    .fillMaxWidth()


            ) {
                Text(
                    text = "OutLinedButton")
            }

            OutlinedButton(
                colors =ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Magenta

                ),
                border = BorderStroke(width = 5.dp, color =Color.Red),
                onClick = {}) {
                Text(
                    modifier = Modifier.padding(16.dp),
                    text = "Soy un outLined Button"
                )
            }

            Box(
                modifier = Modifier
                    .background(Color.Cyan)
                    .padding(16.dp)
                    .fillMaxWidth()


            ) {
                Text(
                    text = "FilledTonalButton")
            }

            FilledTonalButton(onClick = {}) {
                Text(
                    text = "Soy un FilledTonalButton"
                )
            }

            Box(
                modifier = Modifier
                    .background(Color.Cyan)
                    .padding(16.dp)
                    .fillMaxWidth()


            ) {
                Text(
                    text = "Filled Icon Button")
            }

            FilledIconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Face,
                    contentDescription = "Soy un Filled Icon Button"

                )
            }

            Box(
                modifier = Modifier
                    .background(Color.Cyan)
                    .padding(16.dp)
                    .fillMaxWidth()


            ) {
                Text(
                    text = "Elevated Button")
            }
            ElevatedButton(
                enabled = false,
                onClick = {}
            ) {
                Text(
                    text = "Soy un ElevatedButton"
                )
            }



        }
    }
}

@Preview
@Composable
fun PeviewButtonScreen(modifier: Modifier = Modifier) {
    ButtonsScreen(navController = rememberNavController())
}