package com.jacrosdevs.componentskit.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowLeft
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Bathtub
import androidx.compose.material.icons.filled.Computer
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.sharp.Edit
import androidx.compose.material.icons.twotone.Image
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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.jacrosdevs.componentskit.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IconsScreen(
    navControler: NavHostController,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(Color.Yellow),
                navigationIcon = {
                    IconButton(onClick = { navControler.navigate(Screens.HomeScreen.name) }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Go Back"
                        )
                    }
                },
                title = {
                    Text(
                        text = "Icons Screen"
                    )
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(state = rememberScrollState())
        ) {

            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Edit",
                tint = Color.Green,
                modifier = Modifier
                    .padding(16.dp)
                    .size(50.dp)
            )
            HorizontalDivider(color = Color.Red)

            Icon(
                imageVector = Icons.Default.Face,
                contentDescription = null,
                tint = Color.Magenta,
                modifier = Modifier
                    .padding(16.dp)
                    .size(50.dp)
            )
            HorizontalDivider(color = Color.Red)
            Icon(
                imageVector = Icons.Filled.Edit,
                contentDescription = null,
                tint = Color.Magenta,
                modifier = Modifier
                    .padding(16.dp)
                    .size(50.dp)
            )
            HorizontalDivider(color = Color.Red)

            Icon(
                imageVector = Icons.Outlined.Edit,
                contentDescription = null,
                tint = Color.Magenta,
                modifier = Modifier
                    .padding(16.dp)
                    .size(50.dp)
            )

            HorizontalDivider(color = Color.Red)

            Icon(
                imageVector = Icons.Sharp.Edit,
                contentDescription = null,
                tint = Color.Magenta,
                modifier = Modifier
                    .padding(16.dp)
                    .size(50.dp)
            )
            HorizontalDivider(color = Color.Red)

            Icon(
                imageVector = Icons.AutoMirrored.Default.ArrowBack,
                contentDescription = null,
                tint = Color.Magenta,
                modifier = Modifier
                    .padding(16.dp)
                    .size(50.dp)
            )

            HorizontalDivider(color = Color.Red)
                //senhal
            Icon(
                imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
                contentDescription = null,
                tint = Color.Magenta,
                modifier = Modifier
                    .padding(16.dp)
                    .size(50.dp)
            )
            Icon(
                imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowLeft,
                contentDescription = null,
                tint = Color.Magenta,
                modifier = Modifier
                    .padding(16.dp)
                    .size(50.dp)
            )

            Icon(
                imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowLeft,
                contentDescription = null,
                tint = Color.Magenta,
                modifier = Modifier
                    .padding(16.dp)
                    .size(50.dp)
            )
            HorizontalDivider(color = Color.Red)

            Icon(
                imageVector = Icons.Default.Computer,
                contentDescription = null,
                tint = Color.Cyan,
                modifier = Modifier
                    .padding(16.dp)
                    .size(50.dp)
            )

            HorizontalDivider(color = Color.Red)

            Icon(
                imageVector = Icons.Default.Bathtub,
                contentDescription = null,
                tint = Color.Cyan,
                modifier = Modifier
                    .padding(16.dp)
                    .size(50.dp)
            )

            HorizontalDivider(color = Color.Red)

            Icon(
                imageVector = Icons.TwoTone.Image,
                contentDescription = null,
                tint = Color.Black,
                modifier = Modifier
                    .padding(16.dp)
                    .size(50.dp)
            )





        }
    }

}