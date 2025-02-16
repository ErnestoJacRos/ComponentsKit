package com.jacrosdevs.componentskit

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jacrosdevs.componentskit.components.BadgeScreen
import com.jacrosdevs.componentskit.components.BottomAppBarScreen
import com.jacrosdevs.componentskit.components.ButtonsScreen
import com.jacrosdevs.componentskit.components.CardsScreen
import com.jacrosdevs.componentskit.components.CheckBoxScreen
import com.jacrosdevs.componentskit.components.DrawerScreen
import com.jacrosdevs.componentskit.components.DropdownScreen
import com.jacrosdevs.componentskit.components.IconsScreen
import com.jacrosdevs.componentskit.components.ImageScreen
import com.jacrosdevs.componentskit.components.IndicatorScreen
import com.jacrosdevs.componentskit.components.PagerScreen
import com.jacrosdevs.componentskit.components.RadioButtonScreen
import com.jacrosdevs.componentskit.components.SliderScreen
import com.jacrosdevs.componentskit.components.SwitchScreen
import com.jacrosdevs.componentskit.components.TextFieldScreen
import com.jacrosdevs.componentskit.components.TextScreens

@Composable
fun NavHostController(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.HomeScreen.name
    ) {

        composable(route = Screens.HomeScreen.name) { HomeScreen(navController) }
        composable(route = Screens.TextScreen.name) { TextScreens(navController) }
        composable(route = Screens.IconsScreen.name) { IconsScreen(navController) }
        composable(route = Screens.ButtonsScreen.name) { ButtonsScreen(navController) }
        composable(route = Screens.TextFieldScreen.name) { TextFieldScreen(navController) }
        composable(route = Screens.CheckBoxScreen.name) { CheckBoxScreen(navController) }
        composable(route = Screens.SwitchScreens.name) { SwitchScreen(navController) }
        composable(route = Screens.RadioButtonScreens.name) { RadioButtonScreen(navController)}
        composable(route = Screens.ImageScreens.name) { ImageScreen(navController) }
        composable(route = Screens.IndicatorScreen.name) { IndicatorScreen(navController)}
        composable(route = Screens.BadgeScreen.name) { BadgeScreen(navController)}
        composable(route = Screens.SliderScreen.name) { SliderScreen(navController)}
        composable(route = Screens.DropdownScreen.name) { DropdownScreen(navController)}
        composable(route = Screens.CardsScreen.name) { CardsScreen(navController)}
        composable(route = Screens.PagerScreen.name) { PagerScreen(navController)}
        composable(route = Screens.BottomAppBarScreen.name) { BottomAppBarScreen(navController)}
        composable(route = Screens.DrawerScreen.name) { DrawerScreen(navController)}


    }
}