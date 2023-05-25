package tj.behruz.tajikanalphabet.ui.navigation

sealed class Screens(val route: String) {
    object MainScreen : Screens("mainScreen")
    object WelcomeScreen : Screens("welcomeScreen")
}
