package com.jacrosdevs.componentskit.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawerScreen(navController: NavHostController, modifier: Modifier = Modifier) {

    var drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    var scope = rememberCoroutineScope()

    ModalNavigationDrawer(

        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Column(
                    modifier = Modifier

                        .fillMaxWidth(fraction = .60F)
                        .padding(16.dp)
                ) {
                    AsyncImage(
                        modifier = Modifier
                            .padding(bottom = 20.dp)
                            .clip(CircleShape)
                            .size(50.dp),
                        model = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRiRyEoMvjpErCpMUCouRSAULEUYJh2gmpmOg&s",
                        contentDescription = "Jose"
                    )

                    Text(text = "Hola Jacros", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                    Text(text = "Opcion 1", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                    Text(text = "Opcion 2", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                    Text(text = "Opcion 3", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                    Text(text = "Opcion 4", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                    HorizontalDivider(modifier = Modifier.padding(8.dp))

                    Button(
                        modifier = Modifier.padding(32.dp),

                        colors = ButtonDefaults.buttonColors(Color.Yellow),
                        onClick = { navController.popBackStack() }) {
                        Text(
                            color = Color.Black,
                            text = "Go Back",

                            )
                    }

                }
            }
        }
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    navigationIcon = {
                        IconButton(onClick = {
                            scope.launch {
                                drawerState.apply {
                                    if (isClosed) open() else close()
                                }
                            }
                        }) {
                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = "Go back"
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(Color.Yellow),
                    title = {
                        Text(text = "drawer Screen")
                    }
                )
            }
        ) { innerPadding ->
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .padding(innerPadding)
                    .fillMaxSize()
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(
                        text = "Sara Garcia",
                        fontSize = 36.sp
                    )
                }

            }
        }

    }


}

@Preview
@Composable
fun PreviewDrawerScreen(modifier: Modifier = Modifier) {
    DrawerScreen(navController = rememberNavController())
}