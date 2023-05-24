package tj.behruz.tajikanalphabet.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import tj.behruz.tajikanalphabet.ui.main.MainScreen
import tj.behruz.tajikanalphabet.ui.welcome.WelcomeScreen

@Preview(showBackground = true)
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.WelcomeScreen.route){
        composable(Screens.WelcomeScreen.route){
            WelcomeScreen(navController = navController)
        }
        composable(Screens.MainScreen.route){
            MainScreen(navController = navController)
        }
    }
}