package tj.behruz.alphabet.ui.navigation

sealed class Screens(val route: String) {
    object WelcomeScreen : Screens("welcomeScreen")
    object MainScreen : Screens("mainScreen")
    object DetailScreen : Screens("detailScreen/{id}")
}
