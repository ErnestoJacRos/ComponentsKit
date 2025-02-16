package com.jacrosdevs.componentskit

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Adb
import androidx.compose.material.icons.filled.ArrowDropDownCircle
import androidx.compose.material.icons.filled.AutoStories
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Inbox
import androidx.compose.material.icons.filled.LinearScale
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Pages
import androidx.compose.material.icons.filled.RadioButtonChecked
import androidx.compose.material.icons.filled.SwitchAccessShortcut
import androidx.compose.material.icons.filled.VerticalAlignBottom
import androidx.compose.material.icons.filled.WifiProtectedSetup
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun HomeScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {

            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(Color.Yellow),
                title = {
                    Text(
                        text = "Components Kit"
                    )
                }
            )
        }
    ) { innerPadding ->
        Column(modifier = modifier.padding(innerPadding).verticalScroll(state = rememberScrollState())) {
            ItemComponent(
                name = "Text",
                icon = Icons.Default.Edit,
                modifier = Modifier.clickable {
                    navController.navigate(Screens.TextScreen.name)
                }
            )

            ItemComponent(
                name = "Icons",
                icon = Icons.Default.Face,
                modifier = Modifier.clickable {
                    navController.navigate(Screens.IconsScreen.name)
                }
            )

            ItemComponent(
                name = "Buttons",
                icon = Icons.Default.Adb,
                modifier = Modifier.clickable {
                    navController.navigate(Screens.ButtonsScreen.name)
                }
            )

            ItemComponent(
                name = "TextField",
                icon = Icons.Default.AutoStories,
                modifier = Modifier.clickable {
                    navController.navigate(Screens.TextFieldScreen.name)
                }
            )

            ItemComponent(
                name = "CheckBox",
                icon = Icons.Default.CheckCircle,
                modifier = Modifier.clickable {
                    navController.navigate(Screens.CheckBoxScreen.name)
                }
            )

            ItemComponent(
                name = "Siwtch",
                icon = Icons.Default.SwitchAccessShortcut,
                modifier = Modifier.clickable {
                    navController.navigate(Screens.SwitchScreens.name)
                }
            )

            ItemComponent(
                name = "Radio Button",
                icon = Icons.Default.RadioButtonChecked,
                modifier = Modifier.clickable {
                    navController.navigate(Screens.RadioButtonScreens.name)
                }
            )

            ItemComponent(
                name = "Image",
                icon = Icons.Default.Image,
                modifier = Modifier.clickable {
                    navController.navigate(Screens.ImageScreens.name)
                }
            )

            ItemComponent(
                name = "Indicator",
                icon = Icons.Default.WifiProtectedSetup,
                modifier = Modifier.clickable {
                    navController.navigate(Screens.IndicatorScreen.name)
                }
            )

            ItemComponent(
                name = "Badge",
                icon = Icons.Default.Notifications,
                modifier = Modifier.clickable {
                    navController.navigate(Screens.BadgeScreen.name)
                }
            )

            ItemComponent(
                name = "Slider",
                icon = Icons.Default.LinearScale,
                modifier = Modifier.clickable {
                    navController.navigate(Screens.SliderScreen.name)
                }
            )


            ItemComponent(
                name = "Dropdown",
                icon = Icons.Default.ArrowDropDownCircle,
                modifier = Modifier.clickable {
                    navController.navigate(Screens.DropdownScreen.name)
                }
            )

            ItemComponent(
                name = "Cards",
                icon = Icons.Default.Inbox,
                modifier = Modifier.clickable {
                    navController.navigate(Screens.CardsScreen.name)
                }
            )

            ItemComponent(
                name = "Pager",
                icon = Icons.Default.Pages,
                modifier = Modifier.clickable {
                    navController.navigate(Screens.PagerScreen.name)
                }
            )

            ItemComponent(
                name = "Bottom App Bar",
                icon = Icons.Default.VerticalAlignBottom,
                modifier = Modifier.clickable {
                    navController.navigate(Screens.BottomAppBarScreen.name)
                }
            )

            ItemComponent(
                name = "Drawer",
                icon = Icons.Default.Menu,
                modifier = Modifier.clickable {
                    navController.navigate(Screens.DrawerScreen.name)
                }
            )

        }
    }
}
