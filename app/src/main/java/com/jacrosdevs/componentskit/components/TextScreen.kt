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
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextScreens(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(Color.Yellow),
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Go Back")
                    }
                },
                title = {
                    Text(
                        text = "Text Screen"
                    )
                }
            )
        }
    ) { innerPadding ->
        Column(modifier = modifier.padding(innerPadding)) {
            Text(
                text = "This is a text",
                fontSize = 30.sp,
                modifier = Modifier.padding(16.dp)
            )
            HorizontalDivider(color = Color.Red)

            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit Lorem ipsum dolor" +
                        " sit amet, consectetur adipiscing elitLorem ipsum dolor sit amet, consectetur" +
                        " adipiscing elitLorem ipsum dolor sit amet, consectetur adipiscing elitLorem i" +
                        "psum dolor sit amet, consectetur adipiscing elit",
                modifier = Modifier.padding(16.dp)
            )
            HorizontalDivider(color = Color.Red)
            Text(
                modifier = Modifier.padding(16.dp),
                text = buildAnnotatedString {
                    append("Hola, mi nombre es ")
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp) ){
                        append("Ernesto Jacros ")
                    }
                    append("y soy ")
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Green) ){
                        append("Android ")
                    }
                    append("Developer")
                },
                fontSize = 18.sp
            )
            HorizontalDivider(color = Color.Red)
        }

    }
}
