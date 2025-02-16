package com.jacrosdevs.componentskit

sealed class Screens(val name: String) {
    object TextScreen : Screens("text")
    object HomeScreen: Screens("home")
    object IconsScreen: Screens("icons")
    object ButtonsScreen: Screens("buttons")
    object TextFieldScreen: Screens("textfield")
    object CheckBoxScreen: Screens("checkboxs")
    object SwitchScreens: Screens("switch")
    object RadioButtonScreens: Screens("radiobutton")
    object ImageScreens: Screens("image")
    object IndicatorScreen: Screens("indicator")
    object BadgeScreen: Screens("badge")
    object SliderScreen: Screens("slider")
    object DropdownScreen: Screens("dropdown")
    object CardsScreen: Screens("cards")
    object PagerScreen: Screens("pager")
    object BottomAppBarScreen: Screens("bottomappbar")
    object DrawerScreen: Screens("drawer")


}