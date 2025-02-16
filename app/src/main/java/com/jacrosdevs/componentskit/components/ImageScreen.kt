package com.jacrosdevs.componentskit.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.jacrosdevs.componentskit.R
import com.jacrosdevs.componentskit.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ImageScreen(navController: NavHostController ,modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(Color.Yellow),
                title = {
                    Text(text = "Image Screen")
                },
                navigationIcon = {
                   IconButton(onClick = {navController.navigate(Screens.HomeScreen.name)}) {
                       Icon(
                           imageVector = Icons.Default.ArrowBack,
                           contentDescription = "Go Back"
                       )
                   }
                }
            )
        }
    ) {innerPadding ->
        Column(modifier = modifier.padding(innerPadding)) {
            Image(
                painter = painterResource(R.drawable.bugdroid_2023),
                contentDescription = "Android",
                modifier = Modifier.size(200.dp)
            )

            HorizontalDivider(color = Color.Green)

            Text(text = "Imagenes desde Internet", fontSize = 20.sp)
            //iamgen desde internet, debes modicar el manifest para permiso d einternet
            AsyncImage(
                model = "https://somoskudasai.com/wp-content/uploads/2024/05/portada_naruto.jpg"
                , contentDescription = "Naruto"
            )



        }

    }

}

@Preview
@Composable
fun PreviewImageScreen(modifier: Modifier = Modifier) {
    ImageScreen(navController = rememberNavController())
}