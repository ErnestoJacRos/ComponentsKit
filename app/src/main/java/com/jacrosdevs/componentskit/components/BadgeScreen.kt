package com.jacrosdevs.componentskit.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.jacrosdevs.componentskit.Screens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BadgeScreen(navController: NavHostController, modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(Color.Yellow),
                title = {
                    Text(text = "Badge Screen")
                },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(Screens.HomeScreen.name) }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Go Back"
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {

            var countNotification by remember { mutableStateOf(0) }

            BadgedBox(
                modifier = Modifier.padding(vertical = 16.dp),
                badge = {
                    Badge(
                        containerColor = Color.Blue,
                        contentColor = Color.White
                    ) {
                        Text(text = if(countNotification <= 20) countNotification.toString() else "99+")
                    }
                }
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notification"
                    )
                    Text(text = "Notifications")
                }
            }

            Button(onClick = {
                countNotification ++
            }) {
                Text(text = "Incrementar Notificaciones")
            }

        }
    }
}


@Preview
@Composable
fun PreviewBadgeScreen(modifier: Modifier = Modifier) {
    BadgeScreen(navController = rememberNavController())
}