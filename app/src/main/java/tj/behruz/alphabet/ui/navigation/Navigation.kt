package tj.behruz.alphabet.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import tj.behruz.alphabet.data.source.letters
import tj.behruz.alphabet.ui.detail.AlphabetDetailScreen
import tj.behruz.alphabet.ui.main.MainScreen
import tj.behruz.alphabet.ui.welcome.WelcomeScreen

@Preview(showBackground = true)
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.WelcomeScreen.route) {
        composable(Screens.WelcomeScreen.route) {
            WelcomeScreen(navController = navController)
        }
        composable(Screens.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(Screens.DetailScreen.route, arguments = listOf(navArgument("id") {
            type = NavType.IntType
        })) { args ->
            val letterId = args.arguments?.getInt("id") ?: letters.first().id
            AlphabetDetailScreen(navController = navController, letterId)
        }
    }
}